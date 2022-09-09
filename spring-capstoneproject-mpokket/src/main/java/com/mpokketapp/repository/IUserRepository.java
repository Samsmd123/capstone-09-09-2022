package com.mpokketapp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	List<User> findByUserType(UserType usertype);
	
	
	
	
	
}
