CREATE DATABASE IF NOT EXISTS DB;
USE DB;

CREATE TABLE IF NOT EXISTS User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    username VARCHAR(50),
    password VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Customer (
    idUser INT PRIMARY KEY,
    wallet DECIMAL,
    FOREIGN KEY (idUser) REFERENCES User(id)
);

CREATE TABLE IF NOT EXISTS Administrator (
    idUser INT PRIMARY KEY,
    permissionLevel INT NOT NULL,
    FOREIGN KEY (idUser) REFERENCES User(id)
);

CREATE TABLE IF NOT EXISTS Category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idCategory INT,
    stock INT,
    name VARCHAR(50),
    price DECIMAL,
    available BOOLEAN,
    FOREIGN KEY (idCategory) REFERENCES Category(id)
);

CREATE TABLE IF NOT EXISTS ShoppingCart (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId INT,
    totalValue DECIMAL,
    FOREIGN KEY (userId) REFERENCES User(id)
);

CREATE TABLE IF NOT EXISTS ShoppingCartProduct (
    idShoppingCart INT,
    idProduct INT,
    quantity INT,
    PRIMARY KEY (idShoppingCart, idProduct),
    FOREIGN KEY (idShoppingCart) REFERENCES ShoppingCart(id),
    FOREIGN KEY (idProduct) REFERENCES Products(id)
);

CREATE TABLE IF NOT EXISTS Orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idShoppingCart INT,
    idUser INT,
    name VARCHAR(50),
    date DATETIME,
    price DECIMAL,
    FOREIGN KEY (idShoppingCart) REFERENCES ShoppingCart(id),
    FOREIGN KEY (idUser) REFERENCES User(id)
);



