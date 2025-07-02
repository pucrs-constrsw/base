# ConstrSW 2025-1 - Postman Collection

Este repositório contém uma collection e environment do Postman com todos os endpoints das REST APIs do projeto ConstrSW 2025-1.

## 📁 Arquivos

- [**constrsw-2025-1.postman_collection.json**](./constrsw-2025-1.postman_collection.json) - Collection com todos os endpoints
- [**constrsw-2025-1.postman_environment.json**](./constrsw-2025-1.postman_environment.json) - Environment com variáveis de configuração
- **POSTMAN_README.md** - Este arquivo de instruções

## 🚀 Como usar

### 1. Importar no Postman

1. Abra o Postman
2. Clique em **Import**
3. Selecione os arquivos:
   - [**constrsw-2025-1.postman_collection.json**](./constrsw-2025-1.postman_collection.json)
   - [**constrsw-2025-1.postman_environment.json**](./constrsw-2025-1.postman_environment.json)

### 2. Configurar o Environment

1. No Postman, selecione o environment **"ConstrSW 2025-1 Environment"**
2. Verifique se as variáveis estão configuradas corretamente:
   - `bff_url`: http://localhost:8080
   - `oauth_url`: http://localhost:8181
   - `username`: admin
   - `password`: admin123

### 3. Autenticação

1. Execute o endpoint **"Authentication > Login"** para obter o token de acesso
2. O token será automaticamente armazenado na variável `access_token`
3. Todos os outros endpoints já estão configurados para usar o token automaticamente

## 📋 Estrutura da Collection

### 🔐 Authentication
- **Login** - POST para autenticar e obter token
- **Refresh Token** - POST para renovar o token
- **Validate Token** - GET para validar o token atual

### 🏥 BFF - Health
- **Health Check** - GET para verificar saúde do BFF
- **Actuator Health** - GET para health check detalhado

### 🎓 Classes Service
- **Create Class** - POST para criar turma
- **Get All Classes** - GET para listar todas as turmas
- **Get Class by ID** - GET para buscar turma específica
- **Update Class** - PUT para atualizar turma
- **Delete Class** - DELETE para remover turma

### 📚 Courses Service
- **Create Course** - POST para criar curso
- **Get All Courses** - GET para listar todos os cursos
- **Get Course by ID** - GET para buscar curso específico
- **Update Course** - PUT para atualizar curso
- **Delete Course** - DELETE para remover curso

### 📖 Lessons Service
- **Create Lesson** - POST para criar aula
- **Get All Lessons** - GET para listar todas as aulas
- **Get Lesson by ID** - GET para buscar aula específica
- **Update Lesson** - PUT para atualizar aula
- **Delete Lesson** - DELETE para remover aula

### 👨‍🏫 Professors Service
- **Create Professor** - POST para criar professor
- **Get All Professors** - GET para listar todos os professores
- **Get Professor by ID** - GET para buscar professor específico
- **Update Professor** - PUT para atualizar professor
- **Delete Professor** - DELETE para remover professor

### 📅 Reservations Service
- **Create Reservation** - POST para criar reserva
- **Get All Reservations** - GET para listar todas as reservas
- **Get Reservation by ID** - GET para buscar reserva específica
- **Update Reservation** - PUT para atualizar reserva
- **Delete Reservation** - DELETE para remover reserva

### 🛠️ Resources Service
- **Create Resource** - POST para criar recurso
- **Get All Resources** - GET para listar todos os recursos
- **Get Resource by ID** - GET para buscar recurso específico
- **Update Resource** - PUT para atualizar recurso
- **Delete Resource** - DELETE para remover recurso

### 🏢 Rooms Service
- **Create Room** - POST para criar sala
- **Get All Rooms** - GET para listar todas as salas
- **Get Room by ID** - GET para buscar sala específica
- **Update Room** - PUT para atualizar sala
- **Delete Room** - DELETE para remover sala

### 👨‍🎓 Students Service
- **Create Student** - POST para criar estudante
- **Get All Students** - GET para listar todos os estudantes
- **Get Student by ID** - GET para buscar estudante específico
- **Update Student** - PUT para atualizar estudante
- **Delete Student** - DELETE para remover estudante

## 🔧 Variáveis do Environment

