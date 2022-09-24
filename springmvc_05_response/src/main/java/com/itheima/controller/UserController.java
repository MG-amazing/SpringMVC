package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller

public class UserController {
    @RequestMapping("/toJumpPage")
    //跳转到相应页面
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    //相应文本数据
    @ResponseBody
    public String toText() {
        System.out.println("返回文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    //相应POJO对象
    @ResponseBody
    public User toJsonPOJO() {
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }
    @RequestMapping("/toJsonList")
    //相应POJO集合
    @ResponseBody
    public List<User> toJsonList() {
        System.out.println("返回json集合数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        User user1=new User();
        user1.setName("黑马程序员");
        user1.setAge(12);
        List<User>userList=new ArrayList<User>();
        userList.add(user);
        userList.add(user1);
        return userList;
    }


}
