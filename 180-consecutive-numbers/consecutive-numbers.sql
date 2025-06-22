# Write your MySQL query statement below
select distinct a1.num as ConsecutiveNums  from Logs a1,Logs a2,Logs a3 
  where     a1.id=a2.id-1
    and   a1.id=a3.id-2
     and  a1.num=a2.num
     and  a1.num=a3.num;