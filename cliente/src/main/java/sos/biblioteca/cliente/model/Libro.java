package sos.biblioteca.cliente.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

    private int id;
    private String titulo;
    private String isbn;
    private String autor;
    private String edicion;
    private String editorial;
    private ResourceLink _links;

}
