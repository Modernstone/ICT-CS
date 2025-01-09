-- Practical 10
use sakila;



-- Query 1
DELIMITER //
CREATE TRIGGER Upper_name
BEFORE INSERT ON language
FOR EACH ROW
BEGIN
	set new.name = upper(new.name);
END
//
DELIMITER ;

INSERT INTO language VALUES (9,'Korean',CURRENT_TIMESTAMP);

SELECT * FROM language;





-- Query 3
CREATE TABLE audit_language_update (
    language_id TINYINT(3),
    name CHAR(20),
    last_update TIMESTAMP,
    log CHAR(20)
);

DELIMITER //
CREATE TRIGGER LANUPDATE
BEFORE UPDATE ON language
FOR EACH ROW
BEGIN
	INSERT INTO audit_language_update VALUES (old.language_id,old.name,old.last_update,"Before Update");
    INSERT INTO audit_language_update VALUES (new.language_id,new.name,new.last_update,"After Update");
END
//
DELIMITER ;

UPDATE language
SET name = 'gujarati'
WHERE language_id = 09;

SELECT * FROM audit_language_update;





-- Query 4
CREATE TABLE language_before_delete (
    language_id TINYINT(3),
    name CHAR(20),
    last_update TIMESTAMP,
    log CHAR(20)
);

DELIMITER //
CREATE TRIGGER LANBEFDEL
BEFORE DELETE ON language
FOR EACH ROW
BEGIN
	INSERT INTO language_before_delete VALUES (old.language_id,old.name,old.last_update,"Before Delete");
END
//
DELIMITER ;

DELETE FROM language
WHERE language_id = 9;

SELECT * FROM language_before_delete;





-- Query 5
CREATE TABLE language_after_delete (
    language_id TINYINT(3),
    name CHAR(20),
    log CHAR(200)
);

DELIMITER //
CREATE TRIGGER LANAFTDEL
BEFORE DELETE ON language
FOR EACH ROW
BEGIN
	INSERT INTO language_after_delete VALUES (
		old.language_id,old.name,
		CONCAT(
			"LANGUAGE ",old.name,
			" WITH ID ",old.language_id,
			" WAS DELETED ON ",CURRENT_TIMESTAMP
		)
	);
END
//
DELIMITER ;

DELETE FROM language
WHERE language_id = 5;

SELECT * FROM language_after_delete;




-- Query 6
SHOW TRIGGERS;