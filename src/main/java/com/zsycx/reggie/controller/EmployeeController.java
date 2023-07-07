package com.zsycx.reggie.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: EmployeeController
 * @Description: TODO Employee控制器类
 * @E-mail: 209733813@qq.com
 */

@Slf4j // lombok提供的日志注解
@Controller // 声明为控制器类 或者 ↓↓↓
// @RestController 这个注解是@ResponseBody和@Controller的结合注解
@RequestMapping("/employee") // 设置映射地址，应用在类上表示设置为该类中所有方法映射地址的父地址
public class EmployeeController {
}
