package com.zking.ssm.mapper;

import com.zking.ssm.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserName(User user);//根据用户名查询用户

    List<String> listPermissionsByUserName(User user);//查询指定用户拥有的权限

    List<String> listRolesByUserName(User user);//查询指定用户拥有的角色
}