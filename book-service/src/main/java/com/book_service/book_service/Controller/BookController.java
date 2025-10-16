package com.book_service.book_service.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book_service.book_service.dto.BookResponseDTO;
import com.book_service.book_service.service.BookService;

@RestController
@RequestMapping(/books)
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO> getPatients(){
        List<BookResponseDTO> bookResponseDTOs = bookService.getBooks();

        return ResponseEntity.ok().body(bookResponseDTOs);
    } 
    

}
