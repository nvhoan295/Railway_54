drop database if exists Assignment2;
create database Assignment2;
use Assignment2;
create table Trainee (
TraineeID			int AUTO_INCREMENT primary key,
Full_Name			varchar(50),
Birth_Date			date,
`Gender`			enum("Male", "Female", "unknown"),
ET_IQ				int,
check (ET_IQ >0 and ET_IQ<20),
ET_Gmath			INT,
check (ET_Gmath >0 and ET_Gmath<20),
ET_English			INT,
check (ET_English > 0 and ET_English< 50),
Training_Class		varchar(50) not null,
Evaluation_Notes	text
);

ALTER TABLE Trainee
ADD VTI_ACCOUNT INT not null UNIQUE;
-- Exercise 2:
create table DataTypes (
ID					mediumint AUTO_INCREMENT primary key,
`Name`				varchar(50),
`Code`				char(5),
ModifiedDate		DATETIME
);

-- Exercise 3:
create table  DataTypes2 (
ID					MEDIUMINT AUTO_INCREMENT primary key,
`Name`				varchar(50),
BirthDate			date,
`Gender`			int,
CHECK ( `Gender` = 0 OR `Gender` = 1 OR `Gender`= NULL),
IsDeletedFlag		ENUM('0','1')
);