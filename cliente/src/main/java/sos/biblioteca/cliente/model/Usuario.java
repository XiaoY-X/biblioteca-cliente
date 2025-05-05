package sos.biblioteca.cliente.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private Integer matricula;
    private String nombre;
    private String fechaNacimiento;
    private String correo;
    private String penalizacion;
    private ResourceLink _links;

}
