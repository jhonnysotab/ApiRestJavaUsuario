package com.example.jsota.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsota.apirest.models.UsuarioModel;
import com.example.jsota.apirest.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
      UsuarioRepository usuarioRepository;

    public void agregarUpdate(UsuarioModel usuario){
        usuarioRepository.agregarUpdate(usuario.getId(),
                                        usuario.getNombre(), 
                                        usuario.getApellidos(),
                                        usuario.getFechaNac(),
                                        usuario.getEdad(), 
                                        usuario.getPuesto(),
                                        usuario.getEspectativaSalarial(),
                                        usuario.getPuesto(),
                                        usuario.isEstado()
                                        );


    }
}