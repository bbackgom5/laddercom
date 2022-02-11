drop database if exists testdb;
create database if not exists testdb;
use testdb;

create table membertbl (memberid char(10) not null primary key, membername varchar(10) not null, memberaddress varchar(20) not null);
insert into membertbl values ('Thomas', '토마스', '뉴옥');
insert into membertbl values ('Edward', '에드워드', '강남구 신사동');
insert into membertbl values ('Gorden', '고든', '대전광역시 서구 월평동');

create table index_tbl (memberid char(10) not null primary key);
insert into index_tbl select memberid from testdb.membertbl;

select * from index_tbl where memberid = 'Thomas';

create view uv_tbl as select membername, memberaddress from membertbl;

select membername from uv_tbl;
