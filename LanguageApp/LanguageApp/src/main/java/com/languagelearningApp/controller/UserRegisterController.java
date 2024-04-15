package com.languagelearningApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.languagelearningApp.dto.UserRegisterDto;
import com.languagelearningApp.model.UserRegisterModel;
import com.languagelearningApp.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class UserRegisterController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/user")
	public String saveUserRegister(@RequestBody UserRegisterModel userRegisterModel) {
		//TODO: process POST request
		userRepo.save(userRegisterModel);    
		
		return "User is registered successfully";
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<UserRegisterModel>> getAllEmployees(){
		List<UserRegisterModel> userList = new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		return new ResponseEntity<List<UserRegisterModel>>(userList,HttpStatus.OK);
		
	}
	
	

	
}
