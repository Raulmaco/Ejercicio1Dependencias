package com.example.Ejercicio1Dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired
    Persona persona;

    @GetMapping("devolver")
    public Persona devuelvePersona() {
        persona.setEdad(persona.edad*2);
        return persona;
    }
}
