package com.javarnd.tarang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javarnd.tarang.model.User;
import com.javarnd.tarang.service.ContactService;

@RequestMapping(value="/user", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ContactUserController {

	private static final Logger logger = LoggerFactory.getLogger(ContactUserController.class);

	@Autowired
	ContactService contactService;

	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User user) {
		logger.info("add user into database called");
		return contactService.addUser(user);
	}

	@PutMapping(value = "/updateUser")
	public void updateUser(@RequestBody User user) {
		logger.info("update user for id "+user.getId()+"updated");
		contactService.updateUser(user);
	}

}
