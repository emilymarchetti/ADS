/*executa primeiro*/
CREATE DATABASE pisante_db
/*se não vai dar erro em*/

DROP TABLE IF EXISTS `usuario`;
DROP TABLE IF EXISTS `endereco`;
DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `venda`;
DROP TABLE IF EXISTS `endereco_cliente`;
DROP TABLE IF EXISTS `produto`;
DROP TABLE IF EXISTS `cor`;
DROP TABLE IF EXISTS `tamanho`;
DROP TABLE IF EXISTS `itens_venda`;
DROP TABLE IF EXISTS `tamanho_produto`;
DROP TABLE IF EXISTS `cor_produto`;

CREATE TABLE usuario (
	id_usuario INTEGER PRIMARY KEY AUTO_INCREMENT,
	login VARCHAR(50) NOT NULL,
	senha INTEGER NOT NULL
);

CREATE TABLE endereco (
	id_endereco INTEGER PRIMARY KEY AUTO_INCREMENT,
	endereco VARCHAR(100) NOT NULL
);

CREATE TABLE cliente (
	id_cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome_cliente VARCHAR(50) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	id_usuario INTEGER NOT NULL,
	CONSTRAINT cliente_id_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE venda (
	id_venda INTEGER PRIMARY KEY AUTO_INCREMENT,
	id_cliente INTEGER NOT NULL,
	valor_total_venda DOUBLE NOT NULL,
	data_hora_venda VARCHAR(10) NOT NULL,
	CONSTRAINT venda_id_cliente_fk FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);


CREATE TABLE endereco_cliente (
	id_cliente INTEGER NOT NULL,
	id_endereco INTEGER PRIMARY KEY,
	tipo_endereco VARCHAR(10) NOT NULL,
	CONSTRAINT endereco_cliente_id_cliente_fk FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
	CONSTRAINT endereco_cliente_id_endereco_fk FOREIGN KEY (id_endereco) REFERENCES endereco(id_endereco)
);

CREATE TABLE tamanho (
	id_tamanho INTEGER PRIMARY KEY AUTO_INCREMENT,
	tamanho INTEGER NOT NULL
);

CREATE TABLE cor (
	id_cor INTEGER PRIMARY KEY AUTO_INCREMENT,
	cor VARCHAR(20) NOT NULL
);

CREATE TABLE produto (
	id_produto INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome_produto VARCHAR(100) NOT NULL,
	genero CHAR(1) NOT NULL,
	marca VARCHAR(20) NOT NULL,
	preco DOUBLE NOT NULL,
	foto VARCHAR(500) NOT NULL
);

CREATE TABLE itens_venda (
	id_produto INTEGER NOT NULL,
	id_venda INTEGER NOT NULL,
	valor_item DOUBLE NOT NULL,
	CONSTRAINT itens_venda_id_produto_fk FOREIGN KEY (id_produto) REFERENCES produto(id_produto),
	CONSTRAINT itens_venda_id_venda_fk FOREIGN KEY (id_venda) REFERENCES venda(id_venda)
);


CREATE TABLE tamanho_produto (
	id_tamanho INTEGER NOT NULL,
	id_produto INTEGER NOT NULL,
	CONSTRAINT tamanho_produto_id_tamanho_fk FOREIGN KEY (id_tamanho) REFERENCES tamanho(id_tamanho),
	CONSTRAINT tamanho_produto_id_produto_fk FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);


CREATE TABLE cor_produto (
	id_cor INTEGER NOT NULL,
	id_produto INTEGER NOT NULL,
	CONSTRAINT cor_produto_id_cor_fk FOREIGN KEY (id_cor) REFERENCES cor(id_cor),
	CONSTRAINT cor_produto_id_produto_fk FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);