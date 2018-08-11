package com.example.application.NewsAgencyClient.communication.message;

import java.io.Serializable;

public class GetFullArticleRequest extends CommRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String title;

	public GetFullArticleRequest() {
		super();
	}
	
	public GetFullArticleRequest(String title) {
		super(MessageType.GET_FULL_ARTICLE_REQUEST.type);
		this.title = title;
	}
	
	public GetFullArticleRequest(String message, String title) {
		super(message);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}