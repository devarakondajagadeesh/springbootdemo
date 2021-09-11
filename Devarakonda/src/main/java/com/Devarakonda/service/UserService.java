package com.Devarakonda.service;

import java.util.List;

import com.Devarakonda.entity.Users;

public interface UserService {
	
	
	public List<Users> getAllUsers();
	
	public Users getUserById(int userId);
	public Users addOrUpdateUser(Users User);
	public Users deleteUser(int userId) throws Exception;
	
	

}
