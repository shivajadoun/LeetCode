SELECT 
    d.name AS Department, 
    e.name AS Employee, 
    e.salary AS Salary
FROM (
    SELECT 
        e.*, 
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS ranking
    FROM Employee e
) e
JOIN Department d ON e.departmentId = d.id
WHERE ranking <= 3
ORDER BY d.name, e.salary DESC;
