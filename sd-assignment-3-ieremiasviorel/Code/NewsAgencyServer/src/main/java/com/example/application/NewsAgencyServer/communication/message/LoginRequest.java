package com.example.application.NewsAgencyServer.communication.message;

public class LoginRequest extends CommRequest {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public LoginRequest() {
		super();
		this.userName = null;
		this.password = null;
	}
	
	public LoginRequest(String userName, String password) {
		super(MessageType.LOGIN_REQUEST.type);
		this.userName = userName;
		this.password = password;
	}
	
	public LoginRequest(String message, String userName, String password) {
		super(message);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
