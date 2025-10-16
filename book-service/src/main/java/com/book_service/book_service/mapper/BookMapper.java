package com.book_service.book_service.mapper;

import com.book_service.book_service.dto.BookResponseDTO;
import com.book_service.book_service.model.Book;

public class BookMapper {
    public static BookResponseDTO toDTO(Book book){
        BookResponseDTO bookResponseDTO = new BookResponseDTO();

        bookResponseDTO.setId(book.getId().toString());
        bookResponseDTO.setTitel(book.getTitel());
        bookResponseDTO.setAuthor(book.getAuthor());
        bookResponseDTO.setIsbn(String.valueOf(book.getIsbn()));
        bookResponseDTO.setReleaseDate(book.getReleaseDate().toString());
        bookResponseDTO.setGenre(book.getGenre());
        bookResponseDTO.setQuantity(String.valueOf(book.getQuantity()));
        return bookResponseDTO;
    }
}
