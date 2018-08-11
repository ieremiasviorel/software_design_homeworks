package com.example.application.NewsAgencyServer.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.NewsAgencyServer.data.entity.Article;
import com.example.application.NewsAgencyServer.data.entity.Writer;

@Repository
public interface ArticleJpaRepository extends JpaRepository<Article, Long > {

	public Optional<Article> findById(Long id);
	
	public Article findByTitle(String title);
	
	public List<Article> findAllByAuthor(Writer author);
}
