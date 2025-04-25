# persistenciadadosSav1


# Task Manager - Projeto Spring Boot com MariaDB

Este é um projeto desenvolvido em **Spring Boot** com integração ao **MariaDB** para gerenciar tarefas. O sistema permite realizar operações CRUD (Create, Read, Update, Delete) para gerenciar usuários e suas tarefas. 

## Índice

1. [Pré-requisitos](#1-pré-requisitos)
2. [Instalação e Configuração do Banco de Dados (MariaDB)](#2-instalação-e-configuração-do-banco-de-dados-mariadb)
   1. [Instalar o XAMPP](#passo-1-instalar-o-xampp)
   2. [Criar o banco de dados `taskmanager`](#passo-2-criar-o-banco-de-dados-taskmanager)
   3. [Configuração do MariaDB](#passo-3-configuração-do-mariadb)
3. [Configuração da Aplicação Spring Boot](#3-configuração-da-aplicação-spring-boot)
   1. [Configuração do arquivo `application.properties`](#passo-1-configuração-do-arquivo-applicationproperties)
   2. [Dependências do Projeto](#passo-2-dependências-do-projeto)
4. [Rodando a Aplicação](#4-rodando-a-aplicação)
   1. [Iniciar o MariaDB](#passo-1-iniciar-o-mariadb)
   2. [Executar o Projeto](#passo-2-executar-o-projeto)
   3. [Testar os Endpoints](#passo-3-testar-os-endpoints)
5. [Testes e Validação](#5-testes-e-validação)
   1. [Testar no Postman](#passo-1-testar-no-postman)
   2. [Verificar no Banco de Dados](#passo-2-verificar-no-banco-de-dados)
6. [Conclusão](#6-conclusão)
7. [Considerações Finais](#7-considerações-finais)

---

## 1. Pré-requisitos

Antes de rodar o projeto, é necessário que você tenha as seguintes ferramentas instaladas no seu computador:

- **JDK 11+**: O Java Development Kit.
- **XAMPP**: Para rodar o MariaDB (servidor de banco de dados).
- **IDE de sua escolha**: IntelliJ IDEA, Eclipse, VSCode, etc.
- **Postman** (opcional): Para testar os endpoints da API.

---

## 2. Instalação e Configuração do Banco de Dados (MariaDB)

### Passo 1: Instalar o XAMPP
1. Baixe e instale o [XAMPP](https://www.apachefriends.org/index.html).
2. Abra o painel de controle do XAMPP e certifique-se de que o **MariaDB** está instalado e ativo. Clique em **Start** ao lado de **MariaDB** para iniciar o servidor de banco de dados.
3. configurar o a porta para 3307 ou alterar em meu codigo o caminho src/main/resources/application.properties, altere o nome do root e senha, caso o seu banco não tenha senha tire a senha, deixe da seguinte forma.

"spring.application.name=persistenciadadosav1
spring.datasource.url=jdbc:mariadb://localhost:3307/taskmanager - alterar a porta para 3306, normalmente a padrão para uso do mariaDb
spring.datasource.username=root
spring.datasource.password= **deixe com sua senha ou se não tiver, vazio.
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
"
  

### Passo 2: Criar o banco de dados `taskmanager`
1. Abra o **phpMyAdmin** no XAMPP (normalmente acessível em `http://localhost/phpmyadmin/`).
2. No painel de controle do **phpMyAdmin**, clique na aba **Databases** e crie um novo banco de dados com o nome `taskmanager`.

   Caso prefira usar o console do MariaDB, você pode rodar o seguinte comando SQL:

   ```sql
   CREATE DATABASE taskmanager;


## 4. Rodando a Aplicação

### Passo 1: Iniciar o MariaDB
1. Abra o **XAMPP** e inicie o **MariaDB**. Se não estiver rodando, clique em **Start** ao lado de **MariaDB**.
2. Verifique se o banco `taskmanager` foi criado corretamente e está disponível.

### Passo 2: Executar o Projeto
1. Abra sua IDE (IntelliJ, Eclipse, etc.) e execute a classe principal do Spring Boot (geralmente com a anotação `@SpringBootApplication`).
2. A aplicação Spring Boot será iniciada na porta **8080** (ou a porta configurada no arquivo `application.properties`, normal e http://localhost:8080.

### Passo 3: Testar os Endpoints
Agora você pode usar ferramentas como o **Postman** para testar os endpoints REST da aplicação, como criar, listar, atualizar e deletar usuários e tarefas.

---

## 5. Testes e Validação

### Passo 1: Testar no Postman
Utilize o **Postman** para enviar requisições HTTP aos endpoints da API. Alguns exemplos de endpoints para testar:

- **POST** `/usuarios`: Criar um novo usuário.
- **GET** `/usuarios`: Listar todos os usuários.
- **PUT** `/usuarios/{id}`: Atualizar um usuário existente.
- **DELETE** `/usuarios/{id}`: Deletar um usuário.

### Passo 2: Verificar no Banco de Dados
Após realizar operações na aplicação, você pode consultar o banco de dados MariaDB (via **phpMyAdmin** ou comandos SQL) para garantir que os dados estão sendo corretamente persistidos e manipulados. Aqui estão alguns exemplos de comandos SQL para verificar as tabelas e os dados:

```sql
-- Listar todas as tabelas no banco taskmanager
SHOW TABLES;

-- Verificar conteúdo de uma tabela (exemplo: usuários)
SELECT * FROM usuarios;

-- Verificar conteúdo de outra tabela (exemplo: tarefas)
SELECT * FROM tarefas;

