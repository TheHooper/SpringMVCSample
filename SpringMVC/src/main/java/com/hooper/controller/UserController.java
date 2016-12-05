package com.hooper.controller;

import com.hooper.common.exception.WebErrorConstants;
import com.hooper.common.exception.WebException;
import com.hooper.common.util.Md5Util;
import com.hooper.common.util.RandomStrUtil;
import com.hooper.dto.UserDto;
import com.hooper.dto.input.UserInput;
import com.hooper.model.User;
import com.hooper.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hooper on 2016/11/30.
 */
@Controller
@RequestMapping("/User")
public class UserController {

    @Resource
    UserService userService;


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object getUser(UserInput userInput){
        User user = userService.getByName(userInput.getName());
        if(user != null){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            return userDto;
        }else{
            return null;
        }
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public void register(@Valid UserInput registerInput) throws NoSuchAlgorithmException {
        User user = new User();
        BeanUtils.copyProperties(registerInput,user);
        userService.insert(user);
    }
}
