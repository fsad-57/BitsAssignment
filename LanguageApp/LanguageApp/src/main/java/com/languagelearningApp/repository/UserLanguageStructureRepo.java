package com.languagelearningApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.languagelearningApp.model.UserLanguageStructureModel;

@Repository
public interface UserLanguageStructureRepo extends JpaRepository<UserLanguageStructureModel, Long>{

}
