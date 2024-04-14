CREATE TABLE tb_usuario_devsync(
  cod_usuario SERIAL PRIMARY KEY,
  login VARCHAR(200) NOT NULL,
  senha VARCHAR(200) NOT NULL
);
--cadastrar um usuário
INSERT INTO tb_usuario_devsync
(login, senha) VALUES
('comum', 'comum');

SELECT  *
FROM tb_usuario_devsync;

UPDATE tb_usuario_devsync SET
login='Admin',senha='Admin'
WHERE cod_usuario = 1;

DELETE FROM tb_usuario_devsync
WHERE cod_usuario = 2;

UPDATE tb_usuario_devsync SET
senha='' WHERE cod_usuario = 1;