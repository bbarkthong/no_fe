package com.bbarkthong.bbs.no_fe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.bbarkthong.bbs.no_fe.presentation.VO.MenuVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuServiceTest {

    private final MenuService menuService;

    public void findAllMenu(String user_id) {
        // given
        List<MenuVO> tmp = new ArrayList<MenuVO>();
        tmp.add(new MenuVO("menu1", "메뉴1"));
        tmp.add(new MenuVO("menu2", "메뉴2"));
        tmp.add(new MenuVO("menu3", "메뉴3"));
        tmp.add(new MenuVO("menu4", "메뉴4"));

        // when
        List<MenuVO> tmp2 = menuService.findAllMenu("bbarkthong");

        // then
        assertEquals(tmp, tmp2);
    }
}
