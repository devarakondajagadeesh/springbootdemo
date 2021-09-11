package com.Jagadeesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Jagadeesh.entity.Users;


@Service

public interface UserService {
	
	public List<Users> getAllUsers();
//	public Users getUserById(int user_id);
//	public Users addOrUpdateUser(Users user);
//  public Users deleteUser(int user_id) throws Exception;
}
