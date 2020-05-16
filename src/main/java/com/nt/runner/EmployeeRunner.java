package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeController employeeController;
	
	@Override
	public void run(String... args) throws Exception {
		/*Iterable<Employee> allEmployee = employeeController.getEmps();
		allEmployee.forEach(emp->{
			System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsal());
		});*/
		Page<Employee> pageemps = employeeController.findAllEmp(4);
		System.out.println("pageemps==="+pageemps);
	}

}
