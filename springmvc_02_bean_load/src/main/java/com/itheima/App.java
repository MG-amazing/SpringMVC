package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.config.SpringMvcConfig;
import com.itheima.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller = ctx.getBean(UserController.class);
        System.out.println(controller);
    }
}