### URLs dos Serviços
- `bff_url`: http://localhost:8080 (BFF principal)
- `oauth_url`: http://localhost:8181 (Serviço OAuth)
- `classes_url`: http://localhost:8182
- `courses_url`: http://localhost:8183
- `lessons_url`: http://localhost:8184
- `professors_url`: http://localhost:8185
- `reservations_url`: http://localhost:8186
- `resources_url`: http://localhost:8187
- `rooms_url`: http://localhost:8188
- `students_url`: http://localhost:8189
- `frontend_url`: http://localhost:8042
- `keycloak_url`: http://localhost:8279

### Autenticação
- `client_id`: oauth
- `client_secret`: wsNXUxaupU9X6jCncsn3rOEy6PDt7oJO
- `username`: admin
- `password`: admin123
- `access_token`: (preenchido automaticamente após login)
- `refresh_token`: (preenchido automaticamente após login)

### IDs de Exemplo
- `class_id`: ID de uma turma criada
- `course_id`: ID de um curso criado
- `lesson_id`: ID de uma aula criada
- `professor_id`: ID de um professor criado
- `reservation_id`: ID de uma reserva criada
- `resource_id`: ID de um recurso criado
- `room_id`: ID de uma sala criada
- `student_id`: ID de um estudante criado
- `category_id`: ID de uma categoria criada

## 🎯 Fluxo de Uso Recomendado

1. **Iniciar os serviços**: `docker-compose up -d`
2. **Importar collection e environment no Postman**
3. **Fazer login**: Executar "Authentication > Login"
4. **Testar endpoints**: Começar pelos endpoints de criação (POST)
5. **Usar IDs retornados**: Copiar IDs das respostas para usar em outros endpoints

## 🔍 Dicas de Uso

- Todos os endpoints que requerem autenticação já estão configurados com o header `Authorization: Bearer {{access_token}}`
- Os exemplos de payload (body) estão configurados com dados de exemplo
- Use as variáveis de ID (ex: `{{class_id}}`) para referenciar recursos criados
- O BFF (Backend for Frontend) atua como proxy para todos os serviços

## 🐛 Troubleshooting

- **Erro 401**: Execute novamente o endpoint de login
- **Erro 404**: Verifique se o serviço está rodando
- **Erro de conexão**: Verifique se o Docker está rodando e os containers estão ativos

## 📝 Notas

- Esta collection usa o BFF como ponto de entrada principal
- Todos os endpoints seguem o padrão REST
- Os dados de exemplo são fictícios e devem ser adaptados conforme necessário
- A collection está organizada por serviço para facilitar a navegação

---

## 📋 Padrões de Nomenclatura - Postman Collection

### 🏗️ **Estrutura de Folders Principais**

#### **Padrão: `[Service Name] Service`**
- ✅ **Correto**: `OAuth Service`, `Classes Service`, `Courses Service`
- ❌ **Incorreto**: `oauth`, `Classes Service`, `BFF - Health`

#### **Lista Padronizada de Services:**
1. `OAuth Service`
2. `BFF Service`
3. `Classes Service`
4. `Courses Service`
5. `Lessons Service`
6. `Professors Service`
7. `Reservations Service`
8. `Resources Service`
9. `Rooms Service`
10. `Students Service`

### 📁 **Estrutura de Subfolders**

#### **Padrão por Categoria:**
```
[Service Name] Service/
├── Authentication/
├── Health & Monitoring/
├── [Resource Name]/
│   ├── CRUD Operations/
│   └── [Specific Operations]/
└── Documentation/
```

#### **Exemplos de Subfolders Padronizados:**

**OAuth Service:**
- `Authentication`
- `Token Validation`
- `Users Management`
- `Roles Management`
- `Health & Monitoring`
- `Documentation`

**Classes Service:**
- `Health & Monitoring`
- `Shifts Management`
- `Classes Management`
- `Enrollment Management`
- `Documentation`

**Professors Service:**
- `Health & Monitoring`
- `Professors Management`
- `Degrees Management`
- `Availability Management`
- `Documentation`

### 🏷️ **Nomenclatura de Endpoints**

#### **Padrão: `[Action] [Resource]`**

| Método HTTP | Padrão | Exemplo |
|-------------|--------|---------|
| GET | `Get [Resource]` | `Get Professor`, `Get All Classes` |
| POST | `Create [Resource]` | `Create Professor`, `Create Class` |
| PUT | `Update [Resource]` | `Update Professor`, `Update Class` |
| PATCH | `Patch [Resource]` | `Patch Professor`, `Patch Class` |
| DELETE | `Delete [Resource]` | `Delete Professor`, `Delete Class` |

