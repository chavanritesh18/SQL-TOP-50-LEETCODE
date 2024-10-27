# Write your MySQL query statement below

-- select tweet_id 
-- from tweets
-- where length(content) > 15;

-- USING CHAR_LENGTH METHOD

select tweet_id 
from tweets
where char_length(content) > 15;