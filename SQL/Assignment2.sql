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