#### **Endpoints Específicos:**
- `Login` (para autenticação)
- `Refresh Token` (para renovação de token)
- `Validate Token` (para validação)
- `Health Check` (para monitoramento)
- `Get All [Resources]` (para listagem)
- `Get [Resource] by ID` (para busca específica)

### 🔧 **Nomenclatura de Variáveis**

#### **Padrão: `[service]_url`**
- `oauth_url`
- `bff_url`
- `classes_url`
- `courses_url`
- `lessons_url`
- `professors_url`
- `reservations_url`
- `resources_url`
- `rooms_url`
- `students_url`

#### **Variáveis de Autenticação:**
- `client_id`
- `username`
- `password`
- `access_token`
- `refresh_token`

#### **Variáveis de Recursos:**
- `user_id`
- `professor_id`
- `class_id`
- `course_id`
- `room_id`
- `student_id`
- `role_name`
- `resource`

### 📊 **Estrutura de Respostas**

#### **Padrão de Nomenclatura de Respostas:**
- `Success` (200/201)
- `Bad Request` (400)
- `Unauthorized` (401)
- `Forbidden` (403)
- `Not Found` (404)
- `Conflict` (409)
- `Unprocessable Entity` (422)
- `Internal Server Error` (500)

### 🎯 **Exemplos de Padronização**

#### **Antes (Inconsistente):**
```
oauth/
├── Login
├── Refresh Token
└── Validate Token

BFF - Health/
├── Health Check
└── Actuator Health

Classes Service/
├── api/v1/
│   ├── shifts/
│   │   └── {id}/
│   │       ├── Get shift by ID
│   │       ├── Update a shift
│   │       └── Delete a shift
│   │       └── Update a class completely
│   └── classes/
│       └── {id}/
│           ├── Get a class by ID
│           └── Update a class completely
```

#### **Depois (Padronizado):**
```
OAuth Service/
├── Authentication/
│   ├── Login
│   └── Refresh Token
├── Token Validation/
│   └── Validate Token
├── Users Management/
│   ├── Create User
│   ├── Get All Users
│   ├── Get User by ID
│   ├── Update User
│   ├── Patch User
│   └── Delete User
├── Roles Management/
│   ├── Create Role
│   ├── Get All Roles
│   ├── Get Role by Name
│   ├── Update Role
│   ├── Patch Role
│   ├── Delete Role
│   ├── Assign Role to User
│   └── Remove Role from User
├── Health & Monitoring/
│   ├── Health Check
│   ├── Liveness Probe
│   ├── Readiness Probe
│   ├── Application Info
│   ├── Prometheus Metrics
│   ├── Environment Info
│   └── Endpoint Mappings
└── Documentation/
    └── Swagger UI

Classes Service/
├── Health & Monitoring/
│   ├── Health Check
│   ├── Application Info
│   └── Prometheus Metrics
├── Shifts Management/
│   ├── Create Shift
│   ├── Get All Shifts
│   ├── Get Shift by ID
│   ├── Update Shift
│   ├── Patch Shift
│   └── Delete Shift
├── Classes Management/
│   ├── Create Class
│   ├── Get All Classes
│   ├── Get Class by ID
│   ├── Update Class
│   ├── Patch Class
│   └── Delete Class
├── Enrollment Management/
│   ├── Enroll Student
│   ├── Get Enrolled Student
│   ├── Update Enrollment
│   └── Remove Enrollment
└── Documentation/
    └── Swagger UI
```

### 🔄 **Processo de Padronização**

1. **Renomear folders principais** para seguir o padrão `[Service Name] Service`
2. **Organizar endpoints** em subfolders lógicos
3. **Padronizar nomes de endpoints** seguindo o padrão `[Action] [Resource]`
4. **Atualizar variáveis** para seguir o padrão `[service]_url`
5. **Reorganizar estrutura hierárquica** para melhor navegação
6. **Padronizar respostas** com nomes consistentes

### ✅ **Checklist de Validação**

- [ ] Todos os folders principais seguem o padrão `[Service Name] Service`
- [ ] Subfolders estão organizados por categoria lógica
- [ ] Endpoints seguem o padrão `[Action] [Resource]`
- [ ] Variáveis seguem o padrão `[service]_url`
- [ ] Estrutura hierárquica é consistente
- [ ] Nomes de respostas são padronizados
- [ ] Documentação está organizada
- [ ] Health & Monitoring está separado
- [ ] Authentication está separado (quando aplicável) 