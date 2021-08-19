### Curl's Request ###


## Get de todos los titulares juridicos que hay en la base ##

curl --location --request GET 'http://localhost:8080/api/titular/juridico/findAll'


## Get de todos los titulares fisicos que hay en la base ##

curl --location --request GET 'http://localhost:8080/api/titular/fisico/findAll'

## Post para generar un nuevo Titular fisico ##

curl --location --request POST 'http://localhost:8080/api/titular/fisico/new' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
    "name":"exampleName",
    "lastName": "exampleLastName",
    "rut" : 0000
}'
## Post para generar un nuevo Titular Juridico##

curl --location --request POST 'http://localhost:8080/api/titular/juridico/new' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
    "razonSocial":"exampleRazonSocial",
    "fechaFundacion": "01/01/1900", 
    "rut" : 0000
}'


## Front End ##

endpoint: http://localhost:3000/

#steps para correrlo#
1 - cd app
2 - npm i
3 - npm start

# funcionalidad #

Desde el front end se puede consultar el backend mediante http.

El mismo posee una interfaz basica la cual tiene un input de datos y se usa para filtrar
con el conjunto de elementos que obtuvimos en el llamado al back.


