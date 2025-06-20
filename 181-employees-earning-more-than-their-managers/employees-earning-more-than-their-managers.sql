# Write your MySQL query statement below

select a2.name as Employee
from Employee a1 join Employee a2
on a1.id=a2.managerID
where a1.salary <a2.salary;