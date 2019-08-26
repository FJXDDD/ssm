package com.zking.ssm.sys.service.impl;

import com.zking.ssm.sys.mapper.PermissionMapper;
import com.zking.ssm.sys.model.Permission;
import com.zking.ssm.sys.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int add(Permission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int del(Permission permission) {
        return permissionMapper.deleteByPrimaryKey(permission.getPermissionId());
    }
}
