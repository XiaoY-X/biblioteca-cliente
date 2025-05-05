package sos.biblioteca.cliente.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ejemplar{
    private int id;
    private int libroId;
    private String estado; // disponible, prestado o baja
    private ResourceLink _links;

    @Override
    public String toString(){
        return "ID: " + id + ", libro-id: " + libroId + ", estado: " + estado; 
    }
}
