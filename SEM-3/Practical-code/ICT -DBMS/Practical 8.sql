-- Practical 8
use sakila;

-- Calling table
select * from actor;

-- Calling View
select * from actor_info;

-- Query 1
CREATE VIEW actor_name AS SELECT `first_name` FROM actor WHERE `first_name` LIKE"A%";

-- Query 2
CREATE VIEW actor2 AS SELECT * FROM actor ORDER BY actor.last_name DESC;

-- Query 3
DROP VIEW actor_name;

-- Query 4
CREATE VIEW language1 AS SELECT * FROM language;

-- Query 5
INSERT INTO language1 VALUES (7,'Hindi','2013-07-05 12:23:05');

-- Query 6
UPDATE language1  SET `name` = 'Spanish' WHERE `language_id` =7;

-- Query 7
DELETE FROM language1 WHERE `language_id`=7;

-- Query 8
CREATE VIEW language2 AS SELECT * FROM language WHERE last_update = '2006-02-15 05:02:19';

-- Query 9
INSERT INTO language2 VALUES(7,'Hindi','2020-07-13 10:00:19');

-- Query 10
INSERT INTO language2 VALUES (8,'Hindi','2006-02-15 05:02:19');

-- Query 11
UPDATE language2 SET last_update = '2020-07-13 10:00:19' WHERE `language_id`=8;

