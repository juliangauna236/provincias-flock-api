# Provincias API
###### consumidor de https://apis.datos.gob.ar/
Aplicación en Spring. 

### Seguridad 
La aplicación está securizada con Spring Security, la cual, para el alcance del desafío, está configurado para un sólo usuario "harcodeado". De todas formas, la solución puede ser escalable, ya que el mismo spring security puede ser configurado (plugged in) con un administrador de usario como Active Directory server, LDAP u OpenID 

### Consumidor de apis.datos
Para consumir la api solicitada, se utilizó Rest Template de Spring. Dicha herramienta nos permite mapear la respuesta de la API (json) a entidades que utilizaremos en nuestro backend.

### Logs
Los logs son generados mediante log4J, los cuales se guardan el la carpeta **logs**, en el root del proyecto. Dicho path se puede configurar en el arhcivo 

### Ejecutar la aplicación

