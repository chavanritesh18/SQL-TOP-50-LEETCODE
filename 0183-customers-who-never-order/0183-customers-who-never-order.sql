# Write your MySQL query statement below

SELECT name AS
"Customers"
FROM customers c
LEFT JOIN orders o
on c.id  = o.customerID
WHERE o.customerID IS NULL;