package com.surajInformatics.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.surajInformatics.base.portal.Employee;
import com.surajInformatics.base.service.EmployeeService;

@RestController
@RequestMapping("employee/dbOps")
	public class EmployeeController {

		@Autowired
		private EmployeeService employeeService;

		@PostMapping("/create")
		public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age,
				@RequestParam String team) {
			Employee e = employeeService.create(firstName, lastName, age, team);
			return e.toString();
		}

		@GetMapping("/get")
		public Employee getEmployee(@RequestParam String firstName) {
			return employeeService.getByFirstName(firstName);
		}

		@GetMapping("/getAll")
		public List<Employee> getAllEmployees() {
			return employeeService.getAll();
		}

		@PutMapping("/update")
		public String updateEmployee(@RequestParam String firstName, @RequestParam String lastName, int age, String team) {
			Employee e = employeeService.update(firstName, lastName, age, team);
			return e.toString();
		}

		@DeleteMapping("/deleteByFirstName")
		public String deleteByFirstName(@RequestParam String firstName) {
			employeeService.deleteByFirstName(firstName);
			return "deleted Employee with firstName : " + firstName;
		}

		@DeleteMapping("/deleteAll")
		public String deleteAll() {
			employeeService.deleteAll();
			return "deleted all records";
		}


}
