CREATE TABLE IF NOT EXISTS Pizza (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    available BOOLEAN NOT NULL DEFAULT TRUE,
    flavor VARCHAR(50) NOT NULL,
    size VARCHAR(50) NOT NULL
);