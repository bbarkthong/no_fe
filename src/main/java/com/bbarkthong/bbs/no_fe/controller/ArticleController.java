package com.bbarkthong.bbs.no_fe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.bbs.no_fe.model.VO.UserVO;
import com.bbarkthong.bbs.no_fe.model.tui.*;
import com.bbarkthong.bbs.no_fe.service.ArticleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles/all")
    public GridResult GetArticles(@RequestParam Map<String, Object> params, Pageable pageable) throws Exception {

        return null;
    }

    @GetMapping("/users/all")
    public GridResult GetAllUsers(@RequestParam Map<String, Object> params, Pageable pageable) throws Exception {

        log.debug("param : {} ", params);
        boolean result = false;
        List<UserVO> list = null;

        try {
            list = articleService.findAllUser();
            result = true;
        } catch (Exception e) {
            result = false;
        }

        return GridResult.builder()
                .data(GridData.builder().contents(list).pagination(Pagination.builder().page(1).totalCount(100).build())
                        .build())
                .result(result).build();
    }
}
