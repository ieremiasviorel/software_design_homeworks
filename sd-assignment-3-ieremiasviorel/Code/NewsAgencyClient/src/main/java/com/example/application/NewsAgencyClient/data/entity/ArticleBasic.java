package com.example.application.NewsAgencyClient.data.entity;

import java.io.Serializable;

public class ArticleBasic implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String title;

	private String summary;
	
	private Writer author;

	public ArticleBasic() {
		super();
	}
	
	public ArticleBasic(String title, String summary, Writer author) {
		super();
		this.title = title;
		this.summary = summary;
		this.author = author;
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

	public Writer getAuthor() {
		return author;
	}

	public void setAuthor(Writer author) {
		this.author = author;
	}
}
