create database if not exists javadatabase;
drop table if exists infotable;
use javadatabase;
create table infotable (id char(8) not null primary key, name varchar(10) not null, gender char(2) not null, post_num char(10) not null,
address varchar(20) not null, tel char(10) null, age char(2) null);

insert into infotable values ('yihwang','황영주','M','100-011','서울시 중구 충무로1가','234-8879',35);
insert into infotable values ('jyjang','장영숙','W','606-065','부산시 영도구 봉래동5가','399-9809',24);
insert into infotable values ('yjbae','배용진','M','122-014','서울시 은평구 응암4동','857-5683',30);


select * from infotable;
select * from infotable where id = 'jyjang';