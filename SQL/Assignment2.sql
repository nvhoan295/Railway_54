drop database if exists Assignment2;
create database Assignment2;
use Assignment2;
create table Trainee (
TraineeID			int primary key auto_increment,
Full_Name			varchar(50),
Birth_Date			date,
Gender				int,
ET_IQ				tinyint,
ET_Gmath			tinyint,
ET_English			tinyint,
Training_Class		varchar(50),
Evaluation_Notes	text
);
-- Exercise 2:
create table DataTypes (
ID					int primary key auto_increment,
`Name`				varchar(50),
`Code`				varchar(255),
ModifiedDate		date
);

-- Exercise 3:
create table  DataTypes2 (
ID					int primary key auto_increment,
`Name`				varchar(50),
BirthDate			date,
`Gender`			int,
IsDeletedFlag		bool
);