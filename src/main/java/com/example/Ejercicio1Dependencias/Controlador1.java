package com.example.Ejercicio1Dependencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controlador1 {

    @Autowired
    Persona persona;

    @GetMapping("/controlador1/persona")
    public Persona recibePersona(@RequestParam(required = true) String nombreP, @RequestParam(required = false) String poblacion, @RequestParam(required=false) Integer edad)
    {
        if(poblacion ==null){
            poblacion ="";
        }
        if (edad==null){
            edad=0;
        }

        persona.setEdad(edad);
        persona.setNombre(nombreP);
        persona.setPoblacion(poblacion);
        return persona;
    }
}
