# Padrões de Nomenclatura - Postman Collection

## 📋 Diretrizes de Padronização

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