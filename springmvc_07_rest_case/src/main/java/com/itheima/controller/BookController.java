package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save==>"+book);
        return "{'module':'book save success'}";
    }
    @GetMapping
    public List<Book>geAll(){
        System.out.println("book getAll is running ....");
        List<Book>bookList=new ArrayList<Book>();
        Book book1=new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门");
        book1.setDescription("小试牛刀");
        bookList.add(book1);

        Book book2=new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实践");
        book2.setDescription("一代宗师");
        bookList.add(book2);

        Book book3=new Book();
        book3.setType("坤坤");
        book3.setName("鸡你太美");
        book3.setDescription("练习两年半");
        bookList.add(book3);
        return bookList;
    }
}
