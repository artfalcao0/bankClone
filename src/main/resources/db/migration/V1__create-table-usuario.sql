CREATE TABLE IF NOT EXISTS usuarios  (
    id UUID PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    email TEXT NOT NULL,
    genero TEXT NOT NULL,
    dt_nasc DATE NOT NULL,
    criado_em TIMESTAMP NOT NULL,
    atualizado_em TIMESTAMP,
    deletado_em TIMESTAMP
);