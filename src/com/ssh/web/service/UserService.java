package com.ssh.web.service;

import com.ssh.web.entity.User;

/**
 * Created by zhugp on 2017/6/27.
 */
public interface UserService {
    User login(String loginName, String password);
}
