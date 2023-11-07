package com.apielastic.apielastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

@RestController
@RequestMapping("/employee")
public class ApielasticApplication {

	private List<Employee> employees = new ArrayList<>();

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee){
		employees.add(employee);
		return employee;

	}

	@GetMapping
	public List<Employee> getEmployees(){
		return employees;

	}


	public static void main(String[] args) {
		SpringApplication.run(ApielasticApplication.class, args);
	}




    }

