package sos.biblioteca.cliente.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    private int prestamoId;
    private String fechaInicio;
    private String fechaDevolucion;
    private Boolean devuelto;
    private ResourceLink _links;

}
