
CREATE SEQUENCE usuario_id_usuario_seq_1;

CREATE TABLE usuario (
                id_usuario INTEGER NOT NULL DEFAULT nextval('usuario_id_usuario_seq_1'),
                login VARCHAR(50) NOT NULL,
                senha INTEGER NOT NULL,
                CONSTRAINT usuario_pk PRIMARY KEY (id_usuario)
);


ALTER SEQUENCE usuario_id_usuario_seq_1 OWNED BY usuario.id_usuario;

CREATE SEQUENCE endereco_id_endereco_seq;

CREATE TABLE endereco (
                id_endereco INTEGER NOT NULL DEFAULT nextval('endereco_id_endereco_seq'),
                endereco VARCHAR(100) NOT NULL,
                CONSTRAINT endereco_pk PRIMARY KEY (id_endereco)
);


ALTER SEQUENCE endereco_id_endereco_seq OWNED BY endereco.id_endereco;

CREATE SEQUENCE cliente_id_cliente_seq;

CREATE TABLE cliente (
                id_cliente INTEGER NOT NULL DEFAULT nextval('cliente_id_cliente_seq'),
                nome_cliente VARCHAR(50) NOT NULL,
                cpf VARCHAR(11) NOT NULL,
                id_usuario INTEGER NOT NULL,
                CONSTRAINT cliente_pk PRIMARY KEY (id_cliente)
);


ALTER SEQUENCE cliente_id_cliente_seq OWNED BY cliente.id_cliente;

CREATE TABLE venda (
                id_venda INTEGER NOT NULL,
                id_cliente INTEGER NOT NULL,
                valor_total_venda DOUBLE PRECISION,
                data_hora_venda VARCHAR NOT NULL,
                CONSTRAINT venda_pk PRIMARY KEY (id_venda)
);


CREATE TABLE endereco_cliente (
                id_cliente INTEGER NOT NULL,
                id_endereco INTEGER NOT NULL,
                tipo_endereco VARCHAR NOT NULL,
                CONSTRAINT endereco_cliente_pk PRIMARY KEY (id_cliente, id_endereco)
);


CREATE SEQUENCE tamanho_id_tamanho_seq;

CREATE TABLE tamanho (
                id_tamanho INTEGER NOT NULL DEFAULT nextval('tamanho_id_tamanho_seq'),
                tamanho INTEGER NOT NULL,
                CONSTRAINT tamanho_pk PRIMARY KEY (id_tamanho)
);


ALTER SEQUENCE tamanho_id_tamanho_seq OWNED BY tamanho.id_tamanho;

CREATE SEQUENCE cor_id_cor_seq;

CREATE TABLE cor (
                id_cor INTEGER NOT NULL DEFAULT nextval('cor_id_cor_seq'),
                cor VARCHAR(20) NOT NULL,
                CONSTRAINT cor_pk PRIMARY KEY (id_cor)
);


ALTER SEQUENCE cor_id_cor_seq OWNED BY cor.id_cor;

CREATE SEQUENCE produto_id_produto_seq;

CREATE TABLE produto (
                id_produto INTEGER NOT NULL DEFAULT nextval('produto_id_produto_seq'),
                nome_produto VARCHAR(100) NOT NULL,
                genero CHAR(1) NOT NULL,
                marca VARCHAR(20) NOT NULL,
                preco DOUBLE PRECISION NOT NULL,
                CONSTRAINT produto_pk PRIMARY KEY (id_produto)
);


ALTER SEQUENCE produto_id_produto_seq OWNED BY produto.id_produto;

CREATE TABLE itens_venda (
                id_produto INTEGER NOT NULL,
                id_venda INTEGER NOT NULL,
                valor_item DOUBLE PRECISION NOT NULL,
                CONSTRAINT itens_venda_pk PRIMARY KEY (id_produto, id_venda)
);


CREATE TABLE tamanho_produto (
                id_tamanho INTEGER NOT NULL,
                id_produto INTEGER NOT NULL,
                CONSTRAINT tamanho_produto_pk PRIMARY KEY (id_tamanho, id_produto)
);


CREATE TABLE cor_PRODUTO (
                id_cor INTEGER NOT NULL,
                id_produto INTEGER NOT NULL,
                CONSTRAINT cor_produto_pk PRIMARY KEY (id_cor, id_produto)
);


ALTER TABLE cliente ADD CONSTRAINT usuario_cliente_fk
FOREIGN KEY (id_usuario)
REFERENCES usuario (id_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE endereco_cliente ADD CONSTRAINT endereco_endereco_cliente_fk
FOREIGN KEY (id_endereco)
REFERENCES endereco (id_endereco)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE endereco_cliente ADD CONSTRAINT cliente_endereco_cliente_fk
FOREIGN KEY (id_cliente)
REFERENCES cliente (id_cliente)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE venda ADD CONSTRAINT cliente_venda_fk
FOREIGN KEY (id_cliente)
REFERENCES cliente (id_cliente)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE itens_venda ADD CONSTRAINT venda_itens_venda_fk
FOREIGN KEY (id_venda)
REFERENCES venda (id_venda)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE tamanho_produto ADD CONSTRAINT tamanho_tamanho_produto_fk
FOREIGN KEY (id_tamanho)
REFERENCES tamanho (id_tamanho)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE cor_PRODUTO ADD CONSTRAINT cor_cor_produto_fk
FOREIGN KEY (id_cor)
REFERENCES cor (id_cor)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE cor_PRODUTO ADD CONSTRAINT produto_cor_produto_fk
FOREIGN KEY (id_produto)
REFERENCES produto (id_produto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE tamanho_produto ADD CONSTRAINT produto_tamanho_produto_fk
FOREIGN KEY (id_produto)
REFERENCES produto (id_produto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE itens_venda ADD CONSTRAINT produto_itens_venda_fk
FOREIGN KEY (id_produto)
REFERENCES produto (id_produto)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
