-- 방명록 테이블 

create table guestbook_message (
    message_id number(4) primary key,
    guest_name varchar2(50) not null,
    password varchar2(10) not null,
    message varchar2(2000) not null
);

create sequence message_id_seq increment by 1 start with 1; 
--------------------------------------------------------------------------------
insert into guestbook_message
values (message_id_seq.nextVal, '테스터10','1111','테스트 글쓰기');

insert into guestbook_message
values (message_id_seq.nextVal, '고은아','1234','테스트 글쓰기');

select ROWNUM, message_id, message
from guestbook_message;

select rownum, message_id,message
from (select*from guestbook_message order by message_id);

drop table guestbook_message;

delete from guestbook_message;

select *from guestbook_message;

select rownum, message_id, guest_name, password, message from guestbook_message order by message_id desc;

select rownum, message_id, guest_name, password, message from(
    select * from guestbook_message order by guestbook_message.message_id desc
)order by message_id desc;


select rownum rnum, message_id, guest_name, password, message from(
    select * from guestbook_message order by guestbook_message.message_id desc
) where rownum <=6;

select message_id, guest_name, password, message
from(
select rownum rnum, message_id, guest_name, password, message from(
    select * from guestbook_message order by guestbook_message.message_id desc
) where rownum <=6)
where rnum >=4
;




commit;
rollback;
