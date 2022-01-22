package com.example.rmsys.repository;

import com.example.rmsys.Entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{
    
}
