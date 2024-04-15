package com.languagelearningApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.languagelearningApp.model.UserRegisterModel;

public interface UserRepository extends JpaRepository<UserRegisterModel, Long>{

	

}
