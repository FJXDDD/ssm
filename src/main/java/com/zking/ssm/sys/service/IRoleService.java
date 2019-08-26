package com.zking.ssm.sys.service;

import com.zking.ssm.sys.model.Role;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IRoleService {
    int addRole(Role role);//新增角色

    int delRole(Role role);//删除角色

    int doGrantRoleToUser(Role role);//给用户分配角色
    int doRevokeRoleFromUser(Role role);//从用户收回角色
    int doGrantPermissionToRole(Role role);//给角色分配权限
    int doRevokePermissionFromRole(Role role);//从角色收回权限

}
