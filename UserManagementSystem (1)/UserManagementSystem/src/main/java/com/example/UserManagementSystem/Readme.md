* Framework and  Language Used 
    1)Java & Springboot framework is used to build this application .
_________________________________________________________________________________

* Data flow 

   1.Controller 
       When we call the end point from the postman or web...the request comes to the corresponding method of that end point,we will handle all the business logics
       in service layer.So we call the method of service layer to perform the bussiness logic
       
  2. Service layer
       Service layer contains all the necessary business logic to perform the operation and is calls the dao layer to fetch the data if reuired .
       
 3. Repository/Dao 
       This contains the data which we are saving.here in this project we have used the local as database.We have used ArrayList to store the data .
      
________________________________________________________________________________________

* Project Summary 

       This a simple User management System , which saves the user data such as ID,NAME,ADDRESS,etc
       We can save user data by using the provided save end point.and can fetch the data of alll user and also a particular using ID .
       We can also update the already exiscting user using there id.
       We can also delete a particular user using Id .
       
          
