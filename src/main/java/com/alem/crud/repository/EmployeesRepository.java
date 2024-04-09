package com.alem.crud.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.alem.crud.model.Employees;



public interface EmployeesRepository extends JpaRepository<Employees,Long>{
//	@Modifying
//	@Transactional
//	@Query("update employees e set e.salary=?1 where e.id=?20")
//	long updateSalary(long id, long salary);

//	void update(int salary, int id);

//	List<Employees> findByEmployeeId(Long empId);
}
