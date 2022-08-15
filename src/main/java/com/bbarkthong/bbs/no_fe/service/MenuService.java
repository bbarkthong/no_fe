package com.bbarkthong.bbs.no_fe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbarkthong.bbs.no_fe.presentation.VO.MenuAuthVO;
import com.bbarkthong.bbs.no_fe.presentation.VO.MenuVO;

@Service
public class MenuService {

    public List<MenuVO> findAllMenu(String user_id) {
        List<MenuVO> tmp = new ArrayList<MenuVO>();
        tmp.add(new MenuVO("menu1", "메뉴1"));
        tmp.add(new MenuVO("menu2", "메뉴2"));
        tmp.add(new MenuVO("menu3", "메뉴3"));
        tmp.add(new MenuVO("menu4", "메뉴4"));
        return tmp;
    }

    public List<MenuAuthVO> findMenuAuth(String menu_id, String user_id) {
        List<MenuAuthVO> tmp = new ArrayList<MenuAuthVO>();

        tmp.add(new MenuAuthVO(menu_id, "조회"));
        tmp.add(new MenuAuthVO(menu_id, "삭제"));
        tmp.add(new MenuAuthVO(menu_id, "조회"));
        tmp.add(new MenuAuthVO(menu_id, "조회"));
        tmp.add(new MenuAuthVO(menu_id, "조회"));
        tmp.add(new MenuAuthVO(menu_id, "조회"));
        return tmp;
    }
}
