CREATE DATABASE `diary`  charset utf8 ;
USE `diary`;

create table user
(userID char(10) primary key,
userpassword char(12)
);
insert into user(userID,userpassword)
values('1000','11111'),
('1001','11111'),
('1002','11111');
use diary;
create table person(
ID char(10) primary key,
name char(10),
sex char(2),
telephone char(11),
Jianjie char(50),
email char(20),
time datetime,
foreign key(ID) references user(userID)
);

insert into person(ID,name,sex,telephone,Jianjie,email,time)
values('1000','王雨','女','11928753728','开朗大方','11928753728@163.com','2019-3-1 11:12:34');
set foreign_key_checks=0;
use diary;
CREATE TABLE diary1 (
id serial ,
title varchar(10) CHARACTER SET utf8 DEFAULT NULL,
content  text , 
pubdate datetime DEFAULT NULL,
userid char(8) default '0',
visible int DEFAULT NULL,
primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=gbk; 

create table OpinionActivity
(Op_id char(8),
Op_date date,
Op_title varchar(8) default NULL,
Op_content text,
primary key(Op_date)
);


