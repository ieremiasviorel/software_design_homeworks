package com.example.application.NewsAgencyServer.data.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "article")
public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title")
	private String title;

	@Lob
	@Column(name = "summary")
	private String summary;

	@Lob
	@Column(name = "body")
	private String body;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "author_id")
	private Writer author;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "reference", joinColumns = { @JoinColumn(name = "article_id") }, inverseJoinColumns = {
			@JoinColumn(name = "reference_id") })
	private Set<Article> relatedArticles;

	@JsonIgnore
	@ManyToMany(mappedBy = "relatedArticles")
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

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}
