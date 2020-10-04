package com.example.demo.mapper;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers() throws Exception ;
    void pushUser(String user_name,String password,String e_mail) throws Exception;
}
