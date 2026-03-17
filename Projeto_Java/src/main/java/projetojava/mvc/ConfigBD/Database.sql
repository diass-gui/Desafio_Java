CREATE DATABASE IF NOT EXISTS db_Gestao_Produtos;

USE db_Gestao_Produtos;

CREATE TABLE IF NOT EXISTS tb_Gestao_Produtos (
    id INT PRIMARY KEY,
    nome VARCHAR(80),
    categoria VARCHAR(80),
    quantidade INT
);