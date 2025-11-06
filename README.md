# 📄 API - TaskFlow

Uma API de gerenciamento de tarefas (to-do list) com autenticação JWT, endpoints REST e um toque de design limpo, seguindo boas práticas de arquitetura (DTOs, Services, Controllers, Repository Pattern).

---

## 🧠 Tecnologias Utilizadas

| Camada         | Tecnologia                                       |
|----------------|--------------------------------------------------|
| Backend        | Java 25, Spring Boot 3, Gradle                   |
| Banco de Dados | PostgreSQL                                       |
| Frontend       | React.js/Flutter (não incluso neste repositório) |
| Testes         | JUnit (em construção)                            |
---

## ⚙️ Como Rodar o Projeto Localmente

### 1. Pré-requisitos

- Java 25+
- PostgreSQL 17+
- Gradle 9+
- Docker (opcional, para o postgresql e a aplicação com variáveis)

### 2. Clonar o projeto

```bash
git clone https://github.com/janiotech/api-taskflow-java.git
cd api-taskflow-java
```

### 3. Configurar o banco de dados

Crie um banco chamado taskflow_db no PostgreSQL:
```sql
CREATE DATABASE taskflow_db;
```

### 4. Variáveis de ambiente

Crie um arquivo .env no diretorio da aplicação com as seguintes variáveis:
```env
DB_HOST=postgres
# PostgreSQL
POSTGRES_DB=taskflow_db
POSTGRES_USER=root
POSTGRES_PASSWORD=root
POSTGRES_PORT=5432

# pgAdmin (opcional)
PGADMIN_DEFAULT_EMAIL=admin@admin.com
PGADMIN_DEFAULT_PASSWORD=admin
PGADMIN_PORT=5050
```

### 5. Buildar & Executar a aplicação com docker

Para executar a aplicação com as variáveis de ambiente abra seu terminal na raiz do projeto e execute:
```bash
docker-compose up -d --build
```
obs: esse comando vai criar o container api-medical-appointments com os 3 serviços postgres,pgadmin e medical-app


dica: caso já tenha usado o comando acima e não queira rebuildar seu projeto use:
```bash
docker-compose up -d
```

test remove push directed to branch main