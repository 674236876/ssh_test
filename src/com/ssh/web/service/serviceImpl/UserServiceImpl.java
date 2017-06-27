package com.ssh.web.service.serviceImpl;

import com.ssh.web.dao.UserDao;
import com.ssh.web.entity.User;
import com.ssh.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhugp on 2017/6/27.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String loginName, String password) {
        User user = userDao.findByLoginNamePwd(loginName, password);

        return user;
    }
}
