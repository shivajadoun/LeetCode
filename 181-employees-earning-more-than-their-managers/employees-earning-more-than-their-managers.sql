# Write your MySQL query statement below

select a2.name as Employee  from Employee a2 
  join Employee a1 on 
a1.id=a2.managerId
where a1.salary<a2.salary;