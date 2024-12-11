package com.yaren.services;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import com.yaren.dao.UserDao;
import com.yaren.entities.Users;
import com.yaren.services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    
    
    public List<Users> list() {
        return userDao.list();
    }
    
    public boolean delete(Users users) {
        return userDao.delete(users);
    }
  
   
    public boolean saveUser(Users users) {
        return userDao.saveUser(users);
    }

   
    public Users getUser(int id) {
        return userDao.getUser(id);
    }

    public void removeUser(int id) {
         userDao.removeUser(id);
    }
  
    
    public boolean updateUser(Users users) {
        return userDao.updateUser(users);
    }
}