# Write your MySQL query statement below
select  d1.name as Department,e1.name as Employee, e1.salary as Salary 
from Employee e1  left join Department d1 on e1.departmentId=d1.id
where e1.salary=(select max(e2.salary)from Employee e2 where e1.departmentId=e2.departmentId); 