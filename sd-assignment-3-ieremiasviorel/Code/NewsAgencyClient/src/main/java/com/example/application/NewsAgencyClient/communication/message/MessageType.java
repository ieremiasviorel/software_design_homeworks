package com.example.application.NewsAgencyClient.communication.message;

public class MessageType {

	public String type;
	
	public MessageType(String type) {
		this.type = type;
	}
	
	public static final MessageType LOGIN_REQUEST = new MessageType("LOGIN_REQUEST");
	public static final MessageType LOGIN_RESPONSE = new MessageType("LOGIN_RESPONSE");
	
	public static final MessageType GET_ARTICLES_REQUEST = new MessageType("GET_ARTICLES_REQUEST");
	public static final MessageType GET_ARTICLES_RESPONSE = new MessageType("GET_ARTICLES_RESPONSE");
	
	public static final MessageType GET_FULL_ARTICLE_REQUEST = new MessageType("GET_FULL_ARTICLE_REQUEST");
	public static final MessageType GET_FULL_ARTICLE_RESPONSE = new MessageType("GET_FULL_ARTICLE_RESPONSE");
	
	public static final MessageType GOOD_BYE_REQUEST = new MessageType("GOOD_BYE_REQUEST");
	public static final MessageType GOOD_BYE_RESPONSE = new MessageType("GOOD_BYE_RESPONSE");
}
