package com.itheima.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 服务器初始化过程
 * <p>
 * 1.服务器启动，执行ServletContainersInitConfig类，初始化Web容器
 * 2.执行createServletApplicationContext方法，创建了WebApplicationContext对象
 * 3.加载SpringMvcConfig
 * 4.执行@CompontSan加载对应的Bean
 * 5.加载UserController，每个@RequestMapping的名称对应一个具体的方法
 * 6.执行getServletMappings方法，定义所有的请求都通过SpringMVC
 */

/**
 * 单次请求过程
 *
 * 1.发送请求localhost/save
 * 2.web容器发现所有的请求都经过SpringMVC,将请求交给SpringMVC处理
 * 3.解析请求路径/save
 * 4.由/save匹配执行对应的方法save()
 * 5.执行save（）
 * 6.检测到有@ResponseBody直接将save（）方法的返回值作为相应体返回给对方
 */

//定义一个servlet容器启动的配置类，在里面加载Spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
//    //加载SpringMVC的容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
//    //设置那些请求归属SpringMVC处理
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //加载Spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//        return ctx;
//    }