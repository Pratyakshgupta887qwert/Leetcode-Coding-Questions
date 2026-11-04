# Write your MySQL query statement below
select Unique_id ,name from Employees left join EmployeeUNI on Employees.id = EmployeeUNI.id;