CREATE TABLE IF NOT EXISTS Person (
    taxCode VARCHAR(255) PRIMARY KEY,
    firstName VARCHAR(64),
    lastName VARCHAR(64),
    age INTEGER
);
INSERT INTO Person
VALUES ('abcdf', 'Emanuele', 'Conte', 24);

SELECT *
FROM Person
WHERE age < 18;

SELECT *
FROM Person
WHERE firstName = 'Pippo';

SELECT Count(*)
FROM Person
WHERE age > 30;

SELECT age,
    COUNT (*) AS 'num'
FROM Person
GROUP BY age;