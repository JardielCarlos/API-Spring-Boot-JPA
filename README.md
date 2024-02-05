<h1 align="center" style="font-weight: bold;">API-Spring-Boot-JPA 💻</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
  <a href="#routes">API Endpoints</a> •
 <a href="#colab">Collaborators</a> •
 <a href="#contribute">Contribute</a>
</p>

<p align="center">
    <b>Descrição simples do que o projeto faz e como usá-lo.</b>
</p>

<h2 id="technologies">💻 Technologies</h2>

- lista de todas as tecnologias usada
- Java
- Spring Boot
- Hibernate
- PostgreSQL

<h2 id="started">🚀 Getting started</h2>

- ### Como executar o projeto localmente.

<h3>Prerequisites</h3>

lista de todos os pré-requisitos necessários para execução do projeto.

- [Java](https://www.oracle.com/br/java/technologies/downloads/)
- [PostgreSQL](https://www.postgresql.org/download/)

<h3>Cloning</h3>

Como clonar o projeto

```bash
git clone https://github.com/JardielCarlos/API-Spring-Boot-JPA.git
```

<h3>Config .yml variables</h2>

Altere o arquivo `application.yml` colocando suas crendencias de configuração do banco de dados

```yaml
datasource:
  url: 'jdbc:postgresql://localhost:{PORTA_BD}/{NOME_BD}'
  username: USERNAME_BD
  password: SENHA_BD
```

<h2 id="routes">📍 API Endpoints</h2>

lista das rotas da API e quais são os corpos de solicitação esperados.
​
| route | description  
|----------------------|-----------------------------------------------------
| <kbd>GET /estudantes</kbd> | retorna os estudantes [detalhes da resposta](#get-estudante-detail)
| <kbd>GET /estudantes/{id}</kbd> | retorna o estudante de id específico [detalhes da resposta](#get-estudanteId-detail)
| <kbd>POST /estudantes</kbd> | cadastra um estudante [detalhes da resposta](#post-estudante-detail)
| <kbd>PUT /estudantes/{id}</kbd> | Atualizar um estudante pelo id [detalhes da resposta](#put-estudante-detail)
| <kbd>DELETE /estudantes/{id}</kbd> | Deleta um estudante pelo id [detalhes da resposta](#delete-estudante-detail)

<h3 id="get-estudante-detail">GET /estudantes</h3>

**RESPONSE**

```json
[
  {
    "id": 1,
    "nome": "Jardiel Carlos",
    "matricula": "2023456879",
    "idade": 20
  },
  {
    "id": 2,
    "nome": "Lucas Silva",
    "matricula": "2023458978",
    "idade": 19
  }
]
```

<h3 id="get-estudanteId-detail">GET /estudantes/1</h3>

**RESPONSE**

```json
{
  "id": 1,
  "nome": "Jardiel Carlos",
  "matricula": "2023456879",
  "idade": 20
}
```

<h3 id="post-estudante-detail">POST /estudantes</h3>

**REQUEST**

```json
{
  "nome": "João",
  "matricula": "2023451469",
  "idade": 24
}
```

**RESPONSE**

```json
{
  "id": 3,
  "nome": "João",
  "matricula": "2023451469",
  "idade": 24
}
```

<h3 id="put-estudante-detail">PUT /estudantes/3</h3>

**REQUEST**

```json
{
  "nome": "João Pedro",
  "matricula": "2023451469",
  "idade": 24
}
```

**RESPONSE**

```json
No body returned for response
```

<h3 id="delete-estudante-detail">DELETE /estudantes/3</h3>

**RESPONSE**

```json
No body returned for response
```

<h2 id="colab">🤝 Collaborators</h2>

Participantes do Projeto

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/88459973?v=4" width="100px;" alt="Jardiel Carlos Profile Picture"/><br>
        <sub>
          <b>Jardiel Carlos</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<h2 id="contribute">📫 Contribute</h2>

Para contribuir para este projeto, siga os passos abaixo:

1. `git clone https://github.com/JardielCarlos/API-Spring-Boot-JPA.git`
2. `git checkout -b feature/NAME`
3. Abra um Pull Request explicando o problema resolvido ou recurso realizado, se existir, anexe screenshot das modificações visuais e aguarde a revisão!

<h3>Documentações que podem ajudar</h3>

[📝 Como criar uma solicitação pull request](https://www.atlassian.com/br/git/tutorials/making-a-pull-request)
