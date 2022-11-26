CREATE DATABASE IF NOT EXISTS `myapi-books`;
USE `myapi-books`;
CREATE TABLE IF NOT EXISTS books (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    ISBN VARCHAR(10) NOT NULL,
    Title VARCHAR(64) NOT NULL
);