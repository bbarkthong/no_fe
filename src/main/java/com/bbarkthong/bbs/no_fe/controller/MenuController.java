package com.bbarkthong.bbs.no_fe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.bbs.no_fe.model.VO.MenuAuthVO;
import com.bbarkthong.bbs.no_fe.model.VO.MenuVO;
import com.bbarkthong.bbs.no_fe.model.tui.GridData;
import com.bbarkthong.bbs.no_fe.model.tui.GridResult;
import com.bbarkthong.bbs.no_fe.model.tui.Pagination;
import com.bbarkthong.bbs.no_fe.service.MenuService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
class MenuController {

    private final MenuService menuService;

    /**
     * @return
     */
    @GetMapping("/menu/all")
    public GridResult GetAllMenu(@RequestParam Map<String, Object> params, Pageable pageable) throws Exception {

        log.debug("param : {} ", params);
        boolean result = false;
        List<MenuVO> list = null;
        String user_id = (String) params.get("user_id");

        try {
            list = menuService.findAllMenu(user_id);
            result = true;
        } catch (Exception e) {
            result = false;
        }

        return GridResult.builder()
                .data(GridData.builder().contents(list).pagination(Pagination.builder().page(1).totalCount(100).build())
                        .build())
                .result(result).build();
    }

    @GetMapping("/menu/{menu_id}/auth")
    public GridResult GetMenuAuth(@RequestParam Map<String, Object> params, Pageable pageable,
            @PathVariable("menu_id") String menu_id) throws Exception {

        log.debug("param : {} ", params);
        boolean result = false;
        List<MenuAuthVO> list = null;
        String user_id = (String) params.get("user_id");

        try {
            list = menuService.findMenuAuth(menu_id, user_id);
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