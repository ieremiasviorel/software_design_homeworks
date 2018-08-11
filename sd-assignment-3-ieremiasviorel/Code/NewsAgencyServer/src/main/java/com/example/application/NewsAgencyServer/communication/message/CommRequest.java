package com.example.application.NewsAgencyServer.communication.message;

public class CommRequest extends CommPackage {

	private static final long serialVersionUID = 1L;
	
	public CommRequest() {
		super();
	}
	
	public CommRequest(String message) {
		super(message);
	}
}
