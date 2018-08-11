package com.example.application.NewsAgencyServer.communicaton.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.business.impl.ArticleBasicServiceImpl;
import com.example.application.NewsAgencyServer.business.impl.ArticleServiceImpl;
import com.example.application.NewsAgencyServer.business.impl.WriterServiceImpl;
import com.example.application.NewsAgencyServer.communication.message.GetArticlesRequest;
import com.example.application.NewsAgencyServer.communication.message.GetArticlesResponse;
import com.example.application.NewsAgencyServer.communication.message.GetFullArticleRequest;
import com.example.application.NewsAgencyServer.communication.message.GetFullArticleResponse;
import com.example.application.NewsAgencyServer.communication.message.LoginRequest;
import com.example.application.NewsAgencyServer.communication.message.LoginResponse;
import com.example.application.NewsAgencyServer.data.entity.Article;
import com.example.application.NewsAgencyServer.data.entity.ArticleBasic;
import com.example.application.NewsAgencyServer.data.entity.Writer;

@Service
public class RequestExecutor {

	@Autowired
	private WriterServiceImpl writerService;

	@Autowired
	private ArticleBasicServiceImpl articleBasicService;

	@Autowired
	private ArticleServiceImpl articleService;

	public LoginResponse executeRequest(LoginRequest request) {
		String userName = request.getUserName();
		String password = request.getPassword();
		Writer writer = this.writerService.login(userName, password);
		LoginResponse response = new LoginResponse(writer);
		return response;
	}

	public GetArticlesResponse executeRequest(GetArticlesRequest request) {
		List<ArticleBasic> articleBasicList = articleBasicService.getFirstArticles();
		GetArticlesResponse response = new GetArticlesResponse(articleBasicList);
		return response;
	}

	public GetFullArticleResponse executeRequest(GetFullArticleRequest request) {
		String title = request.getTitle();
		Article article = articleService.getArticle(title);
		GetFullArticleResponse response = new GetFullArticleResponse(article);
		return response;
	}

}
