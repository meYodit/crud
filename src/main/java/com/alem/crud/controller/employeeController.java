package com.alem.crud.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alem.crud.model.Employees;
import com.alem.crud.repository.EmployeesRepository;
import com.alem.crud.service.EmployeesServiceImpl;





@RestController
@CrossOrigin(origins="*")
//@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/")
public class employeeController {
	
	@Autowired
	EmployeesServiceImpl es;
//	EmployeesRepository er;

	     //post/add employee
	@RequestMapping(value="/registerEmployees", method=RequestMethod.POST)
	public void addUser(@RequestBody Employees employee) {
		es.registerEmployees(employee);
	}	
	
	     //get all
	@RequestMapping(value="/Employees", method=RequestMethod.GET)
	public List<Employees>getAllProvider() {		
			return es.getAllProvider();
	}
		//get one
	@GetMapping("getEmployee/{id}")	
	public Optional<Employees> findById(@PathVariable("id") Long empId){
		return es.findById(empId);
	}
	
//	@RequestMapping(value="/getEmployee/{id}", method=RequestMethod.GET)
//	public List<Employees> getAllMenu(@RequestParam("id") Long id){
//		return es.findById(id);
//	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable long id) {
		es.delete(id);	
	}
	
	 @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id,  @RequestBody Employees employee) {
        BeanUtils.copyProperties(employee,id, "id");
        return ResponseEntity.ok(es.updateEmployee(id, employee));
    }
	
//	@RequestMapping(value="/update/{id}/{book_price}", method=RequestMethod.PUT)
//	public void update(@PathVariable int id, @PathVariable int book_price) {
//		es.update(book_price,id);
//	}
	

}

