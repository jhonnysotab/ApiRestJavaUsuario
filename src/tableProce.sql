CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `fechaNac` datetime DEFAULT NULL,
  `puesto` varchar(45) DEFAULT NULL,
  `espectativaSalarial` decimal(7,5) DEFAULT NULL,
  `salarioReal` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_bin

USE `pruebaapirest`;
DROP procedure IF EXISTS `sp_updateInsertUsuario`;

USE `pruebaapirest`;
DROP procedure IF EXISTS `pruebaapirest`.`sp_updateInsertUsuario`;
;

DELIMITER $$
USE `pruebaapirest`$$
CREATE PROCEDURE `sp_updateInsertUsuario`(IN pId INT,
    IN pNombre VARCHAR(50),
    IN pApellido VARCHAR(50),
    IN pFechaNac datetime,
    IN pEdad int,
	IN pPuesto VARCHAR(50),
    IN pEspecSal DECIMAL(7,5),
    IN pSalario VARCHAR(50),
    IN pEstado BOOLEAN
    )
BEGIN

	INSERT INTO usuario (nombre,
				apellidos,
				edad,
				fechaNac,
				puesto,
				espectativaSalarial, 
				salarioReal,
				estado)
                VALUES(pNombre,
				pApellido,
				pFechaNac,
				pEdad,
				pPuesto,
				pEspecSal,
				pSalario,
				pEstado)
                
ON duplicate key update
			nombre = pNombre,
            apellidos = pApellido,
            edad = pFechaNac,
            fechaNac = pEdad,
            puesto = pPuesto,
            espectativaSalarial = pEspecSal,
            salarioReal = pSalario;
            
END$$

DELIMITER ;
;

