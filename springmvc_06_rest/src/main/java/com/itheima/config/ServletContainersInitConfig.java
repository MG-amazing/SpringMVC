package com.itheima.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import javax.servlet.Filter;

/**
 * 服务器初始化过程
 *
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
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //乱码处理

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return new Filter[]{filter};
    }
}
