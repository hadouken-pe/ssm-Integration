package com.hadouken.pe.service.impl;

import com.hadouken.pe.mapper.UserDao;
import com.hadouken.pe.pojo.User;
import com.hadouken.pe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gehuadong01@baidu.com
 * @date 2021-05-30 20:39:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean register(User user) {
        int i = userDao.register(user);
        return i > 0;
    }
}
