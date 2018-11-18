create database Empresa

use Empresa
create schema RRHH
create schema Compras
create schema Ventas

create table RRHH.tipoUsuario(
id_tipo int(11) primary key,
nomTipo varchar(45),
Config boolean,
AddMesa boolean,
ConfigPre boolean,
ModifPro boolean
)
create table RRHH.Usuarios(
idUser int primary key  auto_increment,
Usuario varchar(45) ,
pwdUser varchar(45),
Correo varchar(45),
nomUser varchar(45),
apeUser varchar(60),
last_Sesion varchar(30),
time_SignIn varchar(30),
id_tipo int(11) ,
foreign key (id_tipo) references RRHH.tipoUsuario(id_tipo)
)
create table Compras.TipoProducto(
 id_tipoPro int(11) primary key,
 nom_tiPro varchar(45)
)
create table Compras.{
idCat varchar(45),
nomCat varchar(45)
}


create table  Ventas.Productos(
idProduc varchar(45),
nomProd varchar(50),

)

fhbfg   



#drop database tb_Usuario
insert into RRHH.tipoUsuario values(0,'Usuario',default,default,default,default)
insert into RRHH.tipoUsuario values(2,'Administrador',false,default,default,default)

drop table tipo

insert into tb_Usuario (usuario,pwdUser) values('admin','admin')

select*from RRHH.Usuarios
select*from RRHH.tipoUsuario
select*from tb_Usuario where Usuario = ? and pwdUser= ?

DELIMITER $$
CREATE PROCEDURE Sign_in(usr varchar(45), pws char(45))
BEGIN
select * from Usuario
 where usuario = usr and pwdUser = pws;
END $$
DELIMITER ;
execute Sign_in 'admin','admin';
