DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;
-- BANG 1
CREATE TABLE Department (
DepartmentID			INT AUTO_INCREMENT PRIMARY KEY,
DepartmentName			VARCHAR(50)
);

-- BANG 2
CREATE TABLE `Position` (
PositionID				INT AUTO_INCREMENT PRIMARY KEY,
PositionName			enum('Dev','Test','Scrum Master','PM')
);

-- BANG 3
CREATE TABLE `Account` (
AccountID				INT AUTO_INCREMENT PRIMARY KEY,
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
GroupID					INT AUTO_INCREMENT PRIMARY KEY,
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
TypeID					INT AUTO_INCREMENT PRIMARY KEY,
TypeName				ENUM('Essay', 'Multiple-Choice')
);

-- BANG 7
CREATE TABLE CategoryQuestion (
CategoryID				INT AUTO_INCREMENT PRIMARY KEY,
CategoryName			ENUM('Java', '.NET', 'SQL', 'Postman', 'Ruby')
);

-- BANG 8
CREATE TABLE Question (
QuestionID				INT AUTO_INCREMENT PRIMARY KEY,
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
AnswerID				INT AUTO_INCREMENT PRIMARY KEY,
Content					VARCHAR(255),
QuestionID				INT,
isCorrect				ENUM('ĐÚNG', 'SAI'),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

-- BANG 10
CREATE TABLE Exam (
ExamID					INT AUTO_INCREMENT PRIMARY KEY,
`Code`					VARCHAR(50),
Title					VARCHAR(50),
CategoryID				INT,
Duration				INT,
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
-- Chèn dữ liệu
insert into Department (DepartmentID, DepartmentName) values 
							(1, 'Marketing'),
							(2, 'Sale'),
							(3, 'Bảo vệ'),
							(4, 'Nhân sự'),
							(5, 'Kỹ thuật'),
                            (6, 'Tài chính'),
                            (7, 'Phó giám đốc'),
                            (8, 'Giám đốc'),
                            (9, 'Thư kí'),
							(10, 'Bán hàng');
insert into `Position` (PositionID, PositionName) values (1, 'Dev');
insert into `Position` (PositionID, PositionName) values (2, 'Test');
insert into `Position` (PositionID, PositionName) values (3, 'Scrum Master');
insert into `Position` (PositionID, PositionName) values (4, 'PM');

insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (1, 'gwhittek0@thetimes.co.uk', 'gwhittek0', 'Gilbert Whittek', 4, 2, '2021-10-24');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (2, 'gdillamore1@skyrock.com', 'gdillamore1', 'Gordie Dillamore', 3, 4, '2022-07-16');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (3, 'lcoste2@4shared.com', 'lcoste2', 'Lesya Coste', 2, 3, '2022-04-15');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (4, 'crossant3@columbia.edu', 'crossant3', 'Carlo Rossant', 1, 1, '2022-01-15');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (5, 'porro4@shinystat.com', 'porro4', 'Padriac Orro', 3, 4, '2021-09-12');
insert into `Account` (AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate) values (6, 'diop@shinystat.com', 'poroep', 'Do Hung Tao', 2, 4, '2021-09-12');

insert into `Group` (GroupName, 	CreatorID, 	CreateDate) values 
					('Nhom1', 		1 , 		'2022-04-23'),
					('Nhom 2', 		3, 			'2022-01-12'),
					('Nhom 3', 		2, 			'2021-03-25'),
					('Nhom 4', 		4, 			'2020-11-20'),
                    ('Nhom 5', 		5, 			'2019-11-20');
                                                            
insert into GroupAccount (GroupID, AccountID, JoinDate) values (1 , 4, '2022-01-23'),
																(2, 5, '2011-04-26'),
                                                                (3 ,4, '2020-08-30'),
                                                                (4, 2, '2022-09-25');
                                                                
insert into TypeQuestion ( TypeName) values ('Essay'),
										('Multiple-Choice');
                                        
insert into CategoryQuestion(CategoryName) values ('Java'),
												('.NET'),
                                                ('SQL'),
                                                ('Postman'),
                                                ('Ruby');
                                                            
insert into Question (Content, CategoryID, TypeID, CreatorID, CreateDate) values ('Java là gì', 1 , 1, 2, '2020-02-18'),
																				('.Net là gì',2, 2, 4, '2021-04-20'),
                                                                                ('Postman là gì',3, 1, 5, '2020-04-10'),
                                                                                ('.Ruby là gì',4, 2, 3, '2022-04-18');

insert into Answer (Content, QuestionID, isCorrect) values ('Trả lời 1', 1, 'Đúng'),
															('Trả lời 2', 1, 'Sai'),
                                                            ('Trả lời 3', 1, 'Đúng'),
                                                            ('Trả lời 4', 1, 'Đúng'),
                                                            ('Trả lời 5', 2, 'Đúng'),
                                                            ('Trả lời 6', 3, 'Đúng'),
                                                            ('Trả lời 7', 4, 'Đúng'),
                                                            ('Trả lời 8', 4, 'Đúng'),
                                                            ('Trả lời 9', 4, 'Đúng');
                                                            
insert into Exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate) values ( 'A1', 'Tự Luận', 1, 60, 1, '2022-03-15'),
																					( 'B1', 'Vấn Đáp', 2, 90, 1, '2022-03-15'),
                                                                                    ( 'C1', 'Code trên máy', 3, 120, 1, '2022-03-15');
                                                                                    
insert into ExamQuestion values (1, 1),
								(2, 2),
                                (3, 3);
                                                            
                                                            

																					
                                                            
