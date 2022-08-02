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

SELECT * FROM Assignment2.Trainee;
INSERT INTO Trainee(Full_Name, Birth_Date, Gender, ET_IQ,ET_Gmath, ET_English, Training_Class, Evaluation_Notes, VTI_Account)
Values('Nguyễn Văn Hoàn', '1990-05-29', 'male', 20,  15, 35, 'A1', 'Lớp Java', 1),
('Nguyễn Văn A', '2000-05-29', 'male', 10,  15, 35, 'B1', 'Lớp C', 2),
('Nguyễn Phương Thảo', '1999-05-19', 'female', 8,  15, 25, 'A1', 'Lớp Java', 3),
('Nguyễn Thị Bình', '2001-05-09', 'female', 12,  15, 35, 'A1', 'Lớp Python', 4),
('Nguyễn Văn An', '2000-05-14', 'male', 4,  15, 15, 'B1', 'Lớp C', 5),
('Nguyễn Đình Tùng', '2002-05-29', 'male', 5,  15, 35, 'C1', 'Lớp JS', 6),
('Nguyễn Phương Liên', '2000-05-29', 'female', 12,  16, 25, 'B1', 'Lớp PHP', 7),
('Nguyễn Thị Nhung', '2001-08-29', 'female', 10,  15, 15, 'C1', 'Lớp C', 8),
('Nguyễn Tùng Lâm', '2000-08-29', 'male', 14,  11, 25, 'D1', 'Lớp Java', 9),
('Trần Văn B', '2001-04-14', 'male', 19,  12, 25, 'A1', 'Lớp PHP', 10);
SELECT * FROM Assignment2.Trainee;
-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau
SELECT 
    MONTH(Birth_Date) AS thang_sinh
FROM
    Trainee
GROUP BY MONTH(Birth_Date)
;

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
select * from Trainee where length(Full_Name) = (SELECT max(length(Full_Name)) FROM Trainee);

-- Question 4:
SELECT 
    *
FROM
    Trainee
WHERE
    (ET_IQ + ET_Gmath) >= 20 
		AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18;

-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE FROM Trainee 
WHERE
    TraineeID = 3;
    
-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE Trainee 
SET 
    Training_Class = '2'
WHERE
    TraineeID = 2;