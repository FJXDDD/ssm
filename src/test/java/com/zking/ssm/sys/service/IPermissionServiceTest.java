package com.zking.ssm.sys.service;

import com.zking.ssm.sys.model.Permission;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IPermissionServiceTest extends BaseTestCase {

    @Autowired
    private IPermissionService permissionService;

    private Permission permission;

    @Override
    public void before() throws Exception {
        super.before();
        permission = new Permission();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("执行完成！");
    }

    @Test
    public void add() throws Exception {
        permission.setPermissionName("权限名");
        permission.setLevel(2);
        permission.setParentPermissionId(1L);
        permission.setAvailable(1);
        permission.setPermission("权限字符串");
        permissionService.add(permission);
    }

    @Test
    public void del() throws Exception {
        permission.setPermissionId(9L);
        permissionService.del(permission);
    }

}