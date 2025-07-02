# 🔑 OAuth API com Keycloak e Swagger

Este projeto implementa uma API OAuth utilizando Keycloak como servidor de autenticação e autorização. A API permite:

- ✅ Autenticação de usuários
- ✅ Gestão de usuários e papéis (roles)
- ✅ Validação e renovação de tokens JWT
- ✅ Documentação automática via Swagger

---

## 📚 Documentação do Projeto

### 📋 Documentação Geral
- [**ACTUATOR_README.md**](./ACTUATOR_README.md) - Configurações de Actuator e Health Checks para todos os serviços
- [**DEBUG_README.md**](./DEBUG_README.md) - Configurações de Debug no VS Code para todos os serviços
- [**POSTMAN_README.md**](./POSTMAN_README.md) - Collection do Postman com todos os endpoints e padrões de nomenclatura

### 🏗️ Documentação dos Serviços

#### Frontend
- [**Frontend README.md**](./frontend/README.md) - Documentação do frontend React/TypeScript

#### Backend Services

##### Node.js/TypeScript
- [**BFF README.md**](./backend/bff/README.md) - Backend for Frontend (Proxy/Aggregator)
- [**OAuth README.md**](./backend/oauth/README.md) - Serviço de Autenticação e Autorização
- [**Professors README.md**](./backend/professors/README.md) - Gestão de Professores

##### Java/Spring Boot
- [**Classes README.md**](./backend/classes/README.md) - Gestão de Classes e Turnos
- [**Courses README.md**](./backend/courses/README.md) - Gestão de Cursos e Disciplinas
- [**Reservations README.md**](./backend/reservations/README.md) - Sistema de Reservas
- [**Resources README.md**](./backend/resources/README.md) - Gestão de Recursos
- [**Rooms README.md**](./backend/rooms/README.md) - Gestão de Salas
- [**Students README.md**](./backend/students/README.md) - Gestão de Estudantes

##### Python/FastAPI
- [**Lessons README.md**](./backend/lessons/README.md) - Gestão de Aulas e Frequência

### 🧪 Testes e APIs

#### Postman Collection
- [**POSTMAN_README.md**](./POSTMAN_README.md) - Collection completa do Postman com todos os endpoints organizados por serviço
  - **Arquivos incluídos:**
    - [**constrsw-2025-1.postman_collection.json**](./constrsw-2025-1.postman_collection.json) - Collection com todos os endpoints
    - [**constrsw-2025-1.postman_environment.json**](./constrsw-2025-1.postman_environment.json) - Environment com variáveis configuradas
  - **Recursos:**
    - Endpoints organizados por serviço (OAuth, BFF, Classes, Courses, etc.)
    - Autenticação automática com tokens JWT
    - Variáveis de ambiente pré-configuradas
    - Padrões de nomenclatura padronizados
    - Exemplos de payload para todos os endpoints
    - Health checks e monitoramento

---

## 📁 Estrutura do Projeto

```
base/
├── docker-compose.yml                  # Orquestra Keycloak e OAuth containers
├── .env                                # Variáveis de ambiente
├── ACTUATOR_README.md                  # Configurações de Actuator
├── DEBUG_README.md                     # Configurações de Debug
└── backend/
    └── oauth/                          # Projeto OAuth (submódulo)
        ├── Dockerfile                  # Dockerfile para API OAuth
        ├── package.json
        ├── package-lock.json
        ├── tsconfig.json
        └── src/
            ├── app.ts                  # Configuração principal do Express
            ├── index.ts                # Inicialização do servidor
            ├── swagger.ts              # Configuração do Swagger
            ├── config/
            │   └── keycloak.ts         # Variáveis do Keycloak
            ├── controllers/            # Controllers da API
            │   ├── auth.controller.ts
            │   ├── users.controller.ts
            │   ├── roles.controller.ts
            │   └── validate.controller.ts
            ├── routes/                 # Rotas da API
            │   ├── auth.routes.ts
            │   ├── users.routes.ts
            │   ├── roles.routes.ts
            │   └── validate.routes.ts
            ├── middlewares/
            │   └── error.middleware.ts # Middleware global de erros
            └── utils/
                └── error.util.ts       # Classe personalizada de erro
```

