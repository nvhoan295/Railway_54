-- Drop the database if it already exists
DROP DATABASE IF EXISTS FinalExam;
-- Create database
CREATE DATABASE IF NOT EXISTS FinalExam;
USE FinalExam;

-- Create table user
DROP TABLE IF EXISTS 	`user`;
CREATE TABLE IF NOT EXISTS `user` ( 	
	`id` 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`full_name`	 	CHAR(50) NOT NULL,
	`email` 		CHAR(50) NOT NULL UNIQUE,
	`password` 		VARCHAR(800) NOT NULL,
	`role`  		ENUM('MANAGER','EMPLOYEE') NOT NULL,
    `exp_in_year`   INT,
    `pro_skill`     CHAR(50),
	projectId		INT
);

INSERT INTO `user` 
(`full_name`, `email`, `password`, `role`, `exp_in_year`, `pro_skill`, projectId)
VALUES
('Nguyen Van A', 'Abc1@gmail.com', '123456', 'MANAGER', 5, null,1),
('Nguyen Van B', 'Abc2@gmail.com', '123456', 'EMPLOYEE', null, 'Dev',2),
('Nguyen Van C', 'Abc3@gmail.com', '123456', 'MANAGER', 5, null,1),
('Nguyen Van D', 'Abc4@gmail.com', '123456', 'EMPLOYEE', null, 'Test',2);