package com.webtucan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Cuentas {

    @GetMapping("/cuentas")
    public List<Map<String, String>> getCuentas() {
        List<Map<String, String>> cuentas = new ArrayList<>();

        // Cuenta 1
        Map<String, String> c1 = new HashMap<>();
        c1.put("tipo", "Cuenta Corriente Tucán");
        c1.put("saldo", "2.450,50 €");
        c1.put("iban", "ES21 0001 0002 0003");

        // Cuenta 2
        Map<String, String> c2 = new HashMap<>();
        c2.put("tipo", "Fondo de Ahorro Selva");
        c2.put("saldo", "12.000,00 €");
        c2.put("iban", "ES21 9999 8888 7777");

        cuentas.add(c1);
        cuentas.add(c2);
        
        return cuentas;
    }
}