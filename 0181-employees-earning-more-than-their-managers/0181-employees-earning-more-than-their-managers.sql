# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee r on e.managerid=r.id where e.salary>r.salary;