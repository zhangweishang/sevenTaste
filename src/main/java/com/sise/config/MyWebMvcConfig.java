package com.sise.config;

import com.sise.composition.PathInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: MyPoject->WebMvcConfigurer
 * @author: ZJ
 * @create: 2019-09-02 21:06
 * @description:WebMvcConfigurer配置类
 **/
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login");

        registry.addViewController("/bs_index-content").setViewName("/index-content");
        registry.addViewController("/bs_index-BusinessInformation").setViewName("/index-BusinessInformation");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PathInterceptor()).addPathPatterns("/**");
    }
}