---

## 🛠️ Requisitos

- Docker e Docker Compose
- Node.js (>=20.x)
- npm (>=10.x)

---

## 🚀 Configuração Inicial

### 1. Clone o repositório principal (com submódulo OAuth):

```sh
git clone --recurse-submodules https://github.com/pucrs-constrsw-2025-1/base.git
```

ou (caso já tenha clonado sem submódulos):

```sh
git submodule update --init --recursive
```

### 2. Crie os volumes Docker externos necessários:

```sh
docker volume create constrsw-keycloak-data
docker volume create constrsw-postgresql-data
docker volume create constrsw-mongodb-data
```

---

## ⚙️ Variáveis de Ambiente (.env)

Exemplo do arquivo `.env` na pasta raíz:

```env
KEYCLOAK_ADMIN=admin
KEYCLOAK_ADMIN_PASSWORD=a12345678
KEYCLOAK_CLIENT_ID=oauth
KEYCLOAK_CLIENT_SECRET=seu_client_secret
KEYCLOAK_INTERNAL_HOST=keycloak
KEYCLOAK_INTERNAL_API_PORT=8080
KEYCLOAK_EXTERNAL_CONSOLE_PORT=8090
KEYCLOAK_INTERNAL_CONSOLE_PORT=8090
KEYCLOAK_HEALTH_ENABLED=true
KEYCLOAK_REALM=constrsw
OAUTH_EXTERNAL_API_PORT=3000
OAUTH_INTERNAL_API_PORT=3000
OAUTH_INTERNAL_HOST=oauth
OAUTH_INTERNAL_PORT=3000
```

---

## 🚦 Executar o projeto

### Executar com Docker Compose:

```sh
docker compose up --build -d
```

### Parar os containers:

```sh
docker compose down
```

---

## 📖 Documentação Swagger

Após inicializar o projeto, acesse a documentação em:

👉 [http://localhost:3000/api-docs](http://localhost:3000/api-docs)

---

## 🔑 Exemplos de Uso via cURL

### Login e obtenção de token JWT:

```sh
curl -X POST http://localhost:3000/login \
  -F username=usuario@exemplo.com \
  -F password=suasenha \
  -F grant_type=password \
  -F client_id=oauth
```

### Criar usuário:

```sh
curl -X POST http://localhost:3000/users \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{
    "username": "jdoe",
    "password": "MinhaSenha123",
    "first-name": "John",
    "last-name": "Doe",
    "email": "jdoe@exemplo.com"
}'
```

### Criar role:

```sh
curl -X POST http://localhost:3000/roles \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{
    "name": "editor",
    "description": "Editor de conteúdo"
}'
```

---

## 🐛 Troubleshooting

- Se encontrar erros de autenticação (`401 Unauthorized`), verifique se o usuário utilizado tem as permissões corretas no Keycloak (role `realm-admin`).
- Cheque o status dos containers:

```sh
docker ps
```

- Inspecione logs dos containers:

```sh
docker logs oauth
docker logs keycloak
```

---

## ✅ Melhores Práticas

- Sempre defina variáveis sensíveis em `.env` e **NUNCA** suba segredos no GitHub.
- Utilize Docker Compose para simplificar a gestão dos containers.
- Mantenha a documentação Swagger sempre atualizada ao alterar rotas ou métodos.

---

## 📌 Commits

Padrão sugerido para commits:

```sh
git commit -m "feat(contexto): breve descrição da funcionalidade implementada"
```

Exemplos recentes:

- Base:
  ```sh
  git commit -m "chore(base): atualizar docker-compose e variáveis de ambiente para oauth"
  ```
- OAuth:
  ```sh
  git commit -m "feat(oauth): implementar integrações de login, users e roles com Keycloak e ajustar Swagger"
  ```

---

## 📚 Recursos Adicionais

- [Keycloak - Documentação Oficial](https://www.keycloak.org/documentation)
- [Swagger - Documentação Oficial](https://swagger.io/docs/)
- [Express.js - Guia](https://expressjs.com/pt-br/guide/)

---

