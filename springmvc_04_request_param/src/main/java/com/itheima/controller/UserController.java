package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller

public class UserController {
    @RequestMapping("/commonParam")
    //设置当前操作的返回值类型
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name-->>"+name);
        System.out.println("普通参数传递 age-->>"+age);
        return "{'module':'common param'}";
    }
    @RequestMapping("/commonParamDifferentName")
    //设置当前操作的返回值类型
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String  userName,int age){
        System.out.println("普通参数传递 name-->>"+userName);
        System.out.println("普通参数传递 age-->>"+age);
        return "{'module':'common param different name'}";
    }
    @RequestMapping("/pojoParam")
    //设置当前操作的返回值类型
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递 name-->>"+user);

        return "{'module':'pojo param'}";
    }
    @RequestMapping("/pojoContainParam")
    //设置当前操作的返回值类型
    @ResponseBody
    public String pojoContainParam(User user){
        System.out.println("pojo参数传递 name-->>"+user);
        return "{'module':'pojo param'}";
    }
    @RequestMapping("/arrayParam")
    //设置当前操作的返回值类型
    @ResponseBody
    public String arrayParam(String []likes){
        System.out.println("数组类型传递 likes-->>"+ Arrays.toString(likes));
        return "{'module':'array param'}";
    }
    @RequestMapping("/listParam")
    //设置当前操作的返回值类型
    @ResponseBody
    public String listParam(@RequestParam List<String>likes){
        System.out.println("数组类型传递 likes-->>"+ likes);
        return "{'module':'list param'}";
    }
    @RequestMapping("/listParamForJson")
    //设置当前操作的返回值类型
    @ResponseBody
    public String listParamForJson(@RequestBody List<String>likes){
        System.out.println("list common(json) 参数传递-->>"+ likes);
        return "{'module':'list param'}";
    }
    @RequestMapping("/pojoParamForJson")
    //设置当前操作的返回值类型
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json) 参数传递-->>"+ user);
        return "{'module':'list param'}";
    }
    @RequestMapping("/listPojoParamForJson")
    //设置当前操作的返回值类型
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User>list){
        System.out.println("pojo(json) 参数传递-->>"+ list);
        return "{'module':'list param'}";
    }

}
