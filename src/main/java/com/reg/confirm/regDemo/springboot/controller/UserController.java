package com.reg.confirm.regDemo.springboot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

//import org.hibernate.validator.internal.util.logging.Log_.logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reg.confirm.regDemo.repository.UserRepository;
import com.reg.confirm.regDemo.springboot.data.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User create(@RequestBody User newUser) {
		User savedUser = userRepository.save(newUser);
		return savedUser;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Iterable<User> get() {
		return userRepository.findAll();
	}

}
