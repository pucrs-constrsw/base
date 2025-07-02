# Configurações de Debug - ConstrSW 2025-1

Este arquivo documenta as configurações de debug disponíveis no VS Code para todos os serviços do projeto ConstrSW, incluindo um resumo completo de todos os serviços e suas configurações.

## Resumo dos Serviços

### Frontend

#### 1. **Frontend** (`frontend/`)
- **Tecnologia**: React/TypeScript
- **Tipo**: Node.js (launch)
- **Comando**: `npm start`

### Serviços Node.js/TypeScript

#### 2. **BFF** (`backend/bff/`)
- **Tecnologia**: Node.js/Express
- **Porta de Debug**: 8290
- **Porta da API**: 8190
- **Função**: Backend for Frontend (Proxy/Aggregator)
- **Build Tool**: NPM
- **Tipo**: Node.js (attach)

#### 3. **OAuth** (`backend/oauth/`)
- **Tecnologia**: Node.js/TypeScript/Express
- **Porta de Debug**: 8281
- **Porta da API**: 8181
- **Banco**: MongoDB
- **Build Tool**: NPM
- **Tipo**: Node.js (attach)

#### 4. **Professors** (`backend/professors/`)
- **Tecnologia**: Node.js/TypeScript/Express
- **Porta de Debug**: 8285
- **Porta da API**: 8185
- **Banco**: MongoDB
- **Build Tool**: NPM
- **Tipo**: Node.js (attach)

### Serviços Java/Spring Boot

#### 5. **Classes** (`backend/classes/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8282
- **Porta da API**: 8182
- **Banco**: PostgreSQL + MongoDB
- **Build Tool**: Maven
- **Tipo**: Java (attach)

#### 6. **Courses** (`backend/courses/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8283
- **Porta da API**: 8183
- **Banco**: PostgreSQL
- **Build Tool**: Maven
- **Tipo**: Java (attach)

#### 7. **Reservations** (`backend/reservations/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8286
- **Porta da API**: 8186
- **Banco**: PostgreSQL + MongoDB
- **Build Tool**: Gradle
- **Tipo**: Java (attach)

#### 8. **Resources** (`backend/resources/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8287
- **Porta da API**: 8187
- **Banco**: PostgreSQL
- **Build Tool**: Maven
- **Tipo**: Java (attach)

#### 9. **Rooms** (`backend/rooms/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8288
- **Porta da API**: 8188
- **Banco**: PostgreSQL
- **Build Tool**: Gradle
- **Tipo**: Java (attach)

#### 10. **Students** (`backend/students/`)
- **Tecnologia**: Java/Spring Boot
- **Porta de Debug**: 8289
- **Porta da API**: 8189
- **Banco**: PostgreSQL
- **Build Tool**: Maven
- **Tipo**: Java (attach)

### Serviços Python

#### 11. **Lessons** (`backend/lessons/`)
- **Tecnologia**: Python/FastAPI
- **Porta de Debug**: 8284
- **Porta da API**: 8184
- **Banco**: PostgreSQL
- **Build Tool**: Pip
- **Tipo**: Python (attach)

## Configurações Compostas (Compounds)

### Debug All Backend Services
Debug de todos os serviços backend simultaneamente:
- OAuth Service
- BFF Service
- Professors Service
- Classes Service
- Courses Service
- Lessons Service
- Resources Service
- Rooms Service
- Students Service
- Reservations Service

### Debug Core Services
Debug dos serviços principais:
- OAuth Service
- BFF Service
- Professors Service

### Debug Academic Services
Debug dos serviços acadêmicos:
- Classes Service
- Courses Service
- Lessons Service
- Students Service

### Debug Infrastructure Services
Debug dos serviços de infraestrutura:
- Resources Service
- Rooms Service
- Reservations Service

## Padrões Seguidos

Todos os serviços seguem o mesmo padrão estruturado de debug:

### Seções Padrão para Cada Serviço
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

