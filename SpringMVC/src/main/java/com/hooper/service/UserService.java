package com.hooper.service;

import com.hooper.mapper.UserMapper;
import com.hooper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hooper on 2016/11/30.
 */
@Service
public class UserService implements BaseService<User,Integer>{

    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(Integer integer) {
        return userMapper.selectByPrimaryKey(integer);
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void modify(User user) {

    }

    @Override
    public void delete(Integer integer) {
        User user = userMapper.selectByPrimaryKey(integer);
    }
}
