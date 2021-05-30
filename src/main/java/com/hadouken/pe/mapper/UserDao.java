package com.hadouken.pe.mapper;

import com.hadouken.pe.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author hadouken-pe@gmail.com
 * @date 2021-05-30 20:37:00
 */
@Repository
public interface UserDao {

    /**
     * 注册用户
     */
    int register(User user);
}