  # [Doctor Management Application]()

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
* We have used Mysql as the database.
* Also added Swagger UI.

___

## Project Summary

* This is simple Doctor Management Application where we can add doctors and manage there appointments and also patients can book therer appointments to the required doctors that are available but also before booking an appointment the user should signIn with there account it they have no accounts available than they should Signup first using there email and filling up the basic user data same user with the same email cannot signup twice and also the password provided by the user is encrypted and stored in database for security purposes and also the signedUp users will be provided a unique authetication key with is used to verify the User.

## Author
___
 #### Jaya Kumar

 
 * Github: [@jk13jay]()

___



 ![](https://images.app.goo.gl/QUZv5TVJvov1H8x5A)

 ## License
 ___
 ##### Copyright 2023 [Jaya Kumar.]()
  




