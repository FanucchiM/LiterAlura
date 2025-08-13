Al crearse una base de datos local debe tener estos datos:

name: postgres@localhost
data base:postgres
spring.datasource.username=postgres
spring.datasource.password=1234





Al ejecutar el programa se desplegará un menu con ocho 8 opciones:

1)Buscar libro por título (comprueba si el título está en la api; de ser cierto, comprueba la base de datos y si no lo encuentra en ésta, lo agrega)
2)Listar libros registrados (muestra los libros almacenados en el repositorio)
3)Listar autores registrados (muestra los autores en el repositorio)
4)Listar autores vivos en un determinado año (se pide el ingreso de un año, v.g. 1800, 1900,... y muestra los autores que vivián en ese momento; en los casos en que no aparece la fecha de nacimiento, se verá un -1 y de ocurrir algo similar con la fecha de fallecimiento, se mostrará el valor 5000)
5)Listar libros por idioma (después de seleccionar esta alternativa, despliega otro menu para seleccionar el idioma, y traer el (los) libro(s) respectivo(s); de no encontrarse en la lista, debe aparece 'desconocido')

Tambien se incluyen las siguientes funcionalidades:

6)Buscar un libro en la base de datos (busca un libro específico en el repositorio y muestra la información si lo encuentra o un mensaje alternativo)
7)Buscar un autor (busca un autor específico, o bien un mensaje en caso de no encontrarlo)
8)Buscar los cinco libros (top 5) más descargados (el método consulta toda la base, eliminando posibles datos con null; ordena descendentemente y muestra el título, número de descarga y autor)


Para salir, elegir la opcion 0
