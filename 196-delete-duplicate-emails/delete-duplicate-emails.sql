# Write your MySQL query statement below
delete a1 from person a1  join Person a2 
   where a1.email=a2.email and a1.id>a2.id;