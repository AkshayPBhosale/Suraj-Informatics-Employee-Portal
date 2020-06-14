package com.surajInformatics.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surajInformatics.base.portal.Employee;
import com.surajInformatics.base.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public Employee create(String firstname,String lastName,int age,String team)
	{
		
		return repository.save(new Employee(firstname,lastName,age,team));
	}
	
	public List<Employee> getAll()
	{
		return repository.findAll();
	}
	
	public Employee getByFirstName(String firstName)
	{
		 return repository.findByFirstName(firstName);
	}
	
	public Employee update(String firstName,String lastName,int age,String team)
	{
		Employee e = repository.findByFirstName(firstName);
		e.setLastName(lastName);
		e.setAge(age);
		e.setTeam(team);
		return repository.save(e);
		
	}
	
	public void deleteAll()
	{
		
		repository.deleteAll();
	}
	
	public void deleteByFirstName(String firstName)
	{
		Employee e = repository.findByFirstName(firstName);
		repository.delete(e);
	}
}
