DROP TABLE IF EXISTS person;
 
CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL
);
 
INSERT INTO person (name, email) VALUES
  ('Santosh Raju', 'santosh@example.com'),
  ('Bill Gates', 'bill@example.com'),
  ('Luna Smith', 'luna@example.com');
  