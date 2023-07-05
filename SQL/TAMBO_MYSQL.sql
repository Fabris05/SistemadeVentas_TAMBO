create database TAMBO
USE TAMBO;
drop table CLIENTE
create table CLIENTE(
DNI varchar (8) PRIMARY KEY,
Nombre varchar(25),
Apellido varchar(25),
Direccion varchar(150),
Celular varchar(25),
Email varchar(70),
Pass varchar(25)
);

SELECT * FROM CLIENTE
 
CREATE TABLE PRODUCTO (
  Codigo varchar(10) PRIMARY KEY,
  Producto varchar(50),
  Categoria varchar(50),
  Descripcion varchar(125),
  Stock int,
  Precio decimal(10,2),
  FOREIGN KEY (Categoria) REFERENCES CATEGORIA(Categoria)
);


Drop TABLE PRODUCTO
SELECT * FROM PRODUCTO

CREATE TABLE CATEGORIA(
Categoria varchar(50) Primary key
);

