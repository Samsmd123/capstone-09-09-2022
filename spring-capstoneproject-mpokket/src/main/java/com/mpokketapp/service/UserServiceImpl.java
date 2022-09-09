package com.mpokketapp.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	IUserRepository userRepository;
	
	@Autowired
	public void setUserRepository(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	
	@Override
	public void deleteUser(int userId) {
		 userRepository.deleteById(userId);
		
	}

	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public void updateByUser(User  user) {
		// TODO Auto-generated method stub
		 userRepository.save(user);
	}

	@Override
	public List<User> getByUserType(UserType usertype) {
		// TODO Auto-generated method stub
		return  userRepository.findByUserType(usertype);
	}

	


	

	

	

}
