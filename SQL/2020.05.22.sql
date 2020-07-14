
select * from customer where custid <= 2;

select cs.name, sum(saleprice)
from (
select * from customer where custid <= 2
) cs, orders od
where cs.custid = od.cusid
group by cs.name; 