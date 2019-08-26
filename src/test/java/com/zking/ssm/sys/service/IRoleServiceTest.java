package com.zking.ssm.sys.service;

import com.zking.ssm.sys.model.Role;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IRoleServiceTest extends BaseTestCase {
    @Autowired
    private IRoleService roleService;

    private Role role;

    @Override
    public void before() throws Exception {
        super.before();
        role = new Role();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("执行完成！");
    }

    @Test
    public void doGrantRoleToUser() throws Exception {
        role.setUserId(1L);
        role.setRoleId(2L);
        roleService.doGrantRoleToUser(role);
    }

    @Test
    public void doRevokeRoleFromUser() throws Exception {
        role.setUserId(1L);
        role.setRoleId(2L);
        roleService.doRevokeRoleFromUser(role);
    }

    @Test
    public void doGrantPermissionToRole() throws Exception {
        role.setRoleId(3L);
        role.setPermissionId(1L);
        roleService.doGrantPermissionToRole(role);
    }

    @Test
    public void doRevokePermissionFromRole() throws Exception {
        role.setRoleId(3L);
        role.setPermissionId(1L);
        roleService.doRevokePermissionFromRole(role);
    }

}