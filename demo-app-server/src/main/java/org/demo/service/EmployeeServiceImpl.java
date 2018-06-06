package org.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.demo.dao.EmployeeRepository;
import org.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {
		System.out.println("In Servce, calling DAO");
		//employeeDaoObj.addEmployee(employee);
		return null;
	}

	@Override
	public List<Employee> listEmployee() {
		List<Employee> empList = new ArrayList<>();
		employeeRepository.findAll().forEach(e -> empList.add(e));
		return empList;
	}

	@Override
	public void deleteEmployee(Employee employee, int id) {
		//employeeDaoObj.deleteEmployee(employee, id);
	}

	@Override
	public List<Employee> getEmployee(int id) {
		//System.out.println(employeeDaoObj.getEmployee(id).toString());
		//return employeeDaoObj.getEmployee(id);
		return null;
	}

}
