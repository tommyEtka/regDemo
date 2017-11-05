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
public class RegDemoController {
	
	@Autowired
	private UserRepository userRepository;
	
	//creates the user
	@RequestMapping(value = "/users", method = RequestMethod.POST)
    public User create(@RequestBody User newUser){
		User savedUser = userRepository.save(newUser);
		return savedUser;
		//test
		//public String index(@RequestParam(value="name", required=false, defaultValue="Thurman") String name, Model model) {
		//model.addAttribute("name", name);
		//model.addAttribute("home", home);
		//return "Congrats! You've registered to the database! ";
    }
	//returns Collection of all users
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Iterable<User> get(){
		return userRepository.findAll();
		}
	
	 //test 3
	//@RequestMapping(value = "/confirmation", method = RequestMethod.GET)
		//public String index(@RequestParam(value="name", required=false, defaultValue="Thurman") String name, Model model) {
		//model.addAttribute("name", name);
		//model.addAttribute("home", home);
		//return "Congrats! You've registered to the database!";
	
	
	
	//test 2
	//public String home2(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//String formattedDate = dateFormat.format(date);
		//model.addAttribute("serverTime", formattedDate);
		//return "users";
}
