package com.example.application.NewsAgencyClient.presentation.controller.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import com.example.application.NewsAgencyClient.communication.message.CommPackage;
import com.example.application.NewsAgencyClient.communication.message.GetArticlesResponse;
import com.example.application.NewsAgencyClient.communication.message.GetFullArticleResponse;
import com.example.application.NewsAgencyClient.communication.message.MessageType;
import com.example.application.NewsAgencyClient.data.entity.Article;
import com.example.application.NewsAgencyClient.data.entity.ArticleBasic;
import com.example.application.NewsAgencyClient.presentation.view.MainView;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseInterpreter implements Runnable {
	
	private BufferedReader in;
	
	private MainView view;
	
	private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	public ResponseInterpreter(BufferedReader in, MainView view) {
		this.in = in;
		this.view = view;
	}
	
	public void interpretResponse(String responseJson) throws JsonParseException, JsonMappingException, IOException {
		CommPackage response = objectMapper.readValue(responseJson, CommPackage.class);
		
		if (response.getMessage().equals(MessageType.GET_ARTICLES_RESPONSE.type)) {
			executeUpdate(objectMapper.readValue(responseJson, GetArticlesResponse.class));
		}
		else if (response.getMessage().equals(MessageType.GET_FULL_ARTICLE_RESPONSE.type)) {
			executeUpdate(objectMapper.readValue(responseJson, GetFullArticleResponse.class));
		}
	}
	
	public void executeUpdate(GetArticlesResponse response) {
		List<ArticleBasic> articles = response.getArticles();
		this.view.updateArticleBasicInfoPanels(articles);
	}
	
	public void executeUpdate(GetFullArticleResponse response) {
		Article article = response.getArticle();
		this.view.updateFullArticlePanel(article);
	}
	
	@Override
	public void run() {
		String line = null;
		try {
			while ((line = in.readLine()) != null) {
				interpretResponse(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
