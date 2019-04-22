# Shopping Cart App
Sample shopping cart app made to be used in conjunction with the angular front-end application, which is a separate project.

This project supports 4 main functions:
 - Get all products from a catalog (the catalog is loaded with sample data upon startup)
 - Add product of specified quantity to a user's cart
 - Get a list of all products in a user's shopping cart
 - Delete a product from a user's shopping cart

## How to run on a local dev environment 
This spring boot application connects to mysql database on localhost:3306 with credentials:
```
spring.datasource.username=test
spring.datasource.password=test
```

As long as you have mysql running and accepting those credentials, this project can be built using maven by navigating to the root directory and running the following command:
```
mvn package
```
    
Then, to start the server running on localhost:8080, run the following command from the root directory
```
java -jar target\ShoppingCart-0.0.1-SNAPSHOT.jar
```
