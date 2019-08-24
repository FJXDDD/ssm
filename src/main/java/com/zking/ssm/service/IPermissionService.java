package com.zking.ssm.service;

import com.zking.ssm.model.Permission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IPermissionService {

    int add(Permission permission);
    int del(Permission permission);

}
