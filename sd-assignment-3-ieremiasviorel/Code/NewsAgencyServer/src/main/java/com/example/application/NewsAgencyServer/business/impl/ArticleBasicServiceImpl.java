package com.example.application.NewsAgencyServer.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.business.ArticleBasicService;
import com.example.application.NewsAgencyServer.data.entity.ArticleBasic;
import com.example.application.NewsAgencyServer.data.repository.ArticleBasicJpaRepository;

@Service
public class ArticleBasicServiceImpl implements ArticleBasicService {

	@Autowired
	private ArticleBasicJpaRepository articleBasicRepository;
	
	public ArticleBasic getArticleBasic(Long id) {
		return articleBasicRepository.findById(id).get();
	}
	
	public ArticleBasic getArticleBasic(String title) {
		return articleBasicRepository.findByTitle(title);
	}
	
	public List<ArticleBasic> getFirstArticles() {
		return articleBasicRepository.findAll().subList(0, 6);
	}
}
