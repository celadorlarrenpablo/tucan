package com.tucanbank.servicio_prueba.modelo;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empleado {

    private Long id;
    private Long idDepartamento;
    private String nombre;
    private String email;
    private String posicion;

}
