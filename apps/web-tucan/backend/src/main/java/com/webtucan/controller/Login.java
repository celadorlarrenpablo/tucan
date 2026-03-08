package com.webtucan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Login {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> datosRecibidos) {
        String usuario = datosRecibidos.get("username");
        String password = datosRecibidos.get("password");

        // Log en la consola de Java para verificar que llegan los datos
        System.out.println("Intento de login recibido:");
        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + password);
        
        // 2. Preparamos la respuesta (Mock de "OK")
        HashMap<String, String> respuesta = new HashMap<>();
        respuesta.put("estado", "OK");
        respuesta.put("mensaje", "Autenticación exitosa");
        
        // Añadimos el campo "nombre" que el JS busca para guardar en el localStorage
        respuesta.put("nombre", "Tucán Administrador"); 
        
        return respuesta;
    }
}