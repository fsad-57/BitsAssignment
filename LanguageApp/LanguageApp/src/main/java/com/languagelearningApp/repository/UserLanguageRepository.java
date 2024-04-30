package com.languagelearningApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.languagelearningApp.model.UserLanguagesModel;

@Repository
public interface UserLanguageRepository extends JpaRepository<UserLanguagesModel, String>{
	
	//UserLanguagesModel findByUserLang(String Lang);

}
