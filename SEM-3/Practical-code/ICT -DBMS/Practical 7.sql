-- Practical 7
create database dbprac7;
use dbprac7;

-- Creating two tables
CREATE TABLE Employee (
    eid INT PRIMARY KEY,
    ename VARCHAR(50),
    address VARCHAR(50),
    dept VARCHAR(10),
    salary INT
);


CREATE TABLE Project (
    eid INT,
    pid VARCHAR(10) PRIMARY KEY,
    pname VARCHAR(50),
    location VARCHAR(50),
    FOREIGN KEY (eid) REFERENCES Employee(eid)
);

-- Inserting Rows

INSERT INTO Employee (eid, ename, address, dept, salary) VALUES 
(1, 'Ram', 'chd', 'HR', 10000),
(2, 'Amit', 'delhi', 'MRKT', 20000),
(3, 'Ravi', 'pune', 'HR', 30000),
(4, 'Nitin', 'bang', 'MRKT', 40000),
(5, 'Varun', 'chd', 'IT', 50000);


INSERT INTO Project (eid, pid, pname, location) VALUES 
(1, 'P1', 'IOT', 'bang'),
(5, 'P2', 'BIG Data', 'delhi'),
(3, 'P3', 'Retail', 'mumbai'),
(4, 'P4', 'Android', 'hyderabad');

select * from Employee;
select * from Project;

-- Query 1
-- Display the maximum salary from the employee table.
SELECT MAX(salary) AS max_salary FROM Employee;

-- Query 2
-- Display the employee name who is taking the maximum salary.
SELECT ename FROM Employee WHERE salary = (SELECT MAX(salary) FROM Employee);

-- Query 3
-- Display the second highest salary from the employee table.
SELECT MAX(salary) AS second_highest_salary 
FROM Employee 
WHERE salary < (SELECT MAX(salary) FROM Employee);

-- Query 4
-- Display the employee name who is taking the second highest salary.
SELECT ename FROM Employee 
WHERE salary = (
    SELECT MAX(salary) FROM Employee 
    WHERE salary < (SELECT MAX(salary) FROM Employee)
);

-- Query 5
-- Display all department names along with the number of employees working in each.
SELECT dept, COUNT(eid) AS no_of_employees FROM Employee GROUP BY dept;

-- Query 6
-- Display all employee names where the number of employees in their department is less than 2.
SELECT * FROM Employee 
WHERE dept IN (
    SELECT dept FROM Employee 
    GROUP BY dept 
    HAVING COUNT(eid) < 2
);

-- Query 7
-- Display the name of the employee who works in a department having a count of employees less than 2.
SELECT ename FROM Employee 
WHERE dept IN (
    SELECT dept FROM Employee 
    GROUP BY dept 
    HAVING COUNT(eid) < 2
);

-- Query 8
-- Display the highest salary department-wise and the name of the employee who is taking that salary.
SELECT dept, ename, salary FROM Employee e 
WHERE salary = (
    SELECT MAX(salary) FROM Employee WHERE dept = e.dept
);

-- Query 9
-- Find the names of employees who are working on a project.
SELECT ename FROM Employee 
WHERE eid IN (SELECT eid FROM Project);

-- Query 10
-- Find the details of employees who are working on at least one project.
SELECT * FROM Employee 
WHERE eid IN (SELECT eid FROM Project);
