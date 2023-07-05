package com.zsycx.reggie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName: WebMvcConfig
 * @Description: TODO WebMvc配置类
 * 因为 SpringBoot 默认只会加载 src/main/resources/static 目录下的静态文件
 * 所以如果需要加载默认目录下的静态文件，需要进行静态资源的加载配置
 * 实现方法：继承 WebMvcConfigurationSupport 类，重写类中的 addResourceHandlers 方法执行
 * @E-mail: 209733813@qq.com
 */
@Configuration // 声明该类为配置类
public class WebMvcConfig extends WebMvcConfigurationSupport {

    /**
     * /backend/**，**号表示通配符，表示该目录下所有的内容
     * classpath:/backend/，classpath:表示 src/main/resources 目录下的
     * 两个方法的作用分别是：addResourceHandler() 添加处理目标目录，addResourceLocations() 添加资源所在的具体目录
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
    }
}
