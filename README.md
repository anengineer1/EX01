# EX01
Prueba técnica

## Endpoints

### Usuarios
	GET Listar usuarios
	* /usuarios
	POST crear usuario
	* /usuarios
	POST Modificar usuario dado id (RF.6)
	* /usuario/{id}
	PUT Eliminar usuario de la sala (RF.3):
	* /usuario/{id}

###	Juego
	GET Obtiene datos del juego (usuarios y partidas)(RF.2):
  * /juego/
  * /juego/{id}


### Salas (partida)
	GET Listar salas
  * /party
	POST Crear sala (Party), (RF.1)
  * /party
  
### Mensajes
	POST Crear mensaje (RF.4)
	* /mensaje
	GET mostrar mensaje dado el idparty (RF.5)
	* /mensaje/{idparty}
