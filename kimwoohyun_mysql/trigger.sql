use shopdb;
insert into membertbl values('soccer','흥민','서울시 서대문구 북가좌동');
update membertbl set memberAddress='서울 강남구 역삼동' where memberName='흥민';
delete from membertbl where memberName='흥민';

create table deletedMembertbl
(memberID char(8), memberName char(5),memberAddress char(20),deletedDate date);

DELIMITER //
create trigger trg_deletedMembertbl
	after delete
    on membertbl
    for each row
begin
	insert into deletedMembertbl
    values(old.memberID,old.memberName,old.memberAddress,curdate());
end //
DELIMITER ;

