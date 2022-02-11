set global log_bin_trust_function_creators=1;
use shopdb;
drop function if exists userFunc;
delimiter $$
create function userFunc(value1 int, value2 int)
returns int
begin
return value1+value2;
end $$
delimiter ;

select userFunc(100,200);