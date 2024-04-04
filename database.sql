CREATE DATABASE prj301;
GO
USE prj301;
GO
DROP TABLE student
CREATE TABLE student (
    id INT PRIMARY KEY IDENTITY(1,1),
    firstname VARCHAR(100),
    lastname VARCHAR(100),
    age INT
);
GO
INSERT INTO student (id, firstname, lastname, age) VALUES
(0, 'John', 'Doe', 20),
(2, 'John', 'Smith', 22),
(3, 'Alex', 'Johnson', 21),
(4, 'Emily', 'Williams', 19),
(5, 'Michael', 'Brown', 23);
GO

INSERT INTO student (firstname, lastname, age) VALUES
('John', 'Doe', 20)

SELECT * FROM student
GO
CREATE TABLE users (
    username VARCHAR(100) PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(30)
    
);

SELECT * FROM users

INSERT users (username, password, name) VALUES
('dung','dung','Huynh Dung');

INSERT users (username, password, name) VALUES
('nam','nam','Nguyen Nam');