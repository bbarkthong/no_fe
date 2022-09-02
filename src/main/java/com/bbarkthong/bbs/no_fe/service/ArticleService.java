package com.bbarkthong.bbs.no_fe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bbarkthong.bbs.no_fe.mapper.UserRepository;
import com.bbarkthong.bbs.no_fe.model.VO.UserVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final UserRepository userRepository;

    public List<UserVO> findAllUser() throws Exception {
        List<UserVO> tmp = new ArrayList<UserVO>();
        userRepository.add(new UserVO("0001", "박상훈", "남자"));
        tmp.add(new UserVO("0002", "송영애", "여자"));
        tmp.add(new UserVO("0003", "장동건", "남자"));
        tmp.add(new UserVO("0004", "채정안", "여자"));

        return userRepository.getAllUsers();
    }

}
