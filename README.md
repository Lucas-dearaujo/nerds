# Nerds – Sistema de Controle de Patrimônio

API REST desenvolvida em Java com Spring Boot para gerenciamento de patrimônios do projeto **Nerds**.  
Permite **cadastrar, listar, atualizar e remover patrimônios**, seguindo o padrão de arquitetura:

Controller → Service → Repositorio → Patrimonio


---

## 🧱 Arquitetura do Projeto

- **Controller**  
  Responsável por receber as requisições HTTP (GET, POST, PUT, DELETE) e se comunicar com o Service.

- **Service**  
  Contém as regras de negócio e é responsável por lançar exceções quando necessário.

- **Repositorio**  
  Camada de manipulação de dados, responsável pelas operações sobre os objetos.

- **Patrimonio (Model)**  
  Camada mais baixa do sistema, contém os atributos, getters e setters.

- **Exception**  
  Responsável pelo tratamento de erros:
  - `GlobalExceptionHandler`: centraliza o tratamento das exceções.
  - Demais classes de exception: representam erros específicos do sistema.

### Regras implementadas
- Não é permitido cadastrar dois patrimônios com o mesmo **número de série**.
- Não é permitido remover ou atualizar um patrimônio inexistente.

---

## Tecnologias Utilizadas

- Java 21  
- Spring Boot Web  
- Maven  
- Postman  

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

git clone https://github.com/Lucas-dearaujo/nerds.git

2. Entre na pasta do projeto e execute:

cd nerds
./mvnw spring-boot:run
Ou, execute a classe NerdsApplication diretamente pela IDE.

A aplicação usa a porta http://localhost:8080

Funcionalidades e Endpoints
Cadastrar Patrimônio

POST /patrimonios

{
  "nome": "Cadeira",
  "tipo": "Mobilia",
  "numeroSerie": "1127041",
  "estado": true,
  "alocado": false
}

 Listar Patrimônios

Lista todos os patrimônios cadastrados.

GET /patrimonios

 Atualizar Patrimônio

Todos os dados devem ser enviados, mesmo que apenas um campo seja alterado.
O número de série não pode ser alterado.

PUT /patrimonios/{numeroSerie}

{
  "nome": "Cadeira Atualizada",
  "tipo": "Mobilia",
  "estado": true,
  "alocado": true
}

 Remover Patrimônio

Remove um patrimônio pelo número de série.

DELETE /patrimonios/{numeroSerie}

Testes
Os testes dos endpoints foram realizados utilizando o Postman.
A coleção do Postman está disponível no repositório para facilitar os testes dos endpoints.

Adendos:
Nesse desafio eu fiz
- Criação de endpoints REST (GET, POST, PUT e DELETE)
- Separação de responsabilidades entre camadas
- Aplicação de regras de negócio na camada Service
- Tratamento centralizado de exceções com `@RestControllerAdvice`
- Testes de endpoints utilizando o Postman

O projeto não utiliza banco de dados, trabalhando com armazenamento em memória, focando
no entendimento da arquitetura REST e do fluxo de uma aplicação backend com Spring Boot, eu tive um conhecimento bem superficial, porem mesmo com isso consegui com esforço aplicar uma tentativa boa e mesmo se errar ou tiver fugido da ideia de algum ponto , foi um desafio interessante. e agradeço a oportunidade.


