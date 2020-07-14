-- 현재 계정의 테이블 목록을 보여줌
SELECT *
FROM tab;

-- 모든 계정의 테이블 목록을 보여줌
SELECT *
FROM all_tables
WHERE OWNER = SCOTT;

SELECT *
FROM user_tables;


-- phonebook
create table phonebook(
pidx number(4),
pname varchar2(10) not null,
phonenum varchar2(20) not null,
address varchar2(20) default '입력 없음' not null,
email varchar2(20) default '입력 없음' not null,
pbtype varchar2(50) not null,
major varchar2(10),
grade number(1),
comname varchar2(20),
deptname varchar2(20),
deptjob varchar2(10),
cafename varchar2(20),
nickname varchar2(10),
primary key(pidx),
constraint category_pbtype check(pbtype in ('univ', 'com', 'cafe')),
constraint phonenum_check unique(phonenum));

drop table phonebook;

-- test
select *
from phonebook;


-----------------------------------------------------------------

-- 사용자 정의 제약조건을 저장하는 딕셔너리 테이블
desc user_constraints;
select * from user_constraints where table_name='PHONEBOOK';

-----------------------------------------------------------------



-----------------------------------------------------------------
-- 정보 입력 SQL 작성
-----------------------------------------------------------------

desc phonebook;

select * from phonebook;

-- 기본 정보 입력

desc phonebook;
insert into phonebook(pidx,pname,phonenum,address,email,pbtype) values(1,'euna','010-9389-8415','성산동','gumagoo8@gmail.com','univ');

-- default 입력 처리 address, email

insert into phonebook(pidx,pname,phonenum,pbtype) values(2,'scott','010-4567-8415','com');

--학교 친구 정보 입력

insert into phonebook(pidx, pname, phonenum, address, email, pbtype, major, grade) 
values(3, 'son', '010-3333-1111', '서울', 'son@gmail.com', 'univ', 'computer', 1);

--회사 친구 정보 입력

insert into phonebook(pidx, pname, phonenum, address, email, pbtype, comname, deptname, deptjob) 
values (4, '박지성', '010-1234-0000', '런던', 'ji@gmail.com', 'com', 'NAVER', 'SEARCH', 'PROGRAMER');

-- 모임 친구 입력

insert into phonebook(pidx, pname, phonenum, address, email, pbtype, cafename, nickname) 
values (5, 'Rain', '010-1111-2222', 'SEOUL', 'rain@gmail.com', 'cafe', 'Campping', 'FirstCamp');


------------------------------------------------------------------------
-- 정보 출력 질의 
------------------------------------------------------------------------

select pidx, pname, phonenum from phonebook;

select * from phonebook;

-- 2. 대학 친구 정보 출력 질의

select pname, phonenum, major, grade from phonebook where pbtype='univ';


-- 3. 회사 친구 정보 출력 질의

select pname, phonenum, comname, deptname, deptjob from phonebook where pbtype='com';


-- 4. 모임 친구 정보 출력 질의

select pname, phonenum, cafename, nickname from phonebook where pbtype='cafe';


