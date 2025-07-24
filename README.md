# Prueba inicial con api spring boot

## Pasos
- Primero configurar el archivo *aplication.properties* acorde a las credenciales postgresql locales (o crear un perfil propio
- Ejecutar el comando *./mvnw clean install* para instalar dependencias
- Ejecutar el comando *./mvnw spring-boot:run* para ejecutar la api

## Consideraciones
- Ya existen datos base para probar los cuales se registraran en su base de datos en la primera ejecucion
- Se habilitara localhost:8080 para peticiones a menos que lo modifique

### Endpoints disponibles
- http://localhost:8080/api/ordenes/{numeroOrden}
    Probar con la orden de pago numero 000028
    (http://localhost:8080/api/ordenes/000028)
