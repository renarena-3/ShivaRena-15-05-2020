package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;
import com.nt.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class EmployeeController {
                                              
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/*	@RequestMapping(value="/showPage",method = RequestMethod.GET)
		public Iterable<Employee> getEmps(){
			
			Iterable<Employee> allEmployee = employeeService.getAllEmployee();
			
			return allEmployee;
		}*/
	
	@RequestMapping(value="/showPage",method = RequestMethod.GET)
	public Page<Employee> findAllEmp(@RequestParam(defaultValue="0") int page){
		PageRequest pageable = PageRequest.of(page, 20);   
		Page<Employee> emp = employeeRepository.findAll(pageable);
		System.out.println("emp==="+emp);
		return emp;
	}
	
}
