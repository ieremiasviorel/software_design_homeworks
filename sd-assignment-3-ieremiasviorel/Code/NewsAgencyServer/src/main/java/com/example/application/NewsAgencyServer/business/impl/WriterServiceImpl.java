package com.example.application.NewsAgencyServer.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.NewsAgencyServer.business.WriterService;
import com.example.application.NewsAgencyServer.data.entity.Writer;
import com.example.application.NewsAgencyServer.data.repository.WriterJpaRepository;

@Service
public class WriterServiceImpl implements WriterService {

	@Autowired
	private WriterJpaRepository writerRepository;
	
	public Writer getWriter(Long id) {
		return writerRepository.findById(id).get();
	}
	
	public Writer getWriter(String userName) {
		return writerRepository.findByUserName(userName);
	}
	
	public Writer getWriter(String userName, String password) {
		return writerRepository.findByUserNameAndPassword(userName, password);
	}
	
	public Writer login(String userName, String password) {
		return writerRepository.findByUserNameAndPassword(userName, password);
	}
}
