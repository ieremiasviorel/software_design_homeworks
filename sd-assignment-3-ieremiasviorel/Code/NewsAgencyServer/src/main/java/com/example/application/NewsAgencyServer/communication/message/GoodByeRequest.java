package com.example.application.NewsAgencyServer.communication.message;

public class GoodByeRequest extends CommRequest {

	private static final long serialVersionUID = 1L;

	public GoodByeRequest() {
		super(MessageType.GOOD_BYE_REQUEST.type);
	}
	
	public GoodByeRequest(String message) {
		super(message);
	}
}
