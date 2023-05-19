  # [Stock Management]()

## Frameworks and Language used
___
* Java
* Springboot Framework 

## Data Flow
1. #### Controller
* Controller When we call the end point from the postman or web...the request comes to the corresponding method of that end point,we will handle all the business logics in service layer.So we call the method of service layer to perform the bussiness logic

2. #### Service
* Service layer Service layer contains all the necessary business logic to perform the operation and is calls the dao layer to fetch the data if required .

3. #### Repository
* We are using H2 for the data Base
* We are using Swagger UI

___

## Project Summary

* This is simple project to Manage the Stocks we have created an Enum type to slect the type of stock that cannot ben changed by the user we can add new Stocks to the database using postmapping and get all the stocks or get stock by id and marketcap were we use the  query that we wrote to find the required stocks cooressponding to the user data provided and aslo we can update the stocks using different parameters.

## Author
___
 #### Jaya Kumar

 
 * Github: [@jk13jay]()

___



 ![](https://images.app.goo.gl/QUZv5TVJvov1H8x5A)

 ## License
 ___
 ##### Copyright 2023 [Jaya Kumar.]()
  




