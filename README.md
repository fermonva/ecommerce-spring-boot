# REST API para un E-Commerce

* API REST para una aplicación de comercio electrónico. Esta API muestra un ejemplo de una 
  aplicación de comercio electrónico desarrollada con Spring Boot.

## E-R Diagram for the application

 <image src="./D_ER.jpeg" alt="Descripción de la imagen" />

## Stack Tecnológico
* Java
* Spring Boot
* Spring Data JPA
* Lombok
* MySQL


## API Root Endpoint

`https://localhost:8000/api/v1`


## API Module Endpoints

* `GET /products` : Obtener todos los productos.
* `GET /search/findByCategoryId?id=1` : buscar productos de la categoría.
* `GET /search/findByNameContaining?name=pc` : buscar productos por nombre.
* `GET /productCategories` : obtener todas las categorías de productos.
* `GET /countries` : obtener todos los paises.
* `GET /states` : obtener todos los estados.
* `GET /search/findByCountryCode?code=01` : buscar productos por pais.
* `POST /checkout/purchase` : realizar compra de productos.
* `POST /checkout/payment-intent` : obtener intento de pago.