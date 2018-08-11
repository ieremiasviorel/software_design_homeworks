package com.example.application.NewsAgencyServer.communicaton.util;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.communication.message.CommPackage;
import com.example.application.NewsAgencyServer.communication.message.CommResponse;
import com.example.application.NewsAgencyServer.communication.message.GetArticlesRequest;
import com.example.application.NewsAgencyServer.communication.message.GetFullArticleRequest;
import com.example.application.NewsAgencyServer.communication.message.LoginRequest;
import com.example.application.NewsAgencyServer.communication.message.MessageType;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RequestInterpreter {

	@Autowired
	protected RequestExecutor requestExecutor;
	
	private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	public CommResponse interpretRequest(String requestJson) throws JsonParseException, JsonMappingException, IOException {
		
		CommPackage command = objectMapper.readValue(requestJson, CommPackage.class);
		
		if (command.getMessage().equals(MessageType.LOGIN_REQUEST.type)) {
			return requestExecutor.executeRequest(objectMapper.readValue(requestJson, LoginRequest.class));
		}
		else if (command.getMessage().equals(MessageType.GET_ARTICLES_REQUEST.type)) {
			return requestExecutor.executeRequest(objectMapper.readValue(requestJson, GetArticlesRequest.class));
		}
		else if (command.getMessage().equals(MessageType.GET_FULL_ARTICLE_REQUEST.type)) {
			return requestExecutor.executeRequest(objectMapper.readValue(requestJson, GetFullArticleRequest.class));
		}
		else {
			return null;
		}
	}
}
