package com.bbarkthong.bbs.no_fe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbarkthong.bbs.no_fe.mapper.UserMapper;
import com.bbarkthong.bbs.no_fe.model.VO.UserVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final UserMapper userMapper;

    public List<UserVO> findAllUser() {
        System.out.print(userMapper.toString());
        List<UserVO> tmp = new ArrayList<UserVO>();
        tmp.add(new UserVO("0001", "박상훈", "남자"));
        tmp.add(new UserVO("0002", "송영애", "여자"));
        tmp.add(new UserVO("0003", "장동건", "남자"));
        tmp.add(new UserVO("0004", "채정안", "여자"));

        return tmp;
    }

}
