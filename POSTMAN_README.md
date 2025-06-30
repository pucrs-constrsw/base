# ConstrSW 2025-1 - Postman Collection

Este repositório contém uma collection e environment do Postman com todos os endpoints das REST APIs do projeto ConstrSW 2025-1.

## 📁 Arquivos

- `constrsw-2025-1.postman_collection.json` - Collection com todos os endpoints
- `constrsw-2025-1.postman_environment.json` - Environment com variáveis de configuração
- `POSTMAN_README.md` - Este arquivo de instruções

## 🚀 Como usar

### 1. Importar no Postman

1. Abra o Postman
2. Clique em **Import**
3. Selecione os arquivos:
   - `constrsw-2025-1.postman_collection.json`
   - `constrsw-2025-1.postman_environment.json`

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