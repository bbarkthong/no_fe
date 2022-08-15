package com.bbarkthong.bbs.no_fe.mapper;

import java.util.List;

import com.bbarkthong.bbs.no_fe.model.VO.UserVO;

public interface UserMapper {
    public List<UserVO> getAllUsers();

    public UserVO getUserById(String id);

    public int add(UserVO vo);
}
