package com.korit.springboot_security.mapper;

import com.korit.springboot_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectByUsername(String username);
    User selectById(int userId);
    int insert(User user);
    List<User> selectAllUser();
    int updateUserById(User user);
    int deleteById(int userId);
}
