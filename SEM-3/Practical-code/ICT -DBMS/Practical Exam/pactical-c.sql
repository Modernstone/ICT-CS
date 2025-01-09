CREATE database pracexam_c;
use pracexam_c;

CREATE TABLE Genre (
    genreId INT PRIMARY KEY NOT NULL,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Album (
    albumId INT PRIMARY KEY NOT NULL,
    title VARCHAR(255) NOT NULL
);


CREATE TABLE Track (
    trackId INT PRIMARY KEY NOT NULL,
    Name VARCHAR(255) NOT NULL,
	albumId INT,
    genreId INT,
	composter VARCHAR(255),
    unitprice DECIMAL NOT NULL,
    length INT CHECK (length > 0),
    FOREIGN KEY (genreId) REFERENCES Genre(genreId),
    FOREIGN KEY (albumId) REFERENCES Album(albumId)
);

-- Insert sample data into Genre table
INSERT INTO Genre (genreId, name) VALUES
(1, 'Rock'),
(2, 'Jazz'),
(3, 'Metal'),
(4, 'alternative & Punk');

INSERT INTO Album (albumid, title) VALUES
(1, 'For Those About to Rock We Salute You'),
(4, 'Let There Be Rock'),
(9, 'lays Metallica By four Cellos'),
(12, 'BlackBeat Soundtrack');

INSERT INTO Track (trackId, Name, albumId, genreId, composter, unitprice)
VALUES 
(8, 'Inject The Venom', 1, 1, 'Angus Young, Malcolm Young, Brian Johnson', 0.99),
(19, 'Problem Child', 4, 2, 'AC DC', 0.76),
(81, 'Sad But True', 9, 3, 'Apocalyptica', 0.43),
(120, 'N Carol', 12, 4, 'Chuck Berry', 0.89);

select * from Track;

ALTER TABLE Album RENAME TO vishva_album;

SELECT *
FROM Track
WHERE unitprice > 0.8
ORDER BY name ASC;

-- Create the audit_track table
CREATE TABLE audit_track (
    trackId INT,
    Name VARCHAR(255),
    albumId INT,
    genreId INT,
    composter VARCHAR(255),
    unitprice DECIMAL,
    length INT,
    deleted_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- Create the trigger "vishva"
DELIMITER //

CREATE TRIGGER vishva
AFTER DELETE ON Track
FOR EACH ROW
BEGIN
    INSERT INTO audit_track (trackId, Name, albumId, genreId, composter, unitprice, length, deleted_at)
    VALUES (OLD.trackId, OLD.Name, OLD.albumId, OLD.genreId, OLD.composter, OLD.unitprice, OLD.length, NOW());
END;
//

DELIMITER ;
