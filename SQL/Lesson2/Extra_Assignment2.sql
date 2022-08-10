DROP DATABASE if EXISTS Assignment2;
create database Assignment2;
use Assignment2;
create table Trainee(
TraineeID				INT AUTO_INCREMENT primary key,
Full_Name				VARCHAR(50),
Birth_Date				DATE,
Gender					ENUM('male', 'female', 'unknown'),
ET_IQ					INT,
check ( ET_IQ BETWEEN 0 and 20),
ET_Gmath				int,
CHECK (ET_Gmath BETWEEN 0 and 20),
ET_English				INT,
CHECK (ET_English BETWEEN 0 and 50),
Training_Class			char(5),
Evaluation_Notes		text
);

alter table Trainee
add VTI_Account int not null UNIQUE;

-- Exercise 2: Data Types
drop table if exists DataTypes;
create table DataTypes(
ID						mediumint AUTO_INCREMENT PRIMARY key,
`Name`					Varchar(50),
`Code`					CHAR(5),
ModifiedDate			DATE
);

-- Exercise 3: Data Types
DROP TABLE if exists DataTypes2;
CREATE table DataTypes2(
ID						MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
`Name`					VARCHAR(50),
BirthDate				DATE,
`Gender`				INT,
CHECK (`Gender`= 0 OR `Gender`= 1 OR `Gender` = NULL),
IsDeletedFlag			enum( '0', '1')
);








