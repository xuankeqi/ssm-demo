package cn.hc.ssm.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.hc.ssm.entities.Employee;
import cn.hc.ssm.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("getEmpById")
	public String getEmpById(@RequestParam("id") Integer id,
			Map<String, Object> map){
		Employee emp = employeeService.queryEmpById(id);
		map.put("emp", emp);
		return "success";
	}
	
}
