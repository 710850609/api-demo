drop table if exists `user`;
create table `user`(
id int(32) AUTO_INCREMENT primary key,
`name` varchar(50),
birthday date,
gender int(1) 
);