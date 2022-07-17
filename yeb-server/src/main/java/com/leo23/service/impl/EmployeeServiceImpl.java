package com.leo23.service.impl;

import com.leo23.entity.Employee;
import com.leo23.mapper.EmployeeMapper;
import com.leo23.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leo23
 * @since 2022-07-17
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
