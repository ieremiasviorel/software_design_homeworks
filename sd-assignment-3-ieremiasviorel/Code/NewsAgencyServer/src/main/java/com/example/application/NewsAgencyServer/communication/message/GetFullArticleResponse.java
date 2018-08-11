package com.example.application.NewsAgencyServer.communication.message;

import java.io.Serializable;

import com.example.application.NewsAgencyServer.data.entity.Article;

public class GetFullArticleResponse extends CommResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Article article;
	
	public GetFullArticleResponse() {
		super();
	}
	
	public GetFullArticleResponse(Article article) {
		super(MessageType.GET_FULL_ARTICLE_RESPONSE.type);
		this.article = article;
	}
	
	public GetFullArticleResponse(String message, Article article) {
		super(message);
		this.article = article;
	}
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}