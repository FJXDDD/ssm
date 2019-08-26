package com.zking.ssm.sys.service.impl;

import com.zking.ssm.sys.mapper.UserMapper;
import com.zking.ssm.sys.model.User;
import com.zking.ssm.sys.service.IUserService;
import com.zking.ssm.sys.shiro.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    public Set<String> listPermissionsByUserName(User user) {
        return new HashSet<String>(userMapper.listPermissionsByUserName(user));
    }

    @Override
    public Set<String> listRolesByUserName(User user) {
        return new HashSet<String>(userMapper.listRolesByUserName(user));
    }
}
