package com.example.application.NewsAgencyServer.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.business.ArticleService;
import com.example.application.NewsAgencyServer.data.entity.Article;
import com.example.application.NewsAgencyServer.data.repository.ArticleJpaRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleJpaRepository articleRepository;
	
	public Article getArticle(Long id) {
		return articleRepository.findById(id).get();
	}
	
	public Article getArticle(String title) {
		return articleRepository.findByTitle(title);
	}
}
