package com.hooper.service;

import com.hooper.common.exception.ServiceErrorConstants;
import com.hooper.common.exception.WebErrorConstants;
import com.hooper.common.exception.WebException;
import com.hooper.common.util.Md5Util;
import com.hooper.common.util.RandomStrUtil;
import com.hooper.mapper.UserMapper;
import com.hooper.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

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

    public User getByName(String name){
        return userMapper.selectByName(name);
    }

    @Override
    public void insert(User user) throws NoSuchAlgorithmException {
        User oldUser = userMapper.selectByName(user.getName());
        if(oldUser != null){
            throw new WebException(ServiceErrorConstants.USER_EXISTS,"用户名已存在");
        }else{
            String salt = RandomStrUtil.getRandomStr(6);
            String passwordWithSalt = Md5Util.encryptWithSalt(user.getPassword(),salt);
            user.setRandomsalt(salt);
            user.setPassword(passwordWithSalt);
            userMapper.insert(user);
        }
    }

    @Override
    public void modify(User user) {
        User oldUser = userMapper.selectByPrimaryKey(user.getId());
        if(oldUser == null){
            throw new WebException(ServiceErrorConstants.USER_NOT_FOUND,"修改操作失败");
        }else{
            userMapper.updateByPrimaryKeySelective(user);
        }
    }

    @Override
    public void delete(Integer integer) {
        User user = userMapper.selectByPrimaryKey(integer);
    }
}
