# Resumo dos DEBUG_README.md Criados

Este documento resume todos os arquivos DEBUG_README.md criados para cada serviço do projeto ConstrSW 2025-1.

## Serviços com DEBUG_README.md Criados

### 1. **Classes** (`backend/classes/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8282
- **Porta da API**: 8182
- **Banco**: PostgreSQL + MongoDB
- **Build Tool**: Maven

### 2. **Courses** (`backend/courses/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8283
- **Porta da API**: 8183
- **Banco**: PostgreSQL
- **Build Tool**: Maven

### 3. **OAuth** (`backend/oauth/DEBUG_README.md`)
- **Tecnologia**: Node.js/TypeScript/Express
- **Porta de Debug**: 8281
- **Porta da API**: 8181
- **Banco**: MongoDB
- **Build Tool**: NPM

### 4. **Professors** (`backend/professors/DEBUG_README.md`)
- **Tecnologia**: Node.js/TypeScript/Express
- **Porta de Debug**: 8285
- **Porta da API**: 8185
- **Banco**: MongoDB
- **Build Tool**: NPM

### 5. **Lessons** (`backend/lessons/DEBUG_README.md`)
- **Tecnologia**: Python/FastAPI
- **Porta de Debug**: 8284
- **Porta da API**: 8184
- **Banco**: PostgreSQL
- **Build Tool**: Pip

### 6. **Reservations** (`backend/reservations/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8286
- **Porta da API**: 8186
- **Banco**: PostgreSQL + MongoDB
- **Build Tool**: Gradle

### 7. **Resources** (`backend/resources/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8287
- **Porta da API**: 8187
- **Banco**: PostgreSQL
- **Build Tool**: Maven

### 8. **Rooms** (`backend/rooms/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8288
- **Porta da API**: 8188
- **Banco**: PostgreSQL
- **Build Tool**: Gradle

### 9. **Students** (`backend/students/DEBUG_README.md`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8289
- **Porta da API**: 8189
- **Banco**: PostgreSQL
- **Build Tool**: Maven

### 10. **BFF** (`backend/bff/DEBUG_README.md`)
- **Tecnologia**: Node.js/Express
- **Porta de Debug**: 8290
- **Porta da API**: 8190
- **Função**: Backend for Frontend (Proxy/Aggregator)
- **Build Tool**: NPM

## Padrões Seguidos

Todos os DEBUG_README.md seguem o mesmo padrão estruturado:

### Seções Padrão
1. **Configuração de Debug** - Explicação da tecnologia de debug
2. **Portas de Debug** - Portas interna e externa
3. **Configuração do VS Code** - Configuração do launch.json
4. **Como Usar** - Passo a passo para debug
5. **Endpoints Disponíveis** - URLs principais do serviço
6. **Troubleshooting** - Solução de problemas comuns
7. **Configuração do Dockerfile** - Configurações de debug no container
8. **Variáveis de Ambiente** - Variáveis específicas do serviço
9. **Logs de Debug** - Como verificar logs
10. **Reiniciar com Debug** - Comandos para reiniciar
11. **Verificar Status do Debug** - Como confirmar se está funcionando

### Seções Específicas por Tecnologia

#### Java/Spring Boot
- Banco de Dados
- Dependências
- Estrutura do Projeto
- Build com Maven/Gradle
- Configuração do Maven/Gradle

#### Node.js/TypeScript
- Scripts NPM
- Dependências
- Estrutura do Projeto
- Hot Reload
- Source Maps

#### Python/FastAPI
- Scripts Python
- Dependências
- Estrutura do Projeto
- Hot Reload
- Configuração do FastAPI
- Debug com pdb
- Configuração do SQLAlchemy
- Actuator Endpoints

## Endpoints Padronizados

Todos os serviços seguem o padrão de endpoints:

- **Health Check**: `/actuator/health`
- **API Base**: `/`
- **Documentação**: `/api-docs`
- **Swagger UI**: `/swagger-ui`

## Portas de Debug

| Serviço | Porta Debug | Porta API |
|---------|-------------|-----------|
| Classes | 8282 | 8182 |
| Courses | 8283 | 8183 |
| OAuth | 8281 | 8181 |
| Professors | 8285 | 8185 |
| Lessons | 8284 | 8184 |
| Reservations | 8286 | 8186 |
| Resources | 8287 | 8187 |
| Rooms | 8288 | 8188 |
| Students | 8289 | 8189 |
| BFF | 8290 | 8190 |

## Tecnologias de Debug

- **Java**: JDWP (Java Debug Wire Protocol)
- **Node.js**: Node.js Inspector
- **Python**: debugpy

## Como Usar

1. Cada DEBUG_README.md contém instruções específicas para o serviço
2. Todos seguem o mesmo fluxo: iniciar serviço → conectar debugger → definir breakpoints
3. Configurações do VS Code já estão preparadas no `.vscode/launch.json`
4. Troubleshooting específico para cada tecnologia

## Benefícios

- **Padronização**: Todos os serviços seguem o mesmo padrão de documentação
- **Facilidade de Uso**: Instruções claras e passo a passo
- **Troubleshooting**: Soluções para problemas comuns
- **Configuração**: Configurações prontas para VS Code
- **Manutenção**: Documentação atualizada e consistente 