package com.javarnd.tarang.service;

import java.util.List;

import com.javarnd.tarang.model.User;

public interface ContactService {

	List<User> getAllUsers();
	User getUser(int id);
	User addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	void deleteAllUser();

}
