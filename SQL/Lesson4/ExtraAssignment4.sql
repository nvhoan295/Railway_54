drop DATABASE if exists ExtraAssignment4;
create database ExtraAssignment4;
use ExtraAssignment4;
Create table Department(
Department_Number int AUTO_INCREMENT PRIMARY key,
Department_Name varchar(50)
);

Create table Employee_Table(
Employee_Number int AUTO_INCREMENT PRIMARY key, 
Employee_Name VARCHAR(50) ,
Department_Number int,
foreign key (Department_Number) references Department(Department_Number)
);

Create table Employee_Skill_Table(
Employee_Skill_Number int AUTO_INCREMENT PRIMARY key,
Employee_Number int, 
Skill_Code char(10), 
Date_Registered date,
foreign key (Employee_Number) references Employee_Table(Employee_Number)
);

insert into Department(Department_Name) values ('Giám Đốc'),
												('Tổ Chức'),
                                                ('Kế Toán'),
                                                ('Kinh Doanh'),
                                                ('Kỹ Thuật'),
                                                ('Bảo an'),
                                                ('Sản Xuất'),
                                                ('Kiểm định');
insert into Employee_Table(Employee_Name,Department_Number) values ('Nguyễn Văn A', 1),
																	('Trần Văn Cao', 2),
                                                                    ('Lê Văn Sơn', 4),
                                                                    ('Đặng Văn B', 5),
                                                                    ('Đinh Văn Tấn', 5),
                                                                    ('Hoàng Kim Bảo', 5),
                                                                    ('Trần Thanh Niên', 3),
                                                                    ('Lý  Văn C', 4),
                                                                    ('Trần Văn Trà', 2);
insert into Employee_Skill_Table(Employee_Number, Skill_Code, Date_Registered) VALUES (5, 'Java', '2022-08-23'),
																						(3, '.Net', '2022-07-23'),
																						(4, 'Java', '2022-05-23'),
																						(2, 'C++', '2022-04-29'),
																						(2, 'Python', '2022-01-20'),
																						(6, 'JS', '2021-01-10'),
																						(5, 'PHP', '2020-01-21');
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
-- Hướng dẫn: sử dụng UNION

SELECT 
    Employee_Name, Skill_Code
FROM
    Employee_Table e
    join Employee_Skill_Table s on e.Employee_Number = s.Employee_Number
    where Skill_Code = 'java';
    
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

SELECT 
    d.Department_Number, d.Department_Name, count(e.Employee_Number) as SoNhanVien
FROM
    department d
        LEFT JOIN
    Employee_Table e ON d.Department_Number = e.Department_Number
	GROUP BY d.Department_Number
    having SoNhanVien >= 3
    ;
-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
-- Hướng dẫn: sử dụng GROUP BY
SELECT 
    d.Department_Number, d.Department_Name, e.Employee_Name
FROM
    department d
        LEFT JOIN
    Employee_Table e ON d.Department_Number = e.Department_Number
    ;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
-- Hướng dẫn: sử dụng DISTINCT





