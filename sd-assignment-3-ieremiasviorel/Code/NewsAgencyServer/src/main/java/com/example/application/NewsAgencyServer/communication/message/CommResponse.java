package com.example.application.NewsAgencyServer.communication.message;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommResponse extends CommPackage {
	
	private static final long serialVersionUID = 1L;
	
	protected static final ObjectMapper objectMapper = new ObjectMapper();

	public CommResponse() {
		super();
	}
	
	public CommResponse(String message) {
		super(message);
	}
}
