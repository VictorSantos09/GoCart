-- CRIAÇÃO DATABASE
drop database gocart;
create database if not exists gocart;
use gocart;

-- CRIAÇÃO TABELAS
drop table if exists produtos;
create table produtos(
	ID smallint primary key unique auto_increment,
    ID_IMAGEM smallint not null,
    NOME varchar(45) not null unique,
    DESCRICAO varchar(200) not null
);

drop table if exists imagens;
create table imagens(
	ID smallint primary key unique auto_increment,
    SEQUENCIA varchar(25),
    URL varchar(800) not null
);

drop table if exists compras;
create table compras(
	ID smallint primary key unique auto_increment,
	DATA_COMPRA date not null,
    COMPRADOR varchar(45) not null,
    VALOR_TOTAL decimal not null
);

drop table if exists itens_comprados;
create table itens_comprados(
	ID smallint primary key unique auto_increment,
	ID_PRODUTO smallint not null,
	ID_COMPRA smallint not null,
    QUANTIDADE smallint
);

-- CRIAÇÃO FKs
alter table produtos
add constraint FK_IMAGENS_PRODUTOS foreign key (ID_IMAGEM) references imagens (ID);

alter table itens_comprados
add constraint FK_COMPRAS_ITENS_COMPRADOS foreign key (ID_COMPRA) references compras(ID),
add constraint FK_PRODUTOS_ITENS_COMPRADOS foreign key (ID_PRODUTO) references produtos (ID);

