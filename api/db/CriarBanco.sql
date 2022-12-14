CREATE DATABASE Marques
USE Marques;
CREATE TABLE Cliente (
    ID_CLIENTE INT AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(100),
    DOCUMENTO varchar(20) NOT NULL,
    DATA datetime NOT NULL,
    ID_ENDERECO INT NOT NULL,
    ID_CONTATO INT NOT NULL
);

CREATE TABLE Endereco (
    ID_ENDERECO integer not null PRIMARY KEY auto_increment,
    RUA varchar(100),
    NUMERO varchar(10),
    BAIRRO varchar(20),
    CEP varchar(12),
    DATA datetime not null,
    ID_CLIENTE integer not null,

    CONSTRAINT fk_EnderecoCliente FOREIGN KEY (ID_CLIENTE) REFERENCES Cliente (ID_CLIENTE)
);

CREATE TABLE Contato (
    ID_CONTATO integer not null PRIMARY KEY auto_increment,
    TELEFONE varchar(100),
    EMAIL varchar(50),
    DATA datetime not null,
    ID_CLIENTE integer not null,

    CONSTRAINT fk_ContatoCliente FOREIGN KEY (ID_CLIENTE) REFERENCES Cliente (ID_CLIENTE)
);

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;
INSERT INTO Cliente (ID_CLIENTE, NOME, DOCUMENTO, DATA, ID_ENDERECO, ID_CONTATO) VALUES (1, "DAVI TESTE", "12345678978", "2018-07-21", 1, 1);