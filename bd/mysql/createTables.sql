DROP DATABASE IF EXISTS app;

CREATE DATABASE app;
SET @@session.foreign_key_checks = 0;
use app;

CREATE TABLE login (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    PRIMARY KEY (id)
)ENGINE=InnoDB;
