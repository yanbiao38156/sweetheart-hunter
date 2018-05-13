package com.bingo.hearthunter.controller;

import com.bingo.hearthunter.domain.ResultJson;
import com.bingo.hearthunter.domain.Users;
import com.bingo.hearthunter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by yanbiao on 2017/10/10.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * add
     */
    @RequestMapping(value="/add")
    public ResultJson add(@ModelAttribute Users user){
        user.setCreatedTime(new Date());
        ResultJson<?> resultJson ;
        try{
            String id = userService.add(user);
            resultJson = new ResultJson(id);
        }catch (Throwable e){
            resultJson = new ResultJson(e);
        }
        return resultJson;
    }

    /**
     * update
     */
    @RequestMapping(value="update")
    public ResultJson update(@ModelAttribute Users user){
        ResultJson<?> resultJson ;
        try{
            String newId = userService.update(user);
            resultJson = new ResultJson(newId);
        }catch (Throwable e){
            resultJson = new ResultJson(e);
        }
        return resultJson;
    }

    /**
     * delete
     */
    @RequestMapping(value="delete")
    public ResultJson delete(){

    }
}
