package com.example.application.NewsAgencyServer.communication.message;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommPackage implements Serializable {

	private static final long serialVersionUID = 1L;

	protected static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	protected String message;

	public CommPackage() {
		this.message = null;
	}
	
	public CommPackage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toJson() throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(this);
	}
}
