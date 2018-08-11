package com.example.application.NewsAgencyServer.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.application.NewsAgencyServer.data.entity.ArticleBasic;
import com.example.application.NewsAgencyServer.data.entity.Writer;

@Repository
public interface ArticleBasicJpaRepository extends PagingAndSortingRepository<ArticleBasic, Long> {

	public Optional<ArticleBasic> findById(Long id);
	
	public ArticleBasic findByTitle(String title);
	
	public List<ArticleBasic> findAllByAuthor(Writer author);
	
	public List<ArticleBasic> findAll();
}
