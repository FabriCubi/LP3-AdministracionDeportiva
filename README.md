# LP3-AdministracionDeportiva   (Me quede sin LUZ)
Sistema de intercambio de jugadores de fútbol. 
(FALTA documentación para el dia de la exposición- Coming Soon!)

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
11. Usar, donde y cuando?

********************** SERVICES
----

1.POST >>>  http://localhost:8080/persona/crear  

	{    
    	"cedulaIdentidad" : "1337000",  
	"nombreApellido":"Bruce Wayne",  
	"fechaNacimiento" :"27/05/1939",  
	"telefono" : "0982 xxx xxx",  
	"domicilio" : "Gotham City"  
	}  
----	
2.POST >> http://localhost:8080/empleado/guardar

	{
	"cedulaIdentidad" : "123456",
	"nombreApellido":"Pedro Perez",
	"fechaNacimiento" :"23/11/1997",
	"telefono" : "0981123457",
	"domicilio" : "Asuncion" ,
	"salario" : 123,
	"cargo" : "Prueba"
	}

----
3.POST >> http://localhost:8080/jugador/guardar
	
	{
	"cedulaIdentidad" : "1234567",
	"nombreApellido":"Diego Churín",
	"fechaNacimiento" :"1/12/1989 ",
	"telefono" : "0981123446",
	"domicilio" : "Asuncion" ,
	"salario" : 123,
	"puesto" : "Delantero",
	"equipo" : "CerroPorteño"
	}

----
4.POST >> http://localhost:8080/entrenador/guardar
	
	{
	"cedulaIdentidad" : "123455679",
	"nombreApellido":"Sergio Perez",
	"fechaNacimiento" :"23/11/1998",
	"telefono" : "0981123456",
	"domicilio" : "Asuncion" ,
	"salario" : 123,
	"equipo" : "CerroPorteño"
	}

----

5.POST >> http://localhost:8080/director/guardar
	
	{
	"cedulaIdentidad" : "12345678",
	"nombreApellido":"Celso Ayala",
	"fechaNacimiento" :"23/11/1990",
	"telefono" : "0981123456",
	"domicilio" : "Asuncion" ,
	"salario" : 123
	}
	
----
6.POST >> http://localhost:8080/equipo/guardar
	
	{
	"equipo":"Cerro Porteño",
	"entrenador": "Juan Perez"
	}

----
7.POST >> http://localhost:8080/asociacion/inscripcion
	
	{
	"ci" :"12345",
	"descripcion: ": "Inscripcion"
	}

----
8.POST >> http://localhost:8080/torneo/guardar
	
	{
	"torneo":"Apertura",
	"tipo": "Local",
	"fechaInicio": "12/01/2019",
	"fechaFin": "12/05/2019",
	"ganador": "CerroPorteño",
	"puntos": 13
	}

----
9.POST >> http://localhost:8080/torneo/inscripcion
	
	{
	"torneo":"Apertura",
	"equipo": "CerroPorteño"
	}

----
10.GET >> http://localhost:8080/empleado/todos

----
11.GET >> http://localhost:8080/equipo/todos

----
12.GET >> http://localhost:8080/equipo/promedio?equipo=CerroPorteño

----
13.GET >> http://localhost:8080/jugador/promedio?puesto=Arquero

----
14.GET >> http://localhost:8080/empleado/promedio?cargo=Administrativo

----
15.GET >> http://localhost:8080/persona/consulta?ci=1234

----
16.GET >> http://localhost:8080/empleado/consulta?ci=1234

AUTORES:
----
Fabrizio Cubilla - Oliva Mena
