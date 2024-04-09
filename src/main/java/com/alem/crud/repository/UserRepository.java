package com.alem.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alem.crud.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
//	@Transactional(readOnly = true)
//	@Query("SELECT u.id FROM User u WHERE u.email = ?1 AND u.password = ?2")
//    Integer validateUser(String email, String password);
	
	@Transactional(readOnly = true)
	@Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2")
    User validateUser(String email, String password);

}
