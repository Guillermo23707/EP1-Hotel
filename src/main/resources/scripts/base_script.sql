
create table clientes(
	 idCli int,
     paisCli varchar(50),
	 nombreCli varchar(50),
	 apellidoCli varchar(50),
	 DireccionCli varchar(100),
	 telefonoCli varchar(20)
)

select * from clientes

ALTER TABLE clientes ADD PRIMARY KEY (idCli);

ALTER TABLE clientes MODIFY COLUMN idCli int auto_increment NOT NULL;

INSERT INTO clientes (paisCli,nombreCli,apellidoCLi,DireccionCli,telefonoCli)
VALUES ('Italia','Carmen','Falcon','Roma','979797979');

update clientes set paiscli='Perú' where idCli=2;

delete from clientes where idCli=4;
