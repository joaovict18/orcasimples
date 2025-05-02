# OrçaSimples API

OrçaSimples API é uma API RESTful para gestão de despesas. Ela permite criar, listar, atualizar e deletar despesar. A aplicação foi feita utilizando **Java**, **Spring Boot** e **MySQL**.

## Funcionalidades

- **Criar despesa**: Adiciona uma nova despesa.
- **Listar despesas**: Exibe todas as despesas.
- **Atualizar despesa**: Atualiza uma despesa existente.
- **Deletar despesa**: Remove uma despesa.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot** 3.4.5
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

## Pré-requisitos

- **JDK**
- **MySQL**
- **Maven**

## Como rodar o projeto

### 1. Clone o repositório

Clone o repositório para sua máquina local:

```bash
git clone https://github.com/joaovict18/orcasimples.git
cd orcasimples
```
## 2. Configure o banco de dados
Crie um banco de dados MySQL chamado orcasimples:
```sql
CREATE DATABASE orcasimples;
```
Configure o banco de dados no arquivo ```src/main/resources/application.properties```
```properties
# Configurações do banco de dados MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/orcasimples
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configurações do Hibernate
spring.jpa.hibernate.ddl-auto=update
```

## 3. Rode a aplicação
Se for pelo Maven ```mvn spring-boot:run```

Ou diretamente pela IDE que você estiver usando.

Após isso, a API está disponível em: ```http://localhost:8080```

## 4. Testando a API

Exemplos de endpoints:

### Criar uma despesa
Método ```POST```

Endpoint ```/despesas```

Exemplo de body:
```json
{
  "descricao": "Salário",
  "valor": 1500.00,
  "tipo": "ENTRADA"
}
```
```json
{
  "descricao": "Lanche",
  "valor": 15.00,
  "tipo": "SAIDA"
}
```
### Listar despesas
Método ```GET```

Endpoint ```/despesas```

### Atualizar uma despesa
Método ```PUT```

Endpoint ```/despesas/{id}```

Exemplo de body:
```json
{
  "descricao": "Lanche atualizado",
  "valor": 13.00,
  "tipo": "SAIDA"
}
```
### Deletar uma despesa

Método: DELETE

Endpoint: ```/despesas/{id}```
