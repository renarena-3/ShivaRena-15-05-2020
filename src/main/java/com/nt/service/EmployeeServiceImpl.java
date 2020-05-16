package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Iterable<Employee> getAllEmployee() {
		Iterable<Employee> listEmps = employeeRepository.findTop200ByOrderByEidDesc();
		return listEmps;
	}
	
	/*@Override
	public Page<Employee> FindAllEmpForPagination(Page page) {
		employeeRepository.findAll(new PageRequest(page,4));
		return null;
	}*/
	


}
