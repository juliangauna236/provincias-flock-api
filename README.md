# Provincias API
###### consumidor de https://apis.datos.gob.ar/
Aplicación en Spring. 

### Seguridad 
La aplicación está securizada con Spring Security, la cual, para el alcance del desafío, está configurado para un sólo usuario "harcodeado". De todas formas, la solución puede ser escalable, ya que el mismo spring security puede ser configurado (plugged in) con un administrador de usario como Active Directory server, LDAP u OpenID 

### Consumidor de apis.datos
Para consumir la api solicitada, se utilizó Rest Template de Spring. Dicha herramienta nos permite mapear la respuesta de la API (json) a entidades que utilizaremos en nuestro backend.

### Logs
Los logs son generados mediante log4J, los cuales se guardan el la carpeta **logs**, en el root del proyecto. Dicho path se puede configurar en el arhcivo [log4j2-spring.xml](https://github.com/juliangauna236/provincias-flock-api/blob/main/src/main/resources/log4j2-spring.xml)

### Ejecutar la aplicación
Es una aplicación que corre en spring-boot, por lo que se puede ejecutar desde la terminal, o utilizando cualquier ide compatible.

### Ejemplo
###### Autenticación
![image](https://user-images.githubusercontent.com/105994685/174885283-441496d4-08a5-4494-954a-b0c6d6503906.png)

###### Consulta de la API
![image](https://user-images.githubusercontent.com/105994685/174885421-70fc9d06-712e-4202-a669-41b3f1d2b8ae.png)

### Documentación Extra
Una vez levantada la aplicación, se puede consultar documentación extra generada por swagger en (http://localhost:8080/swagger-ui.html), dicho recurso no esta bloqueado por spring security.
