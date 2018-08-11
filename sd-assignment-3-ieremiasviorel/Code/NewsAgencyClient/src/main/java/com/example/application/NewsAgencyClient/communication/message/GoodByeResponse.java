package com.example.application.NewsAgencyClient.communication.message;

public class GoodByeResponse extends CommResponse {

	private static final long serialVersionUID = 1L;

	public GoodByeResponse() {
		super(MessageType.GOOD_BYE_RESPONSE.type);
	}
	
	public GoodByeResponse(String message) {
		super(message);
	}
}
