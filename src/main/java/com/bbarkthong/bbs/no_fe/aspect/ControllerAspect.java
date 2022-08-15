package com.bbarkthong.bbs.no_fe.aspect;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

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

    @Around("execution(* com..*.controller.*.*(..))")
    public Object BeforeController(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String controllerName = pjp.getSignature().getDeclaringType().getName();
        String methodName = pjp.getSignature().getName();
        Map<String, Object> params = new HashMap<String, Object>();

        try {
            params.put("controller", controllerName);
            params.put("method", methodName);
            params.put("httpMethod", request.getMethod());
            params.put("requestURI", request.getRequestURI());
            params.put("params", getParams(request));
        } catch (Exception e) {
            log.error("ControllerAspect", e);
        }

        log.info("Controller 로그:{}", params);
        Object retVal = pjp.proceed();

        return retVal;
    }

    private static Map<String, Object> getParams(HttpServletRequest request) throws Throwable {
        Map<String, Object> retVal = new HashMap<String, Object>();
        Enumeration<String> enums = request.getParameterNames();
        while (enums.hasMoreElements()) {
            String originKey = enums.nextElement();
            String key = originKey.replaceAll("\\.", "-");
            retVal.put(key, request.getParameter(key));
        }
        return retVal;
    }
}
