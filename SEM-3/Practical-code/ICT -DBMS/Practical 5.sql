use hr;

-- Query 1 
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;

-- Query 2
SELECT e.department_id, COUNT(DISTINCT j.job_title) AS total_job_roles
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
GROUP BY e.department_id;

Select * from jobs;

-- Query 3
SELECT DISTINCT CONCAT(first_name, ' ', last_name) AS employee_name, salary
FROM employees
WHERE salary > 2000;

-- Query 4
SELECT COUNT(*) AS employee_count
FROM employees
WHERE hire_date > '1991-04-03';

-- Query 5
SELECT j.job_title, COUNT(*) AS employee_count
FROM employees e
JOIN jobs j ON e.job_id = j.job_id
GROUP BY j.job_title
ORDER BY employee_count DESC;

-- Query 6
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
HAVING employee_count > 3;

-- Query 7
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id;

-- Query 8
SELECT department_id, COUNT(*) AS employee_count
FROM employees
WHERE last_name LIKE '%n'
GROUP BY department_id;

-- Query 9
SELECT department_id, COUNT(*) AS employee_count
FROM employees
WHERE first_name LIKE '%a%' OR last_name LIKE '%a%'
GROUP BY department_id;

-- Query 10
SELECT department_id, COUNT(*) AS employee_count
FROM employees e1
WHERE salary > (
   SELECT AVG(salary)
   FROM employees e2
   WHERE e1.department_id = e2.department_id
)
GROUP BY department_id;

-- Query 11
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
HAVING employee_count > 2
ORDER BY department_id DESC;

-- Query 12
SELECT department_id, AVG(salary) AS average_salary
FROM employees
GROUP BY department_id;

-- Query 13
SELECT department_id, MAX(salary) AS max_salary
FROM employees
GROUP BY department_id;

-- Query 14
SELECT department_id, MIN(salary) AS min_salary
FROM employees
GROUP BY department_id;
