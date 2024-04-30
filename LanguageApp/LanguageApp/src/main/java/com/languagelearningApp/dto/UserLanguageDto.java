package com.languagelearningApp.dto;

public class UserLanguageDto {
	
	private String languages;

	public UserLanguageDto() {
		
	}

	public UserLanguageDto(String languages) {
		super();
		this.languages = languages;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	

}
