package com.example.application.NewsAgencyServer.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.NewsAgencyServer.data.entity.Writer;

@Repository
public interface WriterJpaRepository extends JpaRepository<Writer, Long> {

	public Optional<Writer> findById(Long id);
	
	public Writer findByUserName(String userName);
	
	public Writer findByUserNameAndPassword(String userName, String password);
}
