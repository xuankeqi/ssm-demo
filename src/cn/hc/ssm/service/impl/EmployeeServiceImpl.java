package cn.hc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hc.ssm.dao.EmployeeMapper;
import cn.hc.ssm.entities.Employee;
import cn.hc.ssm.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee queryEmpById(Integer id) {
		return employeeMapper.selectByPrimaryKey(id);
	}
	
}
