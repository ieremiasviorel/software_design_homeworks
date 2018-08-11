package com.example.application.NewsAgencyServer.communication.message;

import com.example.application.NewsAgencyServer.data.entity.Writer;

public class LoginResponse extends CommResponse {

	private static final long serialVersionUID = 1L;

	private Writer writer;

	public LoginResponse() {
		super();
		this.writer = null;
	}
	
	public LoginResponse(Writer writer) {
		super(MessageType.LOGIN_RESPONSE.type);
		this.writer = writer;
	}
	
	public LoginResponse(String message, Writer writer) {
		super(message);
		this.writer = writer;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}
}
