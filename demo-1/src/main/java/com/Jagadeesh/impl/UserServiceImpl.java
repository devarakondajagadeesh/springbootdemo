package com.Jagadeesh.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jagadeesh.entity.Users;
import com.Jagadeesh.repository.UserRepository;
import com.Jagadeesh.service.UserService;
@Service

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Users> getAllUsers() {
	
		return userRepository.findAll();
		
	}
/*
	@Override
	}
}
	
	public Users getUserById(int user_id) {
	
		return userRepository.findById(user_id);
	

		
		
	}

	@Override
	public Users addOrUpdateUser(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Users deleteUser(int user_id) throws Exception {
		Users deletedUser = null;
		try {
			deletedUser = userRepository.findById(user_id);
			if(deletedUser == null) {
				throw new Exception("user not available");
			}
				else {
					userRepository.deleteById(user_id);
					
					
				}
			}
			
		catch(Exception ex) {
		throw ex;
	}
    return deletedUser;
    
	}
	*/
}
	