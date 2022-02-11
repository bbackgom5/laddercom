SELECT * FROM test.membertbl;
create index index_TBL on membertbl(memberID);
select * from test.membertbl where memberID = 'Thomas';