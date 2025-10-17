package com.book_service.book_service.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book_service.book_service.dto.BookResponseDTO;
import com.book_service.book_service.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getBooks(){
        List<BookResponseDTO> bookResponseDTOs = bookService.getBooks();

        return ResponseEntity.ok().body(bookResponseDTOs);
    } 

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@Valid @RequestBody BookRequestDTO bookRequestDTO){
        BookResponseDTO bookResponseDTO = bookService.createBook(bookRequestDTO);

        return ResponseEntity.ok().body(bookResponseDTO);
    }
    

}
