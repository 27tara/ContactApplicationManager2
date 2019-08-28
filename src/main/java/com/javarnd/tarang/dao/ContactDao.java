package com.javarnd.tarang.dao;

import java.util.List;

import com.javarnd.tarang.model.User;

public interface ContactDao {

	List<User> getAllUsers();
	User addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	void deleteAllUsers();
	User getUser(int id);

}
