package com.example.jsota.apirest.repositories;

import java.sql.Date; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.jsota.apirest.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

      @Query(value ="{call sp_updateInsertUsuario(:pId, :pNombre, :pApellido, :pFechaNac, :pEdad, :pPuesto, :pEspecSal,:pSalario, :pEstado)}",nativeQuery =  true)
       void agregarUpdate(
        @Param("pId")int pId, 
        @Param("pNombre")String pNombre, 
        @Param("pApellido")String pApellido, 
        @Param("pFechaNac")Date pFechaNac, 
        @Param("pEdad")int pEdad, 
        @Param("pPuesto")String pPuesto, 
        @Param("pEspecSal")double pEspecSal, 
        @Param("pSalario")String pSalario, 
        @Param("pEstado")boolean pEstado 
       );

    
}