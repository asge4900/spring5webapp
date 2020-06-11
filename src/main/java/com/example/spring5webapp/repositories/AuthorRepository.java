package com.example.spring5webapp.repositories;

import com.example.spring5webapp.domain.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}