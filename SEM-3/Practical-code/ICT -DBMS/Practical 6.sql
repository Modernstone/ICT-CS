-- Practical 6
use db2cse001;

-- Sub Query 1
select Product_no,Description from product_master where Product_no in 
(select Product_no from sales_order_details where Qty_disp = 0);

-- Sub Query 2
select Name,City,Pincode from Client_master where Client_no in
(select Client_no from sales_order where Order_no = 'O1901');

-- Sub Query 3
select Client_no,Name from Client_master where Client_no in
(select Client_no from sales_order where Order_no in
(select Order_no from sales_order_details where Product_no in
(select Product_no from product_master where Description = 'Mouse')));

-- Having and Group By Query 1
select Description,sum(Qty_disp) as Total_Qty from product_master P,
sales_order_details S where P.Product_no = S.Product_no group by Description;

-- Having and Group By Query 2
select Description,sum(Qty_disp*Product_rate) as Total_Value from product_master P,
sales_order_details S where P.Product_no = S.Product_no group by Description;

-- Having and Group By Query 3
select S.Order_no,Order_date, sum(Qty_ordered*Product_rate) as Total_amount from
sales_order_details SD,sales_order S where 
S.Order_no = SD.Order_no and
Billed_yn = 'Y' and month(Order_date) = 1 group by S.Order_no;

-- Joins Query 1
select P.Product_no, Description 
from client_master as C,
product_master P, sales_order_details SD,sales_order S
where C.Client_no = S.Client_no
and S.Order_no = SD.Order_no
and SD.Product_no = P.Product_no
and Name = 'Ivan';

-- Joins Query 2
select distinct P.Product_no, Description
from product_master P, sales_order_details SD,
sales_order as S where P.Product_no = SD.Product_no
and SD.Order_no = S.Order_no
group by P.Product_no, Description;

-- Joins Query 3
select distinct S.client_no, C.Name from sales_order_details SD,
sales_order S, product_master P, client_Master C
where P.product_no = SD.product_no
and S.order_no = SD.order_no
and C.client_no = S.client_no
and Description = 'Cd Drive';

-- Joins Query 4
select P.Product_no, S.Order_no from
product_master as P, sales_order as S,
sales_order_details as SD where SD.Qty_ordered < 4
and Description = "Mouse"
and S.Order_no = SD.Order_no
and SD.Product_no = P.Product_no;

-- Constructing Sentences Query 1
select CONCAT(Description, " Worth Rs. ", Qty_disp * Product_rate, " was sold") as Description
from product_master P, sales_order_details SD where P.Product_no = SD.Product_no;



