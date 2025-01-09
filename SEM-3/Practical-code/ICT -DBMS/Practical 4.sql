-- Practical 4
use db2cse001;

-- Query1
create table client_master 
(client_no varchar(6) Primary Key Check (client_no like 'C%'), 
Name varchar(15) Not Null,
City varchar (15), Pincode Numeric (8),
State varchar (15), Bal_due numeric (10,2));

describe client_master;

INSERT INTO Client_master VALUES("C001", "Ivan" ,"Bombay" ,400054 ,"Maharashtra" ,15000);
INSERT INTO Client_master VALUES("C002", "Vandana" ,"Madras" ,780001 ,"Tamil Nadu" ,0);
INSERT INTO Client_master VALUES("C003", "Pramada" ,"Bombay" ,400057 ,"Maharashtra" ,5000);
INSERT INTO Client_master VALUES("C004", "Basu" ,"Bombay" ,400056 ,"Maharashtra" ,0);
INSERT INTO Client_master VALUES("C005", "Ravi" ,"Delhi" ,100001 ,"Gujarat" ,2000);
INSERT INTO Client_master VALUES("CC005", "Rukmani" ,"Bombay" ,400050 ,"Maharashtra" ,0);

select * from client_master;

-- Query 2
CREATE TABLE product_master(Product_no VARCHAR(6) Primary Key Check (Product_no like 'P%'),
Description VARCHAR(15)Not null,
P_percent NUMERIC(4,2)Not null, 
U_measure VARCHAR(10)Not null,
Qty_on_hand NUMERIC(8)Not null,
Reorder_lvl NUMERIC(8)Not null, 
Sell_price NUMERIC(8,2)Not null CHECK (Sell_price >0),
Cost_price NUMERIC(8,2)Not null CHECK (Cost_price >0));

describe product_master;

INSERT INTO Product_master VALUES("P001", "Floppies",5,"Piece",100,20,525,500);
INSERT INTO Product_master VALUES("P002", "Monitor",6,"Piece",10 ,3,12000,11280);
INSERT INTO Product_master VALUES("P003", "Mouse",5,"Piece",20 ,5,1050,1000);
INSERT INTO Product_master VALUES("P004", "Floppies", 5,"Piece",100 ,20,525,500);
INSERT INTO Product_master VALUES("P005", "Keyboards",2,"Piece",10 ,3,3150,30500);
INSERT INTO Product_master VALUES("P006", "Cd Drive" ,2.5,"Piece",10,3,5250,5100);
INSERT INTO Product_master VALUES("P007", "1.44 Drive",4,"Piece",10,3,8400,8000);

select * from product_master;

-- Query 3
CREATE TABLE salesman_master(S_no Varchar(6)PRIMARY key CHECK (S_no LIKE 'S%') ,
S_name Varchar(20) NOT null,
City Varchar (20),
Pincode Numeric (8),
State Varchar (20), 
Sal_amt Numeric (8,2)NOT null CHECK (Sal_amt > 0),
Tgt_to_get Numeric (6,2)NOT null CHECK (Tgt_to_get > 0),
Ytd_sales Numeric (6,2)NOT null,
remarks Varchar (12));

describe Salesman_master;

INSERT INTO Salesman_master VALUES("S001", "Kiran" ,"Bobay",400002,"Maharastra",3000,100,500,"Excellent");
INSERT INTO Salesman_master VALUES("S002", "Manish" ,"Bobay",400001,"Maharastra",3000,200,100,"Good");
INSERT INTO Salesman_master VALUES("S003", "Ravi" ,"Bobay",400032,"Maharastra",3000,200,100,"Averege");
INSERT INTO Salesman_master VALUES("S004", "Ashish" ,"Bobay",400044,"Maharastra",3500,200,100,"Good");

select * from Salesman_master;

-- Query 4

create table sales_order (Order_no varchar(6) primary key check (Order_no like 'O%'), 
Order_date date, 
Client_no varchar(6), 
S_no varchar(6), 
Dely_type char(1) default 'F' check (Dely_type IN ('P','F')), 
Billed_yn char(1), 
Dely_date date, 
Order_status varchar(10) check (Order_status IN ('inprocess','fullfilled','backorder','cancelled')), 
CONSTRAINT k1 FOREIGN KEY(Client_no) REFERENCES client_master(client_no), 
CONSTRAINT k2 FOREIGN KEY(S_no) REFERENCES salesman_master(S_no));

describe sales_order;

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O1901','2015-06-12','C001','S001','F','N','2015-06-20','InProcess');

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O1902','2015-01-25','C002','S002','P','N','2015-06-27','Cancelled');

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O4665','2015-02-18','C003','S003','F','Y','2015-02-20','Fullfilled');

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O1903','2015-04-03','C001','S001','F','Y','2015-04-07','Fullfilled');

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O4666','2015-05-20','C004','S002','P','N','2015-06-22','Cancelled');

INSERT INTO `sales_order`(`Order_no`, `Order_date`, `Client_no`, `S_no`, `Dely_type`, `Billed_yn`, `Dely_date`, `Order_status`) VALUES ('O1908','2015-05-24','C005','S003','F','N','2015-05-26','InProcess');

select * from sales_order;

-- Query 5

create table sales_order_details (Order_no varchar(6),
Product_no varchar(6),
Qty_ordered int(8),
Qty_disp int(8),
Product_rate float(10,2),
Constraint FK_OrderNo Foreign Key (Order_no) References sales_order(Order_no),
Constraint FK_ProductNo Foreign Key (Product_no) References product_master(Product_no));

describe sales_order_details;

insert into sales_order_details values ('O1901','P001',4,4,525),
('O1901','P002',2,1,8400), ('O1901','P003',2,1,5250), 
('O1902','P001',10,0,525), ('O4665','P002',3,3,3150), 
('O4665','P004',3,1,5250), ('O4665','P005',10,10,525), 
('O4665','P003',4,4,1050), ('O1903','P006',2,2,1050), 
('O1903','P004',1,1,12000), ('O1908','P005',1,0,8400), 
('O1908','P007',10,0,1050);

select * from sales_order_details;

-- drop table client_master;
-- drop table product_master;
-- drop table Salesman_master;
-- drop table sales_order;
-- drop table sales_order_details;
