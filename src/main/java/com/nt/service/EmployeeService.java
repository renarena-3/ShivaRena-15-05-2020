package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface EmployeeService {
	
	public Iterable<Employee> getAllEmployee();
	
	//public Page<Employee> FindAllEmpForPagination(Page page);
	
	

}
