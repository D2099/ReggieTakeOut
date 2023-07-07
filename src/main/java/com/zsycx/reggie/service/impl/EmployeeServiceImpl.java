package com.zsycx.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsycx.reggie.domain.Employee;
import com.zsycx.reggie.mapper.EmployeeMapper;
import com.zsycx.reggie.service.EmployeeService;

/**
 * @ClassName: EmployeeServiceImpl
 * @Description: TODO EmployeeService实现类
 * 需要继承 ServiceImpl<对应实体Mapper类, 对应实体类> 并且实现 EmployeeService 接口
 * @E-mail: 209733813@qq.com
 */
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
