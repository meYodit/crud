package com.alem.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alem.crud.model.Employees;
import com.alem.crud.repository.EmployeesRepository;


@Service
public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	EmployeesRepository er;
      //add
	public void registerEmployees(Employees employee) {
		er.save(employee);
	}
	//get all
	public List<Employees> getAllProvider(){
		return er.findAll();
	}
	//get one
	@Override
	public Optional<Employees> findById(Long id) {		
		return er.findById(id);
	}

	
	
//	public void deleteEmployees(Employees employee) {
//		er.deleteById(null);
//	}

//	public void delete(long id) {
//		er.deleteById(id);
//	}
	
	  @Override
	    public void delete(Long id) {

	        Employees employee = er.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));

	        er.deleteById(id);
	    }
//
	



//	@Override
//	public void update(Long id) {
//		 er.updateSalary(id);
//		
//	}
	




//	public void update(int salary, int id) {
//		er.update(salary,id);
//	}

//	@Override
//	public void save(Employees emp) {
//		er.save(emp);
//		
//	}
//	
//	public Optional<Employees> update(Employees emp, Long id){
//        Optional<Employees> employee = er.findById(id);
//        if (employee != null) {
//            er.save(emp);
//        }
//        return employee;
//    }
	  
	@Override
    public Employees updateEmployee(Long id, Employees employee) {
        if (er.findById(id).isPresent()){
            Employees emp = er.findById(id).get();
            emp.setFirstName(employee.getFirstName());
            emp.setLastName(employee.getLastName());
            emp.setSalary(employee.getSalary());
            Employees updateEmployee = er.save(emp);
            return new Employees();
//            return new Employees(updateEmployee.getId(),updateEmployee.getFirstName(),
//            		updateEmployee.getLastName(), updateEmployee.getSalary());
            
        }else{
            return null;
        }
    }





//	@Override
//	public Employees updateEmployee(Long id, Employees employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Optional<Employees> findById(Long id) {
//		// TODO Auto-generated method stub
//		return Optional.empty();
//	}
}
	 

