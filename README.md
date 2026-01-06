# Nerds – Sistema de Controle de Patrimônio

API REST desenvolvida em Java com Spring Boot para gerenciamento de patrimônios do nerds, permitindo cadastrar, listar, atualizar e remover patrimônios, ela segue um padrão de arquitetura:

Controller->Service->Repositorio->patrimonio

Controller recebe as requisições htpp e se comunica com service
Service Contem regras de negocios e lançamentos de exceções.
Repositorio manipula os dados e tem as funções a nivel de OO com os objetos.
Patrimonio é a camada mais baixa e guarda getter setters e dados.

O pacote exception é responsavel pelas exeções, uma classe trata todos os exeptions: GlobalExeptionHandler para evitar codigo separado.
E as demais classes exception cuidam dos throws e mensages de cada erro, neste desafio: nao deixar cadastrar dois patrimonios com mesmo numerodeserie, e um extra que é caso não encontre o numero de serie nos cadastros.

##  Tecnologias utilizadas
- Java 21 (ou a versão que você usou)
- Spring Boot web (achei que pudesse precisar, acabou não precisando.)
- Maven
- Postman
--------------------------------
## Como executar o projeto
1. 
Clone o repositório no seu terminal usando o comando git clone.
"git clone https://github.com/Lucas-dearaujo/nerds.git"
2. 
Dentro da pasta do projeto cd nerds e execute a operação ./mvnw spring-boot:run
Ou
Execute a classe NerdsApplication pela IDE.

3. A aplicação usa a porta padrao http://localhost:8080
---------------------------------
## Funcionalidades

# Cadastrar patrimônio (Inserir)
POST /patrimonios
{
  "nome": "Cadeira",
  "tipo": "Mobilia",
  "numeroSerie": "1127041",
  "estado": true,
  "alocado": false
}

# Listar patrimônios (mostra todos os patrimonions registrados.)

GET /patrimonios

# Atualizar patrimônio
"Deve ser colocado todos os dados do patrimonio mesmo que se atualize so um, numero de serie so pode ser cadastrado uma vez, uma vez que não tem regra de negocio que valide um numero de patrimonio valido nesse desafio.

PUT /patrimonios/{numeroSerie}
{
  "nome": "Cadeira Atualizada",
  "tipo": "Mobilia",
  "estado": true,
  "alocado": true
}

# Remover patrimônio
DELETE /patrimonios/{numeroSerie}
------------------------------------







