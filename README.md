# EX01
Prueba técnica

## Endpoints

### Usuarios
GET 
* /api/usuarios (Listar usuarios)
* /api/usuarios/{id} (Muestra 1 usuario dado su username)
* /api/usuarios/sala/{idsala} (Dada una salaID, muestar los usuarios dentro de la misma)

POST
* /api/usuarios (Instroducir usuario)

PUT
* /api/usuarios/{id} (Modifica un usario dando su username)

DELETE
* /api/usuarios/{id} (Borra usuario dando su username)

###	Juego

GET 
* /api/juegos (Listar juegos)
* /api/juegos/{id} (Muestra 1 juego dado su id)

POST
* /api/juegos (Instroducir juego)

PUT
* /api/juegos/{id} (Modifica un juego dando su id)

DELETE
* /api/juegos/{id} (Borra juego dando su id)


### Salas (partida)
GET 
* /api/salas (Listar salas)
* /api/salas/{id} (Muestra 1 sala dado su id)

POST
* /api/salas (Introducir sala)

PUT
* /api/salas/{id} (Modifica una sala dando su id)

DELETE
* /api/salas/{id} (Borra sala dando su id)

### Mensajes
GET 
* /api/mensajes (Listar mensajes)
* /api/mensajes/{id} (Muestra 1 mensajes dado su id)
* /api/mensajes/sala/{idsala} (Dada una salaID, muestar los mensajes dentro de la misma)

POST
* /api/mensajes (Introducir sala)

PUT
* /api/mensajes/{id} (Modifica una mensaje dando su id)

DELETE
* /api/mensajes/{id} (Borra mensaje dando su id)
