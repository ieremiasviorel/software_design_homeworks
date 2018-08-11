package com.example.application.NewsAgencyServer.communication.message;

import java.io.Serializable;

public class GetArticlesRequest extends CommRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer pageIndex;

	public GetArticlesRequest() {
		super();
	}
	
	public GetArticlesRequest(Integer pageIndex) {
		super(MessageType.GET_ARTICLES_REQUEST.type);
		this.pageIndex = pageIndex;
	}
	
	public GetArticlesRequest(String message, Integer pageIndex) {
		super(message);
		this.pageIndex = pageIndex;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
}
