package com.javarnd.tarang.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javarnd.tarang.model.User;
import com.javarnd.tarang.service.ContactService;

@RequestMapping(value="/admin", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ContactAdminController {

	private static final Logger logger = LoggerFactory.getLogger(ContactAdminController.class);

	@Autowired
	ContactService contactService;

	@GetMapping(value = "/getAllUsers")
	public List<User> getCountries() {
		logger.info("GetAll Users called");
		logger.info("going to create a new branch...");
		List<User> listOfUsers = contactService.getAllUsers();
		return listOfUsers;
	}

	@GetMapping(value = "/getUser/{id}")
	public User getUserById(@PathVariable int id) {
		logger.info("GetUser by id "+id+"called");
		User user= contactService.getUser(id);
		logger.info("object fetched from database");
		Link link = ControllerLinkBuilder
				.linkTo(ContactAdminController.class).slash("/getUser")
				.slash(user.getUserId())
				.withSelfRel();
		user.add(link);
		return user;
	}

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

	@DeleteMapping(value = "/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		logger.info("User with id "+id+"deleted");
		contactService.deleteUser(id);
	}
	@DeleteMapping(value = "/deleteAllUser")
	public void deleteAllUser() {
		logger.info("All user are about to be gone.");
		contactService.deleteAllUser();
	}
}
