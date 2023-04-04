package com.seven.hello.service;

import com.seven.hello.bean.User;
import org.springframework.stereotype.Service;

/**
 * @Name LemonTea
 * @Time 2023-03-27-10:36
 */
@Service
public interface LoginService {
    boolean login(User user);
}
