CREATE DATABASE db_tarefas;
USE db_tarefas;

CREATE TABLE tb_tarefas(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(50) NOT NULL,
descricao VARCHAR(500) NULL,
importante BOOL NOT NULL,
urgente BOOL NOT NULL,
feito BOOL NOT NULL
);

INSERT INTO tb_tarefas (titulo, descricao, importante, urgente, feito) VALUES
('programar',null,1,1,0),
('aprender ingles',null,1,0,0),
('olhar o whatsapp',null,0,1,0),
('assitir mortal kombat 2',null,0,0,0);

SELECT * FROM tb_tarefas;