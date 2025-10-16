package com.book_service.book_service.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book_service.book_service.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID>{

    
}
