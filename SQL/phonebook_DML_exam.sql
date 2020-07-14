-----------------------------------------------------------
-- 수정을 위한 SQL
-----------------------------------------------------------
--1. 회사 친구의 정보 변경
update phoneinfo_com set fr_c_company = 'naver' where idx =2;

--2. 학교 친구의 정보 변경 
update phoneinfo_univ set fr_u_major = 'hardware' where idx =2;

-----------------------------------------------------------
-- 삭제를 위한 sql
-----------------------------------------------------------
--1. 회사 친구 정보를 삭제
delete from phoneinfo_com where idx=1;

rollback;

--2. 학교 친구 정보를 삭제
delete from phoneinfo_univ where idx=1;

rollback;

-----------------------------------------------------------
-- VIEW 생성
-----------------------------------------------------------

-- 1. 전체 친구 목록 출력 : 테이블 3개 JOIN
select * 
from phoneinfo_basic pb, phoneinfo_univ pu, phoneinfo_com pc
where pb.idx=pu.fr_ref(+) and pb.idx=pc.fr_ref(+)
;

-- VIEW : pb_all_view
create view pb_all_view
as
select b.idx, b.fr_name, b.fr_phonenumber, b.fr_email, b.fr_address, b.fr_regdate, 
u.fr_u_major, u.fr_u_year, c.fr_c_company
from phoneinfo_basic b, phoneinfo_univ u, phoneinfo_com c
where b.idx = u.fr_ref(+) and b.idx = c.fr_ref(+);

select * from pb_all_view;
drop view pb_all_view;

-- 2. 학교 친구 목록 출력
select * from phoneinfo_basic pb, phoneinfo_univ pu
where pb.idx=pu.fr_ref
;

-- view : pb_univ_view
create view pb_univ_view
as
select *
from pb_all_view
where fr_u_major is not null;
--
create or replace view pb_univ_view 
(name, phonenumber, address, email, major, grade)
as
select b.fr_name, 
       b.fr_phonenumber, 
       b.fr_address, 
       b.fr_email,
       u.fr_u_major,
       u.fr_u_year
from phoneinfo_basic b, phoneinfo_univ u
where b.idx=u.fr_ref;

select * from pb_univ_view;
drop view pb_univ_view;

-- 3. 회사 친구 목록 출력
select * from phoneinfo_basic pb, phoneinfo_com pc
where pb.idx=pc.fr_ref
;

-- view : pb_com_view
create view pb_com_view
as
select *
from pb_all_view
where fr_c_company is not null;
--
create or replace view pb_com_view
(name, phonenumber, address, email, company)
as
select b.fr_name, 
       b.fr_phonenumber, 
       b.fr_address, 
       b.fr_email,
       c.fr_c_company
from phoneinfo_basic b, phoneinfo_com c
where b.idx=c.fr_ref;

select * from pb_com_view;
drop view pb_com_view;

