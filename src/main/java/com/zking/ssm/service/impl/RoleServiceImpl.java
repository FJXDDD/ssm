package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.RoleMapper;
import com.zking.ssm.model.Role;
import com.zking.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int addRole(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int delRole(Role role) {
        return roleMapper.deleteByPrimaryKey(role.getRoleId());
    }

    @Override
    public int doGrantRoleToUser(Role role) {
        return roleMapper.doGrantRoleToUser(role);
    }

    @Override
    public int doRevokeRoleFromUser(Role role) {
        return roleMapper.doRevokeRoleFromUser(role);
    }

    @Override
    public int doGrantPermissionToRole(Role role) {
        return roleMapper.doGrantPermissionToRole(role);
    }

    @Override
    public int doRevokePermissionFromRole(Role role) {
        return roleMapper.doRevokePermissionFromRole(role);
    }
}
