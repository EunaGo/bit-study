--------------------------------------------------------------------
-- CREATE TABLE
--------------------------------------------------------------------
create table phoneInfo_basic
(idx number(6),
fr_name varchar2(20) not null,
fr_phonenumber varchar2(20) not null,
fr_email varchar2(20),
fr_address varchar2(20),
fr_regdate date default sysdate,
primary key(idx));                  
-- primary key는 not null, unique 속성을 가지고 있음

-- test
insert into phoneInfo_basic values(123456,'goeuna','010-9389-8415','abc@gmail','성산동','');
select * from phoneInfo_basic; 


-- phoneInfo_univ
create table phoneInfo_univ(
idx number(6),
fr_u_major varchar2(20) default 'n' not null,
fr_u_year number(1) default 1 not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx),
constraint year_heck check(fr_u_year>0 and fr_u_year<5));

-- test
select * from phoneInfo_univ;


-- phoneInfo_com
create table phoneInfo_com(
idx number(6),
fr_c_company varchar2(10) default 'n' not null,
fr_c_dept varchar2(10) default 'n' not null,
fr_c_job varchar2(10)  default 'n' not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx));

-- phoneInfo_cafe
create table phoneInfo_cafe(
idx number(6),
fr_c_cafe varchar2(10) default 'n' not null,
fr_c_nick varchar2(10) default 'n' not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx));


--------------------------------------------------------------------
-- DROP TABLE
--------------------------------------------------------------------
drop table phoneInfo_basic;
drop table phoneInfo_com;
drop table phoneInfo_univ;
drop table phoneInfo_cafe;

--------------------------------------------------------------------
-- CREATE & DROP SEQUENCE 
--------------------------------------------------------------------
create sequence seq
increment by 1 
start with 0
minvalue 0
maxvalue 100;

drop sequence seq;

-----------------------------------------------------------------
-- 정보 입력 SQL 작성
-----------------------------------------------------------------

desc phoneInfo_basic;
desc phoneInfo_univ;
desc phoneInfo_com;

--------------------------------------------------------------------
-- INSERT : phoneInfo_basic
--------------------------------------------------------------------
insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(seq.nextval,'SCOTT','010-0000-1111','scott@gamil.com','USA',sysdate);

insert into phoneInfo_basic 
values(seq.nextval,'APRIL','010-2356-1111','april@gamil.com','INDIA',sysdate);

insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(seq.nextval,'JAIN','010-0000-1231','jon@gamil.com','JAPAN',sysdate);

insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(seq.nextval,'ALEX','010-7894-1111','alex@gamil.com','CANADA',sysdate);

insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(seq.nextval,'KIM','010-7777-1155','kim@gamil.com','KOREA',sysdate);


--------------------------------------------------------------------
-- DELETE
--------------------------------------------------------------------
delete from phoneInfo_basic where idx=3;



--------------------------------------------------------------------
-- INSERT : phoneInfo_univ
--------------------------------------------------------------------
insert into phoneInfo_univ values (0,'SOFTWARE',3,1); 

insert into phoneInfo_univ(idx,fr_u_major,fr_ref) values (1,'ART',3);

select * from phoneInfo_univ;


--------------------------------------------------------------------
-- INSERT : phoneInfo_com
--------------------------------------------------------------------
insert into phoneInfo_com values(0,'NAVER','OPERATIONS','CLERK',2);

insert into phoneInfo_com(idx,fr_c_company,fr_ref) values(1,'GOOGLE',4);

select * from phoneInfo_com;

--------------------------------------------------------------------
-- INSERT : phoneInfo_cafe
--------------------------------------------------------------------
insert into phoneInfo_cafe values(0,'COOKING','KIMCOOK',5);


------------------------------------------------------------------------
-- 정보 출력 질의 
------------------------------------------------------------------------

-- phoneInfo_basic 출력
select * from phoneInfo_basic;

-- phoneInfo_univ 출력
select * from phoneInfo_univ;

select * 
from phoneInfo_basic b, phoneInfo_univ u
where b.idx = u.fr_ref(+)
order by b.idx;

-- phoneInfo_com 출력
select * from phoneInfo_com;

select * 
from phoneInfo_basic b, phoneInfo_com c
where b.idx = c.fr_ref(+)
order by b.idx;

-- 전체 출력 >> 3개의 테이블 JOIN하기 : OUTER 조인
select *
from phoneInfo_basic basic, phoneInfo_univ univ, phoneInfo_com com, phoneInfo_cafe cafe
where basic.idx = univ.fr_ref(+) 
and basic.idx = com.fr_ref(+)
and basic.idx = cafe.fr_ref(+)
order by basic.idx;
