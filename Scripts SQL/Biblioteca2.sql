/* TABELA EDITORA */
create table editoras(
    id_editora integer not null constraint pk_editora primary key,
    nome_editora varchar(50)
);

create sequence seq_id_editora minvalue 1 increment by 1 start with 1


/* TABELA LIVROS */ 
create table livros(
    id_livro integer not null constraint pk_livro primary key,
    nome_livro varchar(100),
    id_editora integer not null constraint fk_editora references editoras(id_editora),
    livros_estoque integer not null
);

create sequence seq_id_livro minvalue 1 increment by 1 start with 1

/* TABELA AUTORES */
create table autores(
    id_autor integer not null constraint pk_autor primary key,
    nome_autor varchar(100)
)

create sequence seq_id_autor minvalue 1 increment by 1 start with 1

/* TABELA DE RELAÇÃO: LIVROS <--> AUTORES */
create table livro_autores(
    id_livro integer not null constraint fk_livro references livros(id_livro),
    id_autor integer not null constraint fk_autor references autores(id_autor)
)


