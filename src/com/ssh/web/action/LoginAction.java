package com.ssh.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.web.entity.User;
import com.ssh.web.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * 登录处理action
 * Created by zhugp on 2017/6/23.
 */
@Controller
public class LoginAction extends ActionSupport{

    private static final long serialVersionUID = 228428617014514506L;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UserService userService;

    private String result = "";

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String loginName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String execute() throws Exception {
        User user = userService.login(loginName, password);
        if (user == null) {
            result = "登陆失败";
            return ERROR;
        }
        ActionContext.getContext().getSession().put("username",user.getName());
        result = user.getName()+"登录成功";
        return SUCCESS;
    }
}
