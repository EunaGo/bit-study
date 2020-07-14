
-- phoneInfo_basic
create table phoneInfo_basic
(idx number(6) not null,
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
idx number(6) not null,
fr_u_major varchar2(20) default 'n' not null,
fr_u_year number(1) default 1 not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx),
constraint year_heck check(fr_u_year>0 and fr_u_year<5));

drop table phoneInfo_univ;

-- test
select * from phoneInfo_univ;


-- phoneInfo_com
create table phoneInfo_com(
idx number(6) not null,
fr_c_company varchar(20) default 'n' not null,
fr_ref number(6) not null,
primary key(idx),
foreign key(fr_ref) references phoneInfo_basic(idx));


-----------------------------------------------------------------
-- 정보 입력 SQL 작성
-----------------------------------------------------------------

desc phoneInfo_basic;
desc phoneInfo_univ;
desc phoneInfo_com;

-- phoneInfo_basic 입력
insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(1,'scott','010-0000-1111','scott@gamil.com','LA',sysdate);

insert into phoneInfo_basic 
values(2,'april','010-2356-1111','april@gamil.com','ab',sysdate);

insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(3,'jon','010-0000-1231','jon@gamil.com','mmm',sysdate);

insert into phoneInfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address,fr_regdate) 
values(4,'alex','010-7894-1111','alex@gamil.com','kkk',sysdate);

select * from phoneInfo_basic ;

-- phoneInfo_univ 입력
insert into phoneInfo_univ values (1,'software',3,1); 

insert into phoneInfo_univ(idx,fr_u_major,fr_ref) values (2,'art',3);

select * from phoneInfo_univ;

-- phoneInfo_com 입력
insert into phoneInfo_com values(1,'bit',2);

insert into phoneInfo_com(idx,fr_ref) values(2,4);

select * from phoneInfo_com;

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
from phoneInfo_basic b, phoneInfo_univ u, phoneInfo_com c
where b.idx = u.fr_ref(+) and b.idx = c.fr_ref(+)
order by b.idx;
