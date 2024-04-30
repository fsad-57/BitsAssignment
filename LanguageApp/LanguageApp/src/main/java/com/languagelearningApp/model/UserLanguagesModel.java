package com.languagelearningApp.model;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userlanguages")
public class UserLanguagesModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	private String language_id;
	
	
	@Column(name = "languages")
	private String languages;
	
	public UserLanguagesModel() {
		
	}

	public UserLanguagesModel(String languages) {
		super();
		this.languages = languages;
	}
	
	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "UserLanguagesModel [language_id=" + language_id + ", languages=" + languages + "]";
	}

	

	
	
	

}
