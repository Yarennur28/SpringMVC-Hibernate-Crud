package com.yaren.dao;

import java.util.List;

import com.yaren.entities.Users;

public interface UserDao {
    public List<Users> list();
    public boolean delete(Users users);
    public Users getUser(int id);
    public void removeUser(int id);
    public boolean saveUser(Users users);
    public boolean updateUser(Users users);
}