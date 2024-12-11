package com.yaren.services;

import java.util.List;

import com.yaren.entities.Users;

public interface UserService {
	public List<Users> list();
	public boolean delete(Users users);
	public boolean saveUser(Users users);
	public boolean updateUser(Users users);
	public Users getUser(int id);
	public void removeUser(int id);
}