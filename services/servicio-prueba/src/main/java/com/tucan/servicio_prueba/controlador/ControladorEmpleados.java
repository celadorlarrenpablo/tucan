package com.tucan.servicio_prueba.controlador;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tucan.servicio_prueba.modelo.Empleado;
import com.tucan.servicio_prueba.repo.RepoEmpleados;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/empleados")
public class ControladorEmpleados {

    private final RepoEmpleados repoEmpleados;

    @GetMapping
    public ResponseEntity<List<Empleado>> getAllEmpleados(){
        return ResponseEntity.ok(repoEmpleados.getAllEmpleados());
    }

    @GetMapping("/departamento/id")
    public ResponseEntity<List<Empleado>> getEmpleadoPorIdDepartamento(Long idDepartamento){
        return ResponseEntity.ok(repoEmpleados.getEmpleadoPorIdDepartamento(idDepartamento));
    }

    @PostMapping
    public ResponseEntity<Void> crearEmpleado(@RequestBody Empleado empleado){
        repoEmpleados.crearEmpleado(empleado);
        return ResponseEntity.created(URI.create("/api/v1/empleados".concat(empleado.getId().toString()))).build();
    }



}
