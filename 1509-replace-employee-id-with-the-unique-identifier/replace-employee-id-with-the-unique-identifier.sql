# Write your MySQL query statement below
select eu.unique_id,E.name from Employees E left Join EmployeeUNI eu
on E.id=eu.id ;