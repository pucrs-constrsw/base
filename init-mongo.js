// Script de inicialização do MongoDB
// Cria databases para cada serviço usando o usuário admin existente

// Para o serviço classes
db = db.getSiblingDB('classes');
// Cria uma coleção para garantir que o database seja criado
db.createCollection('classes');

// Para o serviço courses
db = db.getSiblingDB('courses');
db.createCollection('courses');

// Para o serviço lessons
db = db.getSiblingDB('lessons');
db.createCollection('lessons');

// Para o serviço professors
db = db.getSiblingDB('professors');
db.createCollection('professors');
