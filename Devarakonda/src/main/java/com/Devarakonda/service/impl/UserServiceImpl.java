package com.Devarakonda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Devarakonda.entity.Users;
import com.Devarakonda.repository.UserRepository;
import com.Devarakonda.service.UserService;
@Service 
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public List<Users> getAllUsers() {
	
		return (List<Users>) userRepository.findAll();
	}

	@Override
	public Users getUserById(int userId) {
		
		return userRepository.findById(userId).orElse(null);
		
		
	}

	@Override
	public Users addOrUpdateUser(Users User) {
		
		return userRepository.save(User);
		
	}

	@Override
	public Users deleteUser(int userId) throws Exception {
		Users deletedUser = null;
		try {
			deletedUser = userRepository.findById(userId).orElse(null);
			if(deletedUser == null) {
				throw new Exception("user not available");
			}
			else {
				userRepository.deleteById(userId);
			}
		}
		catch(Exception ex) {
			throw ex;
		}
		return deletedUser;
	}

}
