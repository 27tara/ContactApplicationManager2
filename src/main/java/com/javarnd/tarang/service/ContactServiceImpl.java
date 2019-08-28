package com.javarnd.tarang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javarnd.tarang.dao.ContactDao;
import com.javarnd.tarang.model.User;

@Transactional
@Service("contactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao contactDao;

	public List<User> getAllUsers() {
		return contactDao.getAllUsers();
	}

	public User getUser(int id) {
		return contactDao.getUser(id);
	}

	public User addUser(User user) {
		return contactDao.addUser(user);
	}

	public void updateUser(User user) {
		contactDao.updateUser(user);
	}

	public void deleteUser(int id) {
		contactDao.deleteUser(id);
	}

	public void deleteAllUser() {
		contactDao.deleteAllUsers();

	}
}
