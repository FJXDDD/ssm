package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.UserMapper;
import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
import com.zking.ssm.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int doRegister(User user) {
        //md5+盐
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(user.getPassword(), salt);

        user.setLocked(1);
        user.setCreateDatetime(new Date(System.currentTimeMillis()));
        user.setSalt(salt);
        user.setPassword(credentials);
        return userMapper.insert(user);
    }

    @Override
    public String doLogin(User user) {
        return null;
    }

    @Override
    public int updatePassword(User user) {
        return 0;
    }

    @Override
    public int doResetPassword(User user) {
        return 0;
    }

    @Override
    public User loadByUsername(User user) {
        return userMapper.selectByUserName(user);
    }

    @Override
    public List<String> listPermissionsByUserName(User user) {
        return userMapper.listPermissionsByUserName(user);
    }

    @Override
    public List<String> listRolesByUserName(User user) {
        return userMapper.listRolesByUserName(user);
    }
}
