use shopdb;
DELIMITER //
create procedure myProc()
begin
	select * from membertbl where memberName='토마스';
    select * from producttbl where productName='냉장고';
    
end //
DELIMITER ;

call myProc();

