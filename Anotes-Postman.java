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


// POST:
'http://localhost:8000/api/api-token-auth/' -> Nos autenticamos con username y password y nos devuelve un token.

-- Agregar comentario a Material con POST:
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

