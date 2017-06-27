package com.ssh.web.dao;

import com.ssh.web.entity.User;

/**
 * Created by zhugp on 2017/6/27.
 */
public interface UserDao {
    User findByLoginNamePwd(String username, String password);
}
