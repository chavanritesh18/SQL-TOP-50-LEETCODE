# Write your MySQL query statement below

SELECT firstName , lastName , city , state
FROM Person as p LEFT JOIN Address as a on p.personID = a.personID