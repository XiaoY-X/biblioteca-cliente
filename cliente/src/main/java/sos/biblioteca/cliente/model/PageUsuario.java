package sos.biblioteca.cliente.model;

import org.springframework.hateoas.PagedModel.PageMetadata;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageUsuario {
    private Usuarios _embedded;
    private PageLinks _links;
    private PageMetadata page;
}