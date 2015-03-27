create table parlay_users (
   endUserPin varchar(64),
   endUserName varchar(60),
   endUserWallet varchar(20),
   primary key (endUserPin)
);
insert into parlay_users(endUserPin, endUserName,endUserWallet ) values ('8D:9D:F4:71:2B:66:7E:53:C8:4E:3C:7A:A4:10:FE:7A','MPAWA','0733618561');

create table company (
  company_id varchar(64),
  company_name varchar(30),
  primary key (company_id)
);
insert into company (company_id,company_name) values('8D:9D:F4:71:2B:66:7E:53:C8:4E:3C:7A:A4:10:FE:7A','MPAWA');