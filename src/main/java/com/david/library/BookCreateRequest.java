package com.david.library;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BookCreateRequest {
    @JsonProperty
    private String titulo;
    @JsonProperty
    private String autor;
    @JsonProperty
    private String genero;
    @JsonProperty
    private String editorial;
    @JsonProperty
    private String publicacion;
    @JsonProperty
    private String sipnosis;

}
