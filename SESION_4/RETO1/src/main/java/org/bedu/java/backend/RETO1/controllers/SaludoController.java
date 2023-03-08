package org.bedu.java.backend.RETO1.controllers;

import org.bedu.java.backend.RETO1.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre) {
        Saludo saludo = new Saludo();
        saludo.setMessage("¡¡Hola mundo!!");
        saludo.setName(nombre);

        return saludo;
    }
}
