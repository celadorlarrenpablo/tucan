package com.tucan.msempleados.controlador;


import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tucan.msempleados.modelo.Empleado;
import com.tucan.msempleados.repo.RepoEmpleados;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

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

    @GetMapping("/departamento/{id}")
    public ResponseEntity<List<Empleado>> getEmpleadoPorIdDepartamento(@PathVariable("id") Long idDepartamento) {
        return ResponseEntity.ok(repoEmpleados.getEmpleadoPorIdDepartamento(idDepartamento));
    }

    @PostMapping
    public ResponseEntity<Void> crearEmpleado(@RequestBody Empleado empleado){
        repoEmpleados.crearEmpleado(empleado);
        return ResponseEntity.created(URI.create("/api/v1/empleados".concat(empleado.getId().toString()))).build();
    }



}
