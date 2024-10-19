CREATE DATABASE cadastro;

USE cadastro;

CREATE TABLE pessoa(
id INT PRIMARY KEY auto_increment,
nome VARCHAR(50) NOT NULL,
cpf VARCHAR(11) NOT NULL,
telefone VARCHAR(11) NOT NULL); 

SELECT * FROM pessoa;