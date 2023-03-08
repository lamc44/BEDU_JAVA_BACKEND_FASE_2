package org.bedu.java.backend.EJEMPLO_2.controllers;

import org.bedu.java.backend.EJEMPLO_2.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public Saludo saluda(){
        Saludo saludo = new Saludo();
        saludo.setMessage("¡¡Hola mundo!!");

        return saludo;
    }
}
