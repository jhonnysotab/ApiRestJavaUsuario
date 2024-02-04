package com.example.jsota.apirest.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsota.apirest.models.UsuarioModel; 
import com.example.jsota.apirest.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
 
    @PostMapping("/agregarUpdate")
    public ResponseEntity<?> AgregarUpdatee(@RequestBody UsuarioModel usuario) {
        try
        {
            usuarioService.agregarUpdate(usuario);
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
        return new ResponseEntity("Guardado exitoso", HttpStatusCode.valueOf(200));
    }
}