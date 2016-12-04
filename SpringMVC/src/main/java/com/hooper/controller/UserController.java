package com.hooper.controller;

import com.hooper.dto.UserDto;
import com.hooper.model.User;
import com.hooper.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by hooper on 2016/11/30.
 */
@Controller
@RequestMapping("/User")
public class UserController {

    @Resource
    UserService userService;


    @RequestMapping(value = "/{userPk}",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getUser(@PathVariable Integer userPk){
        User user = userService.get(userPk);
        if(user != null){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            return userDto;
        }else{
            return null;
        }
    }
}
