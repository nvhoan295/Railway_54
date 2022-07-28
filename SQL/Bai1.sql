drop database if exists Testing_System_Assignment_1;
create database Testing_System_Assignment_1;
use Testing_System_Assignment_1;
-- Bang 1
create table Department (
DepartmentID 	int primary key auto_increment,
DepartmentName	varchar(50)
);
-- Bang 2
create table Position1 (
PositionID		int primary key auto_increment,
PositionName	varchar(50)
);
-- Bang 3
create table Account (
AccountID		int primary key auto_increment,
Email			varchar(50),
UserName		varchar(50),
FullName		varchar(50),
DepartmentID	int,
PositionID		int,
CreateDate		date,
foreign key (DepartmentID) references Department(DepartmentID),
foreign key (PositionID) references Position1(PositionID)
);
-- Bang 4
create table Group1 (
GroupID 		int primary key auto_increment,
AccountID		int,
CreatorID		int,
CreateDate		Date
);
-- Bang 5
create table GroupAccount (
GroupID			int primary key,
AccountID		varchar(50),
JoinDate		Date,
foreign key (GroupID) references Group1(GroupID)
);
-- Bang 6
create table TypeQuestion (
TypeID			int primary key auto_increment,
TypeName		varchar(50)
);
-- Bang 7
create table CategoryQuestion (
CategoryID		int primary key auto_increment,
CategoryName	varchar(50)
);
-- Bang 8
create table Question (
QuestionID		int primary key auto_increment,
Content			varchar(50),
CategoryID		int,
TypeID			int,
CreatorID		int,
CreateDate		date,
foreign key (CategoryID) references  CategoryQuestion(CategoryID),
foreign key (TypeID) references  TypeQuestion(TypeID)
);
-- Bang 9
create table Answer (
AnswerID		int primary key auto_increment,
Content			varchar(50),
QuestionID		int,
isCorrect		int,
foreign key (QuestionID) references  Question(QuestionID)
);
-- Bang 10
create table Exam (
ExamID			int primary key auto_increment,
Code			varchar(50),
Title			int,
CategoryID		int,
Duration		date,
CreatorID		int,
CreateDate		date
);
-- Bang 11
create table ExamQuestion (
ExamID			int primary key auto_increment,
QuestionID		int,
foreign key (ExamID) references  Exam(ExamID)
);










