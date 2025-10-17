package com.book_service.book_service.mapper;

import java.time.LocalDate;

import com.book_service.book_service.dto.BookRequestDTO;
import com.book_service.book_service.dto.BookResponseDTO;
import com.book_service.book_service.model.Book;

public class BookMapper {
    public static BookResponseDTO toDTO(Book book){
        BookResponseDTO bookResponseDTO = new BookResponseDTO();

        bookResponseDTO.setId(book.getId().toString());
        bookResponseDTO.setTitle(book.getTitle());
        bookResponseDTO.setAuthor(book.getAuthor());
        bookResponseDTO.setIsbn(String.valueOf(book.getIsbn()));
        bookResponseDTO.setPublishedDate(book.getPublishedDate().toString());
        bookResponseDTO.setGenre(book.getGenre());
        bookResponseDTO.setAvailableCopies(String.valueOf(book.getAvailableCopies()));
        return bookResponseDTO;
    }

   public static Book toEntity(BookRequestDTO bookRequestDTO){
    Book book = new Book();
    
    book.setTitle(bookRequestDTO.getTitle());
    book.setAuthor(bookRequestDTO.getAuthor());
    book.setIsbn(bookRequestDTO.getIsbn());
    book.setPublishedDate(LocalDate.parse(bookRequestDTO.getPublishedDate()));
    book.setGenre(bookRequestDTO.getGenre());
    book.setAvailableCopies(Integer.parseInt(bookRequestDTO.getAvailableCopies()));
    book.setContactEmail(bookRequestDTO.getContactEmail());
    
    return book;
}
}
