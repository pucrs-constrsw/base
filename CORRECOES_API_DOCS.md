# Correções dos Endpoints de Documentação API

## 📋 Resumo das Correções

Este documento descreve as correções realizadas para padronizar os endpoints de documentação em todos os serviços do projeto ConstrSW 2025-1.

## 🎯 Objetivo

Padronizar todos os serviços para responder corretamente aos endpoints:
- **`/api-docs`** - JSON da documentação OpenAPI/Swagger
- **`/swagger-ui`** - Interface gráfica do Swagger UI

## 🔧 Correções Realizadas

### 1. **Serviços Java/Spring Boot**

#### **Classes Service** (`backend/classes/`)
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Mantido: `springdoc.api-docs.path=/api-docs`

#### **Courses Service** (`backend/courses/`)
- ✅ Adicionado: Configuração completa do SpringDoc
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Configurado: `springdoc.api-docs.path=/api-docs`

#### **Students Service** (`backend/students/`)
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Mantido: `springdoc.api-docs.path=/api-docs`

#### **Resources Service** (`backend/resources/`)
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Mantido: `springdoc.api-docs.path=/api-docs`

#### **Rooms Service** (`backend/rooms/`)
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Mantido: `springdoc.api-docs.path=/api-docs`

#### **Reservations Service** (`backend/reservations/`)
- ✅ Configurado: `springdoc.swagger-ui.path=/swagger-ui`
- ✅ Mantido: `springdoc.api-docs.path=/api-docs`

### 2. **Serviços Node.js/TypeScript**

#### **OAuth Service** (`backend/oauth/`)
- ✅ Modificado: `swagger.ts` para separar JSON e UI
- ✅ Endpoint JSON: `GET /api-docs`
- ✅ Interface UI: `GET /swagger-ui`

#### **Professors Service** (`backend/professors/`)
- ✅ Modificado: `app.ts` para separar JSON e UI
- ✅ Endpoint JSON: `GET /api-docs`
- ✅ Interface UI: `GET /swagger-ui`

### 3. **Serviços Python/FastAPI**

#### **Lessons Service** (`backend/lessons/`)
- ✅ Configurado: `docs_url="/swagger-ui"`
- ✅ Configurado: `openapi_url="/api-docs"`

## 📊 Configurações Padronizadas

### **Spring Boot (application.properties/yml)**
```properties
# Documentação OpenAPI/Swagger
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui
springdoc.swagger-ui.enabled=true
springdoc.api-docs.enabled=true
```

### **Node.js/Express**
```typescript
// Endpoint para JSON da documentação
app.get('/api-docs', (req, res) => {
    res.setHeader('Content-Type', 'application/json');
    res.send(swaggerSpec);
});

// Interface Swagger UI
app.use('/swagger-ui', swaggerUi.serve, swaggerUi.setup(swaggerSpec));
```

### **FastAPI**
```python
app = FastAPI(
    title="Service Name",
    version="1.0.0",
    docs_url="/swagger-ui",
    openapi_url="/api-docs"
)
```

## 🧪 Como Testar

### **Script de Teste Automático**
```bash
# Executar o script de teste
./test-api-docs.sh
```

### **Teste Manual**
```bash
# Testar JSON da documentação
curl -i http://localhost:8182/api-docs

# Testar interface Swagger UI
curl -i http://localhost:8182/swagger-ui
```

## 🔄 Próximos Passos

1. **Reiniciar todos os serviços** para aplicar as mudanças:
   ```bash
   docker-compose restart
   ```

2. **Executar o script de teste** para verificar se tudo está funcionando:
   ```bash
   ./test-api-docs.sh
   ```

3. **Validar manualmente** alguns serviços específicos se necessário.

## ✅ Resultado Esperado

Após as correções e reinicialização dos serviços:

- **`/api-docs`** deve retornar `200 OK` com JSON da documentação
- **`/swagger-ui`** deve retornar `200 OK` com interface HTML do Swagger
- **`/swagger-ui.html`** pode retornar `404` (não mais usado)

## 📝 Notas Importantes

- Todas as configurações foram padronizadas para usar `/swagger-ui` em vez de `/swagger-ui.html`
- Os endpoints JSON (`/api-docs`) foram mantidos consistentes em todos os serviços
- As configurações são compatíveis com as versões atuais das dependências
- O script de teste pode ser usado para monitoramento contínuo

---

**Data da Correção:** $(date)  
**Responsável:** ConstrSW 2025-1  
**Status:** ✅ Concluído 