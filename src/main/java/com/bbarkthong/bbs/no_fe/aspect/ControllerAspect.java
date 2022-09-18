package com.bbarkthong.bbs.no_fe.aspect;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class ControllerAspect {

    /**
     * 
     * @see https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop
     */
    @Around("execution(* com..*.controller.*.*(..))")
    public Object BeforeController(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String controllerName = pjp.getSignature().getDeclaringType().getName();
        String methodName = pjp.getSignature().getName();
        Map<String, Object> params = new HashMap<String, Object>();

        try {
            request.getParameterNames().asIterator()
                    .forEachRemaining(paramName -> log.info(paramName));

            params.put("controller", controllerName);
            params.put("method", methodName);
            params.put("httpMethod", request.getMethod());
            params.put("requestURI", request.getRequestURI());
            params.put("params", paramMapToString(request.getParameterMap()));

        } catch (Exception e) {
            log.error("ControllerAspect", e);
        }

        log.info("Controller Request:{}", params);
        Object retVal = pjp.proceed();

        return retVal;
    }

    private String paramMapToString(Map<String, String[]> paramMap) {
        return paramMap.entrySet().stream()
                .map(entry -> String.format("%s -> (%s)", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(","));
    }
}
