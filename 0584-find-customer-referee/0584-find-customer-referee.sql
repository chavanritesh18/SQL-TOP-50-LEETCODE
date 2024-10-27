# Write your MySQL query statement below


-- SELECT name 

-- FROM customer

-- WHERE  referee_id  != 2 OR referee_id IS NULL;


-- ANOTHER METHOD

-- select name
-- from customer
-- where IFNULL(referee_id , -1) != 2;

-- ANOTHER METHOD

select name 
from customer 
where coalesce(referee_id , -1) != 2;