# LP3-AdministracionDeportiva  (FALTA documentacion - Coming Soon!)
Sistema de intercambio de jugadores de fútbol.  [ U.C.A ]

******************* Instrucciones 
----
1. Crear una carpeta nueva
2. Asociar la carpeta a un repositorio Git(Tener Instalado Git previamente):
3. git init
4. git remote add origin https://github.com/FabriCubi/LP3-AdministracionDeportiva.git
5. git pull origin master
6. Situarse con la consola en el directorio que contenga el archivo pom.xml
7. Construir el proyecto (tener previamente instalado maven).
8. mvn clean install
9. Cambiarse a la carpeta /target
10. java -jar administracion-deportiva-0.0.1-SNAPSHOT.jar
11. Usar?

********************** SERVICES
----

1. POST >>>  http://localhost:8080/persona/crear  

	{    
    "cedulaIdentidad" : "12345",  
	"nombreApellido":"Juan Perez",  
	"fechaNacimiento" :"23/11/1998",  
	"telefono" : "0982 xxx xxx",  
	"domicilio" : "Asuncion"  
	}  
	
2. http://localhost:8080/persona/consulta?ci=12345


AUTORES:
----
Fabrizio Cubilla - Oliva Mena
