package com.surajInformatics.base.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.surajInformatics.base.portal.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{
	
	public Employee findByFirstName(String firstName);
	public Employee findByLastName(String lastName);
	public List<String> findByage(int age);
	
}
