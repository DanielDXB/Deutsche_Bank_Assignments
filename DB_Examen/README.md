Bolontoc Daniel ©2022
Pizza Restaurant API

ClientService is responsible for both creating an user and ordering a pizza

class Pizza acts like a Menu from witch you can choose what type of pizza do you
want to order. The pizza ordering implementation is done with Factory Design Pattern

PizzaService is responsible for giving information about the pizzas that you can order(Menu)
MenuController returns a list of 3 Objects (with no id or client) witch stands for the 3 types
of pizza's that are implemented or you can get them as a list of String.

The program will throw 3 exceptions:
1. UsernameAlreadyExists is thrown if you try to create a client with an username that already exists
2. UserNotFound is thrown if you try to order a pizza as a guest (no client found in the database)
3. InvalidType is thrown when you try to order a pizza that is not part of the menu

 