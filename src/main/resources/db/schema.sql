drop table if exists `user`;
create table `user`(
id bigint(20) AUTO_INCREMENT primary key,
`name` varchar(50),
birthday date,
gender int(1) 
);