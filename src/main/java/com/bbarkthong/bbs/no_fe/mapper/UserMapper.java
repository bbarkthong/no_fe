package com.bbarkthong.bbs.no_fe.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bbarkthong.bbs.no_fe.model.VO.UserVO;

@Repository
public interface UserMapper {
    public List<UserVO> getAllUsers() throws Exception;

    public UserVO getUserById(String id) throws Exception;

    public int add(UserVO vo) throws Exception;
}
