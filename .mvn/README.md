# REST API para un E-Commerce

* API REST para una aplicación de comercio electrónico. Esta API muestra un ejemplo de una 
  aplicación de comercio electrónico desarrollada con Spring Boot.

## E-R Diagram for the application

![E-R Diagram](./D_ER_Diagram.jpeg?raw=true)

 <image src="./D_ER_Diagram.jpeg" alt="Descripción de la imagen">;


## Stack Tecnológico
* Java
* Spring Boot
* Spring Data JPA
* Lombok
* MySQL


## API Root Endpoint

`https://localhost:8000/`


## API Module Endpoints

### Customer Module

* `GET /customer/current` : Getting currently logged in customer
* `GET /customer/orders` : Getting order history of logged in customer
* `GET /customers` : Getting All customers
* `PUT /customer` : Updates logged in customer
* `PUT /customer/update/password` : Updates customer password
* `PUT /customer/update/card` : Updates credit card details
* `PUT /customer/update/address?type=home` : Updates customer's home address
* `PUT /customer/update/credentials` : Updates email address and mobile number
* `DELETE /customer` : Deletes logged in user with valid session token
* `DELETE /customer/delete/address?type=home` : Deletes customer's home address