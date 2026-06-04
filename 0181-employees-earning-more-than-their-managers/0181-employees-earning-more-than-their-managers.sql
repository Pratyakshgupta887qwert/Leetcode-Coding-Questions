# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee r on e.managerId=r.Id where e.salary>r.salary;