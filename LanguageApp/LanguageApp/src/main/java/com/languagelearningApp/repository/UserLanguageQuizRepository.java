package com.languagelearningApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.languagelearningApp.model.UserLanguageQuizModel;

@Repository
public interface UserLanguageQuizRepository extends JpaRepository<UserLanguageQuizModel, Long>{

}
