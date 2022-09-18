package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    //设置当前操作的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("book save ...");
        return "{'module':book save}";
    }
}
