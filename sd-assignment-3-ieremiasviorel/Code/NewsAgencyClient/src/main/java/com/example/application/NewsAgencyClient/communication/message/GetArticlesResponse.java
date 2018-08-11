package com.example.application.NewsAgencyClient.communication.message;

import java.io.Serializable;
import java.util.List;

import com.example.application.NewsAgencyClient.data.entity.ArticleBasic;

public class GetArticlesResponse extends CommResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<ArticleBasic> articles;
	
	public GetArticlesResponse() {
		super();
	}
	
	public GetArticlesResponse(List<ArticleBasic> articles) {
		super(MessageType.GET_ARTICLES_RESPONSE.type);
		this.articles = articles;
	}
	
	public GetArticlesResponse(String message, List<ArticleBasic> articles) {
		super(message);
		this.articles = articles;
	}
	
	public List<ArticleBasic> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleBasic> articles) {
		this.articles = articles;
	}
}
