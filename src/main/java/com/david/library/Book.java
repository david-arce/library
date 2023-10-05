package com.david.library;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "book")
public class Book {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private  String genero;
    private String editorial;
    private String publicacion;
    private String sipnosis;

}
