package com.example.application.NewsAgencyClient.data.entity;

import java.io.Serializable;
import java.util.Set;

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String title;

	private String summary;

	private String body;

	private Writer author;

	private Set<Article> relatedArticles;

	private Set<Article> references;

	public Article() {
	}

	public Article(Long id, String title, String summary, String body, Writer author, Set<Article> relatedArticles,
			Set<Article> references) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.body = body;
		this.author = author;
		this.relatedArticles = relatedArticles;
		this.references = references;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Writer getAuthor() {
		return author;
	}

	public void setAuthor(Writer author) {
		this.author = author;
	}

	public Set<Article> getRelatedArticles() {
		return relatedArticles;
	}

	public void setRelatedArticles(Set<Article> relatedArticles) {
		this.relatedArticles = relatedArticles;
	}

	public Set<Article> getReferences() {
		return references;
	}

	public void setReferences(Set<Article> references) {
		this.references = references;
	}
}
