package com.example.jsota.apirest.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="usuario")

public class UsuarioModel {

    @Getter @Setter @Id 
    @Column(unique = true, nullable = false)
    private Integer id;
    @Getter @Setter 
    private String nombre;
    @Getter @Setter 
    private String apellidos;
    @Getter @Setter 
    private Integer edad;
    @Getter @Setter 
    private Date fechaNac;
    @Getter @Setter 
    private String puesto;
    @Getter @Setter 
    private double espectativaSalarial;
    @Getter @Setter 
    private String salarioReal;
    @Getter @Setter 
    private  boolean isEstado;
 


}