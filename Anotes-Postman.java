// ENDPOINTS:
http://localhost:8000/api/courses/
http://localhost:8000/api/courses/2/


// FILTROS:
'http://localhost:8000/api/courses/?page_size=2' -> 
'http://localhost:8000/api/courses/?page=2'
'http://localhost:8000/api/courses/?page_size=1&page=2'

'http://localhost:8000/api/courses/?ordering=ranking' -> Ordenar de menor a mayor.
'http://localhost:8000/api/courses/?ordering=-ranking' -> Ordenar de mayor a menor.
'http://localhost:8000/api/courses/?page_size=1&page=2&ordering=-ranking&begin_date=2019-11-23' -> 


/* ******************* POST ******************* */
/* Para Realizar Peticiones Post normalmente tenemos que authenticarnos y paserle el token por la URL o Header*/ 
//AUTHENTICATION
'http://localhost:8000/api/api-token-auth/' -> Nos autenticamos con username y password y nos devuelve un token.
	//JSON_BODY
	{
			"username":"superadmin",
			"password":"ThisIs@SecurePassw0rd"
	}

	//JSON_RESPONSE
{
    "token": "b0e6f4141d042dbdbb6b725402e5cac601b55021"
}


// AGREGAR COMENTARIO A MATERIAL POR POST
    http://localhost:8000/api/comments/

    Headers:
    {
        Authorization: Token b0e6f4141d042dbdbb6b725402e5cac601b55021
    }

    Body:
    {
        "content": "This is a comment",
        "material": 4
    }


// VER COMENTARIO POR ID_MATERIAL
	http://localhost:8000/api/materials/4/comments



// AGREGAR_CURSO
	/*Request*/
	Method -> POST
	Endpoint -> http://localhost:8000/api/courses/
	json_body -> {
		"name": "Curso de SoapUI",
		"description": "Curso donde se aprendera a usar el Test API SOAP UI",
		"teachers": [{
			"name": "Jhordan Escobar",
			"description": "Devops Enginner",
			"current_job": "SRE in Xertica",
		}],
		"ranking": "5.00"
	}
	/*Response*/
	HTTP_Status: 201 (Created),
	Time: 45ms
	Response_size: 637 Bytes

// DAR LIKE Y DISLIKE A UN COMENTARIO
	Method -> POST
	Endpoint -> http://localhost:8000/api/comments/1/like/ -> COMENTARIO CON ID=1
							http://localhost:8000/api/comments/1/like/ -> COMENTARIO CON ID=1
	response -> {	
		"id": 1,
		"content": "This is a comment",
		"likes": 3,
		"created_at": "2022-03-09T21:35:49.433967Z",
		"updated_at": "2022-03-11T05:02:30.470062Z",
		"material": 4
	}

/* PASAR INFO CON X-WWW-FORM-URLENCODED CON POST */
Post acepta otr@s 2 formas para enviar información -> x-www-form-urlencoded
	// AGREGAR COMENTARIO CON X-WWWW-FORM-URLENCODED
		Method -> POST
		Content-Type -> application/x-www-form-urlencoded
		EndPoint -> http://localhost:8000/api/comments/
		Params -> 'Key:Value:Description '
								content : This Another Comment
								material : 4
		response -> {
			"id": 4,
			"content": "This Another Comment",
			"likes": 0,
			"created_at": "2022-03-11T05:16:10.112552Z",
			"updated_at": "2022-03-11T05:16:10.112552Z",
			"material": 4
		}
	// AGREGAR FILE CON FORM-DATA -> Sirve para cargar un File(Imagen, etc)
		Method -> POST
		Content-Type -> application/form-data
		EndPoint -> 

// TUTORIAL-9 -> TAREA -> Enviar una Petición Post que contenga un Array  con x-www-form-urlencoded o Form-Data
	Method ->  POST
	EndPoint -> http://localhost:8000/api/ 
			

// TUTORIAL-10 -> PUT
PUT -> Se usa para actualizar toda la instancia.
PATCH -> Es para actualzar solo una parte de la instancia.
Token -> b0e6f4141d042dbdbb6b725402e5cac601b55021

'http://localhost:8000/api/api-token-auth/' -> Authenticarnos en el API
'http://localhost:8000/api/materials/4/comments/' -> Ver los comentarios del material 4

//Actualizar campo Content de 1 Comentario.(PATCH)
INICIO:
	GET -> 'http://localhost:8000/api/comments/2/' -> Ver el comentario con id = 2
	{
		"id": 2,
		"content": "This is a comment 1",
		"likes": 0,
		"created_at": "2022-03-11T04:02:11.104024Z",
		"updated_at": "2022-03-11T04:02:11.104054Z",
		"material": 4
	}

ACCIÓN:
	PATCH -> Endpoint: 'http://localhost:8000/api/comments/2/' -> Ver el comentario con id = 2
	Body(application/json): {"content": "This is a comment 2"}


RESULTADO:
	GET -> 'http://localhost:8000/api/comments/2/' 
	{
		"id": 2,
		"content": "This is a comment 2",
		"likes": 0,
		"created_at": "2022-03-11T04:02:11.104024Z",
		"updated_at": "2022-03-15T04:53:51.396714Z",
		"material": 4
	}

/*Actualizar campo Content de 1 Comentario.(PATCH)*/
//INICIO:
	GET -> 'http://localhost:8000/api/comments/2/'

//ACCIÓN:
	PUT -> 'http://localhost:8000/api/comments/2/'
	Body(application/json): {
		"content": "This is a comment 2",
		"likes": 1,
		"material": 1
	}
//RESULTADO: Se cambio.

//TAREA: Averiguar si a se puede usar PUT y PATH con Form-Data

// TUTORIAL-11 -> ENVIRONMENT Y CONFIG COLECTIONS
Token -> Token b0e6f4141d042dbdbb6b725402e5cac601b55021

// TUTORIAL-13 -> EXAMPLES Y DOCUMENTATIONS
Tarea: Documentar todas las Request y Endpoints.


//CURLS:
curl -L -v --request GET \
--url 'http://localhost:8000/api/materials/2/' \
--header 'content-type: application/json' 


curl -L --request POST \
--url 'http://localhost:8000/api/api-token-auth/' \
--header 'content-type: application/json' \
--data '{
    "username": "superadmin",
    "password":"ThisIs@SecurePassw0rd"
}' 