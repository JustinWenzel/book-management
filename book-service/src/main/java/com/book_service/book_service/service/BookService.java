package com.book_service.book_service.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.book_service.book_service.dto.BookResponseDTO;
import com.book_service.book_service.mapper.BookMapper;
import com.book_service.book_service.model.Book;
import com.book_service.book_service.repository.BookRepository;


@Service
public class BookService {
    private BookRepository bookRepository;



    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public List<BookResponseDTO> getBooks(){
        List<Book> books = this.bookRepository.findAll();
        

        List <BookResponseDTO> bookDTOs = books.stream().map(book -> BookMapper.toDTO(book)).toList();

        return bookDTOs;
        
    }


    
}
