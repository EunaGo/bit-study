-- 데이터 복구하기 !!

-- 15분전 데이터 조회
SELECT * 
FROM emp AS OF TIMESTAMP(SYSTIMESTAMP-INTERVAL '15' MINUTE);

-- 테이블 삭제
delete emp;

-- 데이터 삽입
insert into emp
select *
from emp as of timestamp(systimestamp-interval '15' minute);

-- 확인
select *
from emp;
