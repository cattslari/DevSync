
CREATE TABLE tb_usuarios(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
--cadastrar um usuário
INSERT INTO tb_usuarios
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM tb_usuario;

UPDATE tb_usuarios SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM tb_usuarios
WHERE cod_usuario = 2;

UPDATE tb_usuarios SET
senha='' WHERE cod_usuario = 1;

--Criar tabela de eventos

CREATE TABLE tb_eventos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_hora DATETIME NOT NULL,
    local VARCHAR(255) NOT NULL
);
