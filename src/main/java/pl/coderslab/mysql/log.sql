CREATE TABLE if not exists users
(
    id       int(11) AUTO_INCREMENT,
    email    VARCHAR(255) NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60)  NOT NULL,
    PRIMARY KEY (id)

);
SET GLOBAL time_zone = '+2:00';






