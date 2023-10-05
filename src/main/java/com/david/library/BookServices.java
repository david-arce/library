package com.david.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
    @Autowired
    private BookRepository bookRepository ;
    public Book createBook(BookCreateRequest bookCreateRequest ){
        Book book = Book.builder()
                .titulo(bookCreateRequest .getTitulo())
                .autor(bookCreateRequest .getAutor())
                .genero(bookCreateRequest .getGenero())
                .editorial(bookCreateRequest .getEditorial())
                .publicacion(bookCreateRequest .getPublicacion())
                .sipnosis(bookCreateRequest .getSipnosis ())
                .build();
        return bookRepository.save(book);
    }

}
