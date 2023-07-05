package com.zsycx.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ReggieTakeOutApplication
 * @Description: TODO 项目主程序
 * @E-mail: 209733813@qq.com
 */

@Slf4j // lombok提供的日志注解
@SpringBootApplication // SpringBoot项目核心注解
public class ReggieTakeOutApplication {

    public static void main(String[] args) {
        // 项目主入口
        SpringApplication.run(ReggieTakeOutApplication.class, args);
        // 输出启动日志
        log.info("Reggie-Take-Out SpringBoot项目启动成功~");
    }
}
