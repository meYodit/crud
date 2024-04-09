package com.alem.crud.service;

import java.util.List;
import java.util.Optional;

import com.alem.crud.model.Employees;

public interface EmployeesService {

	 public void registerEmployees(Employees employee);
	 public List<Employees> getAllProvider();
	 
	 Optional < Employees > findById(Long id); 
	 
	 void delete(Long id);	 
     public Employees updateEmployee(Long id, Employees employee);

}
