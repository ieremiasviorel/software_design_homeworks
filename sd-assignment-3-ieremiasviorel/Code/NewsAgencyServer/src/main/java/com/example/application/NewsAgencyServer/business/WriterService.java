package com.example.application.NewsAgencyServer.business;

import com.example.application.NewsAgencyServer.data.entity.Writer;

public interface WriterService {

	public Writer getWriter(Long id);
	
	public Writer getWriter(String userName);
	
	public Writer getWriter(String userName, String password);
}
