package com.zking.ssm.sys.service;

import com.zking.ssm.sys.model.User;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class IUserServiceTest extends BaseTestCase{
    @Autowired
    private IUserService userService;

    private User user;

    @Override
    public void before() throws Exception {
        super.before();
        user = new User();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("运行完成！");
    }

    @Test
    public void doRegister() throws Exception {
        user.setUsername("小米2");
        user.setPassword("111");
        userService.doRegister(user);
    }

    @Test
    public void doLogin() throws Exception {
    }

    @Test
    public void updatePassword() throws Exception {
    }

    @Test
    public void doResetPassword() throws Exception {
    }

    @Test
    public void loadByUsername() throws Exception {
    }

    @Test
    public void listPermissionsByUserName() throws Exception {
        user.setUsername("zs");
        Set<String> permissions = userService.listPermissionsByUserName(user);
        System.out.println(permissions);
    }

    @Test
    public void listRolesByUserName() throws Exception {
        user.setUsername("zs");
        Set<String> roles = userService.listRolesByUserName(user);
        System.out.println(roles);
    }

}