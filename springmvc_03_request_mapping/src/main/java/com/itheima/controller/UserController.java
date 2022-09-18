package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    //设置当前操作的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':springmvc}";
    }
    @RequestMapping("/delete")
    //设置当前操作的返回值类型
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':user delete}";
    }
}