| Serviço | Porta Debug | Porta API | Tecnologia |
|---------|-------------|-----------|------------|
| Frontend | - | 8042 | React/TypeScript |
| BFF | 8290 | 8190 | Node.js/Express |
| OAuth | 8281 | 8181 | Node.js/TypeScript |
| Classes | 8282 | 8182 | Java/Spring Boot |
| Courses | 8283 | 8183 | Java/Spring Boot |
| Lessons | 8284 | 8184 | Python/FastAPI |
| Professors | 8285 | 8185 | Node.js/TypeScript |
| Reservations | 8286 | 8186 | Java/Spring Boot |
| Resources | 8287 | 8187 | Java/Spring Boot |
| Rooms | 8288 | 8188 | Java/Spring Boot |
| Students | 8289 | 8189 | Java/Spring Boot |

## Tecnologias de Debug

- **Java**: JDWP (Java Debug Wire Protocol)
- **Node.js**: Node.js Inspector
- **Python**: debugpy

## Como Usar

### 1. Debug Individual
1. Abra o VS Code
2. Vá para a aba "Run and Debug" (Ctrl+Shift+D)
3. Selecione o serviço desejado no dropdown
4. Clique em "Start Debugging" (F5)

### 2. Debug Composto
1. Abra o VS Code
2. Vá para a aba "Run and Debug" (Ctrl+Shift+D)
3. Selecione uma configuração composta (ex: "Debug Core Services")
4. Clique em "Start Debugging" (F5)

### 3. Debug com Breakpoints
1. Abra o arquivo que deseja debugar
2. Defina breakpoints clicando na margem esquerda
3. Inicie o debug do serviço correspondente
4. Execute a ação que ativa o código com breakpoint

## Pré-requisitos

### Para Serviços Node.js
- Node.js instalado
- Extensão "Node.js" do VS Code

### Para Serviços Java
- Java JDK instalado
- Extensão "Extension Pack for Java" do VS Code
- Maven ou Gradle configurado

### Para Serviços Python
- Python instalado
- Extensão "Python" do VS Code

## Troubleshooting

### Problema: "Cannot connect to the target VM"
- Verifique se o serviço está rodando
- Confirme se a porta de debug está correta
- Verifique se o Docker está configurado para expor a porta de debug

### Problema: "Source maps not found"
- Para serviços Node.js, verifique se o TypeScript está compilando
- Para serviços Java, verifique se o projeto foi compilado

### Problema: "Breakpoints not hitting"
- Verifique se está debugando o serviço correto
- Confirme se o código está sendo executado
- Verifique se os source maps estão configurados corretamente

### Problema: "Port already in use"
- Verifique se não há outro processo usando a porta de debug
- Use `netstat -ano | findstr :8281` (Windows) ou `lsof -i :8281` (Linux/Mac) para verificar

## Dicas

1. **Debug Remoto**: Todas as configurações são para debug remoto (attach), assumindo que os serviços estão rodando em containers Docker

2. **Hot Reload**: Os serviços Node.js suportam hot reload durante o debug

3. **Logs**: Use `console.log()` em Node.js ou `System.out.println()` em Java para logs adicionais

4. **Variables**: Use a aba "Variables" no debugger para inspecionar valores em tempo real

5. **Call Stack**: Use a aba "Call Stack" para navegar pela pilha de execução

6. **Watch**: Use a aba "Watch" para monitorar expressões específicas

7. **Breakpoints Condicionais**: Configure breakpoints que só ativam quando uma condição é verdadeira

## Benefícios da Configuração

- **Padronização**: Todos os serviços seguem o mesmo padrão de documentação
- **Facilidade de Uso**: Instruções claras e passo a passo
- **Troubleshooting**: Soluções para problemas comuns
- **Configuração**: Configurações prontas para VS Code
- **Manutenção**: Documentação atualizada e consistente
- **Debug Simultâneo**: Possibilidade de debugar múltiplos serviços ao mesmo tempo
- **Flexibilidade**: Configurações individuais e compostas disponíveis 