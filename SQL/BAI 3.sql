DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;
-- BANG 1
CREATE TABLE Department (
DepartmentID			INT PRIMARY KEY AUTO_INCREMENT,
DepartmentName			VARCHAR(50)
);

-- BANG 2
CREATE TABLE `Position` (
PositionID				INT PRIMARY KEY AUTO_INCREMENT,
PositionName			enum('Dev','Test','Scrum Master','PM')
);

-- BANG 3
CREATE TABLE `Account` (
AccountID				INT PRIMARY KEY AUTO_INCREMENT,
Email					VARCHAR(50),
Username				VARCHAR(50) UNIQUE,
FullName				VARCHAR(50),
DepartmentID			INT,
PositionID				INT,
CreateDate				DATE,
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

-- BANG 4
CREATE TABLE `Group` (
GroupID					INT PRIMARY KEY,
GroupName				VARCHAR(50),
CreatorID				INT,
CreateDate				DATE,
FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- BANG 5
CREATE TABLE GroupAccount (
GroupID					INT PRIMARY KEY,
AccountID				INT,
JoinDate				DATE,
FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

-- BANG 6
CREATE TABLE TypeQuestion (
TypeID					INT PRIMARY KEY,
TypeName				ENUM('Essay', 'Multiple-Choice')
);

-- BANG 7
CREATE TABLE CategoryQuestion (
CategoryID				INT PRIMARY KEY,
CategoryName			VARCHAR(50)
);

-- BANG 8
CREATE TABLE Question (
QuestionID				INT PRIMARY KEY,
Content					VARCHAR(255),
CategoryID				INT,
TypeID					INT,
CreatorID				INT,
CreateDate				DATE,
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- BANG 9
CREATE TABLE Answer (
AnswerID				INT PRIMARY KEY,
Content					VARCHAR(255),
QuestionID				INT,
isCorrect				ENUM('ĐÚNG', 'SAI'),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- BANG 10
CREATE TABLE Exam (
ExamID					INT PRIMARY KEY,
`Code`					VARCHAR(50),
Title					VARCHAR(50),
CategoryID				INT,
Duration				TIME,
CreatorID				INT,
CreateDate				DATE,
FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- BANG 11
CREATE TABLE ExamQuestion (
ExamID					INT PRIMARY KEY,
QuestionID				INT,
FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

insert into Department (DepartmentID, DepartmentName) values (1, 'Engineering');
insert into Department (DepartmentID, DepartmentName) values (2, 'Accounting');
insert into Department (DepartmentID, DepartmentName) values (3, 'Product Management');
insert into Department (DepartmentID, DepartmentName) values (4, 'Sales');
insert into Department (DepartmentID, DepartmentName) values (5, 'Marketing');

insert into `Position` (PositionID, PositionName) values (1, 'Dev');
insert into `Position` (PositionID, PositionName) values (2, 'Test');
insert into `Position` (PositionID, PositionName) values (3, 'Scrum Master');
insert into `Position` (PositionID, PositionName) values (4, 'PM');

insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (1, 'gwhittek0@thetimes.co.uk', 'gwhittek0', 'Gilbert Whittek', 4, 2, '2021-10-24');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (2, 'gdillamore1@skyrock.com', 'gdillamore1', 'Gordie Dillamore', 3, 4, '2022-07-16');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (3, 'lcoste2@4shared.com', 'lcoste2', 'Lesya Coste', 2, 3, '2022-04-15');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (4, 'crossant3@columbia.edu', 'crossant3', 'Carlo Rossant', 1, 1, '2022-01-15');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (5, 'porro4@shinystat.com', 'porro4', 'Padriac Orro', 3, 4, '2021-09-12');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (6, 'brentelll5@fc2.com', 'brentelll5', 'Bartholomew Rentelll', 1, 2, '2021-11-05');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (7, 'adavidove6@opensource.org', 'adavidove6', 'Aleksandr Davidove', 4, 1, '2021-09-13');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (8, 'gjackett7@cnet.com', 'gjackett7', 'Gerty Jackett', 5, 2, '2021-12-08');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (9, 'bhyam8@prnewswire.com', 'bhyam8', 'Burl Hyam', 1, 2, '2021-11-24');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (10, 'mkaufman9@apache.org', 'mkaufman9', 'Monroe Kaufman', 4, 3, '2021-09-05');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (11, 'cmurgatroyda@live.com', 'cmurgatroyda', 'Catlin Murgatroyd', 2, 3, '2021-09-22');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (12, 'kvoseb@i2i.jp', 'kvoseb', 'Karney Vose', 3, 1, '2021-09-17');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (13, 'mbriancec@ebay.com', 'mbriancec', 'Milton Briance', 4, 3, '2022-01-29');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (14, 'aovesend@elegantthemes.com', 'aovesend', 'Andriana Ovesen', 3, 1, '2022-07-07');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (15, 'dkubue@npr.org', 'dkubue', 'Darby Kubu', 1, 3, '2022-06-21');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (16, 'cenglandf@nsw.gov.au', 'cenglandf', 'Cathlene England', 4, 2, '2021-08-01');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (17, 'ematthiaeg@istockphoto.com', 'ematthiaeg', 'El Matthiae', 3, 1, '2022-02-17');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (18, 'dholdallh@forbes.com', 'dholdallh', 'Dorena Holdall', 2, 3, '2021-11-23');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (19, 'bmcquorkelli@uol.com.br', 'bmcquorkelli', 'Booth McQuorkell', 4, 2, '2022-07-06');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (20, 'driggeardj@qq.com', 'driggeardj', 'Deanna Riggeard', 4, 3, '2021-07-29');
