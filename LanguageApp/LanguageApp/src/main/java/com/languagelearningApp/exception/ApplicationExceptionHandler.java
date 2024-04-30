package com.languagelearningApp.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler()
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
		
	}

	
	@ExceptionHandler(LanguageIdNotFoundException.class)
	public ResponseEntity<?> languageIdNotException(LanguageIdNotFoundException ex){
		
		ErrorDetails error = new ErrorDetails();
		error.setStatusCode(HttpStatus.OK.value());
		error.setStatus(HttpStatus.OK.name());
		error.setErrMessage(ex.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		
		return new ResponseEntity<>(error,HttpStatus.OK);
	}
	
	/*
	 * @ExceptionHandler(MethodArgumentNotValidException.class) public
	 * ResponseEntity<?> methodValidation(MethodArgumentNotValidException st) {
	 * List<String> fieldsErrors =
	 * st.getBindingResult().getFieldErrors().stream().map(FieldError::
	 * getDefaultMessage).collect(Collectors.toList()); Map<String,Object> errorMap
	 * = new HashMap<>(); errorMap.put("status",HttpStatus.BAD_REQUEST.name());
	 * errorMap.put("statusCode",HttpStatus.BAD_REQUEST.value());
	 * errorMap.put("timeStamp",LocalDateTime.now());
	 * errorMap.put("errMessages",fieldsErrors); return new
	 * ResponseEntity<>(errorMap,HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 */
}
