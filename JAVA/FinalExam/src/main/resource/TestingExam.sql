Drop database if exists TestingExam;
Create database TestingExam;
use TestingExam;
DROP TABLE IF EXISTS `user`;
Create table `user` (
	id			int(10) auto_increment primary key,
    fullName	varchar(50) not null,
    email		varchar(50) not null,
    `password`	varchar(50) not null,
    user_type	enum('admin', 'employess') NOT NULL DEFAULT 'employess',
    ExpInYear	INT(10),
    ProSkill	VARCHAR(50)
);

insert into `user`( fullName, email, `password`, user_type, ExpInYear, ProSkill) values
					('Nguyen Van A', 'nvA@gamil.com', '123456', 'admin', 5, null),
					('Nguyen Van B', 'nvB@gamil.com', '123456', 'employess', null, 'dev'),
					('Nguyen Van C', 'nvC@gamil.com', '123456', 'employess', null, 'Tes'),
					('Nguyen Van D', 'nvD@gamil.com', '123456', 'admin', 5, null),
					('Nguyen Van E', 'nvE@gamil.com', '123456', 'employess', null, 'java');