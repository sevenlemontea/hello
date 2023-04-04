package com.seven.hello.service.impl;

import com.seven.hello.bean.User;
import com.seven.hello.mapper.LoginMapper;
import com.seven.hello.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Name LemonTea
 * @Time 2023-03-27-10:40
 */
public class ImplService implements LoginService {

    @Autowired
    LoginMapper loginMapper;
    @Override
    public boolean login(User user) {
        return loginMapper.login(user);
    }
}
