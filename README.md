# TaskManager

Aplicação Java JDBC para gerenciamento de tarefas, organizando e simplificando.

## Sobre o projeto

A aplicação é para fins didáticos, não há frontend, o objetivo é exercicitar a lógica de programação
e orientação a objetos, sendo possível realizar:

- CRUD e filtros das tarefas;
- Cadastro e login de usuários, criptografando senha dos usuários com MD5;

## Tecnologias utilizadas

- Java 11
- Maven
- PostgreSQL

## Instruções SQL

```sql
-- Criação tabela de usuários

create table usuarios(
    id SERIAL primary key,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    senha varchar(100) not null
);

-- Criação da tabela de tarefas
create table tarefas(
    id SERIAL primary key,
    titulo varchar(50) not null,
    descricao varchar(200),
    situacao varchar(10),
    usuario_id integer,
    constraint fk_usuario
        foreign key (usuario_id)
            references usuarios (id)
);
```