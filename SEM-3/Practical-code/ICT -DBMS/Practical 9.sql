-- Practical 9
use sakila;

-- Query 1
SELECT
CONCAT(
'Hi, Your Name is ',
'jagir shastri ',
'and your Enrollment Number is ',
'19162171014.'
) AS ‘Line’;

CALL name();

-- Query 2
SELECT
CONCAT(a.first_name, " ", a.last_name)AS `Full_Name`
    FROM actor a ;

Call fullname();

-- Query 3
SELECT *
    FROM
        film ;
 
CALL Details();

-- Query 4
SELECT *
    FROM
        film where title like('AC%');
Call id();

-- Query 5
SELECT title FROM film,category,film_category WHERE category.category_id = ID AND category.category_id=film_category.category_id AND film_category.film_id=film.film_id;
CALL d_films(2);

-- Query 6
SELECT title FROM film,film_category,category 
WHERE ategory.category_id=film_category.category_id AND film.film_id=film_category.film_id 
AND category.name=cname; 
CALL c_name('Horror');

-- Query 7
CREATE VIEW rent_rate AS
SELECT * FROM film
WHERE film.rent_rate > 1 
AND film.rent_rate <= 3.99;
SELECT * FROM rent_rate;

-- Query 8
SELECT concat
(actor.first_name,'',actor.last_name)as fullname FROM actor
WHERE actor.actor_id > 5 AND actor.actor_id< 50;
 
call full_name();

-- Query 9
SELECT `category_id`,count(`film_id`) FROM film_category
WHERE `category_id`=a;
 
CALL film_count(8);

-- Query 10
select country.country, count(`city`) FROM city,country
    WHERE country.country_id=city.country_id
    GROUP BY country
    HAVING COUNT(`city`)>a;
 
call Country_count(4);

-- Query 11
SELECT COUNT(*) FROM customer WHERE active = stat; 

CALL total_customer(1);

-- Query 12
UPDATE actor SET actor.first_name=fn, 
actor.last_name=ln 
WHERE actor.actor_id=ID; 
SELECT * FROM actor WHERE actor.actor_id = id; 

CALL u_name("jagir","shastri",1);

-- Query 13
SELECT film.rental_duration FROM film WHERE film.film_id=ID; 

CALL r_duration(19);