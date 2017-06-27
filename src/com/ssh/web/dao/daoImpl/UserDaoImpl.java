package com.ssh.web.dao.daoImpl;

import com.ssh.web.dao.UserDao;
import com.ssh.web.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhugp on 2017/6/27.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private SessionFactory factory;

    @Override
    public User findByLoginNamePwd(String username, String password) {
        Session session = factory.openSession();
        try {
            final String hql = "from User u where name = :username and password = :password";
            List list = session.createQuery(hql).setParameter("username", username).setParameter("password", password).list();
            User user = null;
            if (list.size() > 0) {
                user = (User) list.get(0);
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
