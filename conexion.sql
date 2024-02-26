CREATE DATABASE IF NOT EXISTS tienda;

USE tienda;

CREATE TABLE IF NOT EXISTS producto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(255),
    nombre VARCHAR(255),
    precio DOUBLE,
    cantidad INT
);


INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES
('COD001', 'Producto1', 19.99, 50),
('COD002', 'Producto2', 29.99, 30),
('COD003', 'Producto3', 39.99, 20),
('COD004', 'Producto4', 49.99, 15),
('COD005', 'Producto5', 59.99, 25),
('COD006', 'Producto6', 69.99, 10),
('COD007', 'Producto7', 79.99, 5),
('COD008', 'Producto8', 89.99, 40),
('COD009', 'Producto9', 99.99, 12),
('COD010', 'Producto10', 109.99, 8);

SELECT * FROM producto;

SELECT * FROM producto WHERE codigo = 'COD001';

SELECT * FROM producto WHERE precio < 50.0;

UPDATE producto SET precio = 49.99 WHERE codigo = 'COD001';

