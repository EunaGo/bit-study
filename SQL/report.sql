-- report

create table report(
    idx number(4) primary key,
    sname varchar2(10) not null,
    sno varchar2(10) not null,
    reportfile varchar2(100) not null
);

create sequence report_seq;

insert into report values (report_seq.nextval, '길동','1234','d');

select * from report;

rollback;