package org.bedu.java.backend.EJEMPLO3.controllers;

import org.bedu.java.backend.EJEMPLO3.model.Saludo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){
        return saludo;
    }
}
