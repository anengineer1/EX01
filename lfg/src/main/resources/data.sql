DROP TABLE IF EXISTS mensajes;
DROP table IF EXISTS salas;
DROP table IF EXISTS juegos;
DROP table IF EXISTS usuarios;

CREATE TABLE juegos (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  PRIMARY KEY (id),
);

CREATE TABLE salas (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  juego nvarchar(100) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT juego_fk FOREIGN KEY (juego) REFERENCES juegos (id)
);


CREATE TABLE usuarios (
  username nvarchar(100) NOT NULL,
  name nvarchar(255) NOT NULL,
  email nvarchar(100) DEFAULT NULL,
  idsala int DEFAULT NULL,
  PRIMARY KEY (username)
  CONSTRAINT sala_fk FOREIGN KEY (idsala) REFERENCES salas (id)
);


CREATE TABLE mensajes (
  id int NOT NULL AUTO_INCREMENT,
  contenido nvarchar(255) DEFAULT NULL,
  usuario nvarchar(100) NOT NULL,
  sala nvarchar(100) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT usuario_fk FOREIGN KEY (usuario) REFERENCES usuarios (username)
  CONSTRAINT sala_fk FOREIGN KEY (sala) REFERENCES salas (id)
);


insert into juegos (nombre, usuario) values ('Final Fantasy', 'pedro');
insert into juegos (nombre, usuario) values ('Pubg', 'laura');
insert into juegos (nombre, usuario) values ('Unreal tournamen', 'maria');

insert into salas (nombre, juego) values ('omaigot', 1);
insert into salas (nombre, juego) values ('labanza', 2);
insert into salas (nombre, juego) values ('Leche fresca y suave', 3);

insert into usuarios (unsername, email) values ('pedro', 'pe@gmail.com', 1);
insert into usuarios (unsername, email) values ('laura', 'alarga@gmail.com', 2);
insert into usuarios (unsername, email) values ('maria', 'mar@gmail.com'), 3;

insert into mensajes (contenido, usuario, sala) values ('Hola', 'pedro', 1);
insert into mensajes (contenido, usuario, sala) values ('Pinza', 'laura', 2);
insert into mensajes (contenido, usuario, sala) values ('Hola', 'maria', 3);
