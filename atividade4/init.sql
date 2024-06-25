CREATE TABLE IF NOT EXISTS Books (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100),
    autor VARCHAR(100) UNIQUE ,
    quantPaginas Int
);