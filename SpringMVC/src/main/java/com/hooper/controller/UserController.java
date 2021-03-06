package com.hooper.controller;

import com.hooper.common.annotation.AuthAnnotation;
import com.hooper.common.constants.SessionConstants;
import com.hooper.common.constants.WebErrorConstants;
import com.hooper.common.exception.WebException;
import com.hooper.common.util.Md5Util;
import com.hooper.dto.UserDto;
import com.hooper.dto.input.UserInput;
import com.hooper.model.User;
import com.hooper.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hooper on 2016/11/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @AuthAnnotation
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@Valid UserInput userInput, HttpSession session) throws NoSuchAlgorithmException {
        User user = userService.getByName(userInput.getName());
        String password = Md5Util.encryptWithSalt(userInput.getPassword(), user.getRandomsalt());
        if (user.getPassword().equals(password)) {
            user.setPassword("");
            user.setRandomsalt("");
            session.setAttribute(SessionConstants.USER_SESSION, user);
        } else {
            throw new WebException(WebErrorConstants.USER_PASSWORD_WRONG, "用户名密码错误");
        }
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public void register(@Valid UserInput registerInput) throws NoSuchAlgorithmException {
        User user = new User();
        BeanUtils.copyProperties(registerInput,user);
        userService.insert(user);
    }
}
