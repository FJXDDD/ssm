package com.zking.ssm.sys.service;

import com.zking.ssm.sys.model.Permission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IPermissionService {

    int add(Permission permission);
    int del(Permission permission);

}
