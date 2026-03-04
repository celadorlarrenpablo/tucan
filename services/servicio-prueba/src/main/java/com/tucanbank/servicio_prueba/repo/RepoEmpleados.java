package com.tucanbank.servicio_prueba.repo;

import com.tucanbank.servicio_prueba.modelo.Empleado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoEmpleados {


    private List<Empleado> empleados;

    public RepoEmpleados(){
        empleados = new ArrayList<>();
    }

    public List<Empleado> getAllEmpleados(){
        return empleados;
    }

    public List<Empleado> getEmpleadoPorIdDepartamento(Long idDepartamento){
        return empleados.stream().filter(empleado -> empleado.getIdDepartamento().equals(idDepartamento)).toList();
    }

    public void crearEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
}
