# SonarQube - Análise de Qualidade de Código

## Visão Geral

O SonarQube é uma plataforma de análise estática de código que ajuda a manter a qualidade do código através da identificação de bugs, vulnerabilidades, code smells e cobertura de testes.

## Configuração

### Pré-requisitos

1. Docker e Docker Compose instalados
2. PostgreSQL rodando (já configurado no projeto)
3. Volumes externos criados

### Setup Inicial

Execute o script de configuração:

```powershell
.\setup-sonarqube.ps1
```

Ou manualmente:

```bash
# Criar volumes
docker volume create constrsw-sonarqube-data
docker volume create constrsw-sonarqube-extensions
docker volume create constrsw-sonarqube-logs

# Criar banco de dados sonar
docker-compose exec postgresql psql -U postgres -c "CREATE DATABASE sonar;"
```

### Iniciar o SonarQube

```bash
docker-compose up -d sonarqube
```

## Acesso

- **URL**: http://localhost:9000
- **Credenciais padrão**: admin/admin
- **Primeiro acesso**: Será solicitado para alterar a senha

## Configuração do Banco de Dados

O SonarQube está configurado para usar o PostgreSQL:

- **Host**: postgresql (container interno)
- **Porta**: 5432
- **Database**: sonar
- **Usuário**: postgres
- **Senha**: definida no .env

## Análise de Projetos

### Para projetos Java/Spring Boot

1. Instale o SonarQube Scanner:
```bash
# Windows
# Baixe de: https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/

# Linux/Mac
wget https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/sonar-scanner-cli-4.8.0.2856-linux.zip
unzip sonar-scanner-cli-4.8.0.2856-linux.zip
```

2. Configure o sonar-project.properties no projeto:
```properties
sonar.projectKey=constrsw-classes
sonar.projectName=ConstrSW Classes Service
sonar.projectVersion=1.0
sonar.sources=src/main/java
sonar.tests=src/test/java
sonar.java.binaries=target/classes
sonar.java.test.binaries=target/test-classes
sonar.host.url=http://localhost:9000
sonar.login=seu-token-aqui
```

3. Execute a análise:
```bash
sonar-scanner
```

### Para projetos Node.js

1. Instale o SonarQube Scanner para Node.js:
```bash
npm install -g sonarqube-scanner
```

2. Configure o sonar-project.js:
```javascript
const sonarqubeScanner = require('sonarqube-scanner');

sonarqubeScanner({
  serverUrl: 'http://localhost:9000',
  token: 'seu-token-aqui',
  options: {
    'sonar.projectKey': 'constrsw-oauth',
    'sonar.projectName': 'ConstrSW OAuth Service',
    'sonar.projectVersion': '1.0',
    'sonar.sources': 'src',
    'sonar.tests': 'test',
    'sonar.javascript.lcov.reportPaths': 'coverage/lcov.info',
    'sonar.testExecutionReportPaths': 'test-report.xml'
  }
});
```

3. Execute a análise:
```bash
node sonar-project.js
```

### Para projetos Python

1. Instale o SonarQube Scanner:
```bash
pip install sonarqube-scanner
```

2. Configure o sonar-project.properties:
```properties
sonar.projectKey=constrsw-lessons
sonar.projectName=ConstrSW Lessons Service
sonar.projectVersion=1.0
sonar.sources=.
sonar.python.version=3.9
sonar.host.url=http://localhost:9000
sonar.login=seu-token-aqui
```

3. Execute a análise:
```bash
sonar-scanner
```

## Integração com CI/CD

### GitHub Actions

```yaml
name: SonarQube Analysis
on: [push, pull_request]

jobs:
  sonarqube:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v3
      with:
        fetch-depth: 0
    
    - name: SonarQube Scan
      uses: sonarqube-quality-gate-action@master
      env:
        SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        SONAR_HOST_URL: ${{ secrets.SONAR_HOST_URL }}
      with:
        scannerHome: ${{ github.workspace }}/.sonar/scanner
        args: >
          -Dsonar.projectKey=constrsw-project
          -Dsonar.sources=.
          -Dsonar.host.url=${{ secrets.SONAR_HOST_URL }}
          -Dsonar.login=${{ secrets.SONAR_TOKEN }}
```

## Métricas Importantes

### Qualidade do Código
- **Bugs**: Problemas que podem causar falhas
- **Vulnerabilidades**: Problemas de segurança
- **Code Smells**: Problemas de manutenibilidade
- **Technical Debt**: Tempo estimado para corrigir problemas

### Cobertura
- **Cobertura de Linhas**: % de linhas executadas pelos testes
- **Cobertura de Branches**: % de branches executados pelos testes

### Duplicação
- **Duplicated Lines**: Linhas de código duplicadas
- **Duplicated Blocks**: Blocos de código duplicados

## Troubleshooting

### Problemas Comuns

1. **SonarQube não inicia**
   - Verifique se o PostgreSQL está rodando
   - Verifique se o banco 'sonar' foi criado
   - Verifique os logs: `docker-compose logs sonarqube`

2. **Erro de memória**
   - Aumente a memória do Docker
   - Configure variáveis de ambiente para limitar uso de memória

3. **Scanner não encontra o servidor**
   - Verifique se a URL está correta
   - Verifique se o token está válido
   - Verifique se o projeto já existe no SonarQube

### Logs

```bash
# Ver logs do SonarQube
docker-compose logs sonarqube

# Ver logs em tempo real
docker-compose logs -f sonarqube
```

## Recursos Adicionais

- [Documentação Oficial](https://docs.sonarqube.org/)
- [Regras de Qualidade](https://rules.sonarsource.com/)
- [Plugins Disponíveis](https://docs.sonarqube.org/latest/setup/install-plugin/)
- [API REST](https://docs.sonarqube.org/latest/extend/web-api/)

## Configuração Avançada

### Plugins Recomendados

- **SonarJava**: Análise avançada para Java
- **SonarJS**: Análise para JavaScript/TypeScript
- **SonarPython**: Análise para Python
- **SonarC#**: Análise para C#
- **SonarGo**: Análise para Go

### Configuração de Qualidade Gates

Configure regras de qualidade no SonarQube:

1. Acesse: Administration > Quality Gates
2. Configure critérios como:
   - Coverage > 80%
   - Duplicated Lines < 3%
   - Bugs = 0
   - Vulnerabilities = 0

### Backup e Restore

```bash
# Backup
docker-compose exec sonarqube tar -czf /opt/sonarqube/data/backup.tar.gz /opt/sonarqube/data

# Restore
docker-compose exec sonarqube tar -xzf /opt/sonarqube/data/backup.tar.gz -C /
``` 