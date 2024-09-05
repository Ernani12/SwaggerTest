
📚 Aplicação CRUD de Alunos - Spring Boot
Esta aplicação é um sistema de gerenciamento de alunos de uma escola, desenvolvido utilizando o framework Spring Boot. A aplicação possui um CRUD completo (Create, Read, Update, Delete) para gerenciar as informações dos alunos, incluindo nome, idade, notas dos semestres, nome do professor, e número da sala. O banco de dados H2 é utilizado para o desenvolvimento local, e o MySQL pode ser usado em produção.

🚀 Tecnologias Utilizadas
Tecnologia	Versão	Descrição
Spring Boot	3.3.3	Framework Java que simplifica a criação de aplicações stand-alone, de produção pronta e robusta.
Maven	3.8.1	Ferramenta de automação de compilação para projetos Java.
H2 Database	2.1.210	Banco de dados em memória para desenvolvimento e testes rápidos.
MySQL	8.0.33	Banco de dados relacional utilizado em produção.
Lombok	1.18.28	Biblioteca para reduzir o código boilerplate, como getters, setters, e construtores.
Springfox Swagger	3.0.0	Ferramenta para gerar documentação de API RESTful automaticamente.
Docker	24.0.2	Plataforma para desenvolver, enviar e executar aplicações em containers.

⚙️ Funcionalidades
CRUD de Alunos:
Criar Aluno: Registra um novo aluno no sistema.
Listar Alunos: Exibe a lista completa de alunos cadastrados.
Buscar Aluno por ID: Retorna os detalhes de um aluno específico com base no ID.
Atualizar Aluno: Atualiza as informações de um aluno existente.
Deletar Aluno: Remove um aluno do sistema.

📁 Estrutura do Projeto
bash
Copiar código
├── src
│   ├── main
│   │   ├── java/com/example/alunos
│   │   │   ├── controller      # Controladores REST
│   │   │   ├── model           # Entidades JPA
│   │   │   ├── repository      # Repositórios JPA
│   │   │   └── service         # Serviços de negócio
│   │   └── resources
│   │       ├── application.properties  # Configurações da aplicação
│   │       └── data.sql         # Dados iniciais para a base H2
│   └── test/java/com/example/alunos  # Testes unitários e de integração
└── pom.xml                      # Arquivo de dependências do Maven

🗂️ Endpoints da API
Método HTTP	Endpoint	Descrição	Exemplo de Request
GET	/api/alunos	Lista todos os alunos	curl -X GET http://localhost:8080/api/alunos
GET	/api/alunos/{id}	Retorna um aluno por ID	curl -X GET http://localhost:8080/api/alunos/1
POST	/api/alunos	Cria um novo aluno	curl -X POST -H "Content-Type: application/json" -d '{"nome": "João", "idade": 20, "notaPrimeiroSemestre": 8.5, "notaSegundoSemestre": 9.0, "nomeProfessor": "Maria", "numeroSala": 101}' http://localhost:8080/api/alunos
PUT	/api/alunos/{id}	Atualiza as informações de um aluno	curl -X PUT -H "Content-Type: application/json" -d '{"nome": "João", "idade": 21}' http://localhost:8080/api/alunos/1
DELETE	/api/alunos/{id}	Deleta um aluno	curl -X DELETE http://localhost:8080/api/alunos/1

bash
Copiar código
git clone https://github.com/seu-usuario/alunos.git
cd alunos
Configuração do Banco de Dados:

O banco de dados H2 é utilizado por padrão. Para usar MySQL, configure as propriedades de conexão no application.properties.
Rodar a Aplicação:

bash
Copiar código
mvn spring-boot:run
Acessar a Documentação Swagger:

Acesse http://localhost:8080/swagger-ui/index.html para visualizar e testar os endpoints da API.
🐳 Docker
Para rodar a aplicação com Docker:

Build da Imagem Docker:

bash
Copiar código
docker build -t alunos-app .
Rodar o Container:

bash
Copiar código
docker run -p 8080:8080 alunos-app
🧪 Testes
Testes Unitários: Os testes unitários cobrem as funcionalidades principais da aplicação e podem ser rodados com o comando:
bash
Copiar código
mvn test
