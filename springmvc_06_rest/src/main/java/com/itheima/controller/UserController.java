package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller

public class UserController {
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    //跳转到相应页面
    public String save() {
        System.out.println("跳转页面");
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    //相应文本数据
    @ResponseBody//PathVariable从路径中取值
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete"+id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    //相应POJO对象
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("user update ..."+user);

        return "{'module':'user update'}";
    }
    @RequestMapping("/getById")
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
