-- Drop the database if it already exists
DROP DATABASE IF EXISTS Assigment11;
-- Create database
CREATE DATABASE IF NOT EXISTS Assigment11;
USE Assigment11;

-- Create table user
DROP TABLE IF EXISTS 	`user`;
CREATE TABLE IF NOT EXISTS `user` ( 	
	`id` 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	`full_name`	 	CHAR(50) NOT NULL,
	`email` 		CHAR(50) NOT NULL UNIQUE,
	`password` 		VARCHAR(800) NOT NULL,
    
	`position`  	ENUM('ADMIN','EMPLOYEE') NOT NULL DEFAULT 'EMPLOYEE',
    
    `pro_skill`     CHAR(50),
    `exp_in_year`   integer (11)
);

INSERT INTO `user` 
(`full_name`, `email`, `password`, `position`, `pro_skill`, `exp_in_year`)
VALUES
('Nguyen Van A', 'Abc1@gmail.com', '123456', 'ADMIN', null, '10'),
('Nguyen Van B', 'Abc2@gmail.com', '123456', 'EMPLOYEE', 'DEV', null),
('Nguyen Van C', 'Abc3@gmail.com', '123456', 'ADMIN', null, '5'),
('Nguyen Van D', 'Abc4@gmail.com', '123456', 'EMPLOYEE', 'XEOM', null)