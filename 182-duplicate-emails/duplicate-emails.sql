# Write your MySQL query statement below
select  distinct email from Person where email in(select email from Person group by email having  count(*)>1); 


