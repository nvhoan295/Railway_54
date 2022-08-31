Drop database if exists NguyenVanHoan_SQL_Railway54_ThucHanh;
Create database NguyenVanHoan_SQL_Railway54_ThucHanh;
use NguyenVanHoan_SQL_Railway54_ThucHanh;

Drop table if exists Country;
Create table Country(
	country_id 			INT AUTO_INCREMENT PRIMARY KEY,
    country_name		VARCHAR(50) NOT NULL UNIQUE
);

drop table if exists Location;
Create table Location(
	location_id			INT AUTO_INCREMENT PRIMARY KEY,
    street_address		VARCHAR(50),
    postal_code			INT NOT NULL UNIQUE,
    country_id			INT,
    FOREIGN KEY (country_id) REFERENCES Country(country_id)
);

drop table if exists Employee;
Create table Employee(
	employee_id			INT AUTO_INCREMENT PRIMARY KEY,
    full_name			VARCHAR(50) NOT NULL,
    email				VARCHAR(50) NOT NULL UNIQUE,
    location_id			INT,
	constraint khoaNgoaiEmployee FOREIGN KEY (location_id) REFERENCES Location(location_id)
);

-- THÊM DỮ LIỆU -- 
INSERT INTO Country VALUES (1 , 'Viet Nam'),
							(2 , 'Trung Quoc'),
                            (3 , 'Nhat Ban');
                            
INSERT INTO Location VALUES (1, 'Ha Noi', 10000, 1),
							(2, 'Da Nang', 120000, 1),
                            (3, 'Ho Chi Minh', 15000, 1),
                            (4, 'Bac Kinh', 50000, 2),
                            (5, 'Tokyo', 600000, 3);
                            
INSERT INTO Employee VALUES (1, 'Nguyen Van A', 'nva@gamil.com', 1),
							(2, 'Chau Tinh Tri', 'nn03@gmail.com', 4),
                            (3, 'Nguyen Van B', 'nvb@gamil.com', 1);

-- Tra Lời Câu Hỏi

-- 2. Viết lệnh để
-- a) Lấy tất cả các nhân viên thuộc Việt nam
	SELECT 
    E.employee_id, full_name, email, country_name
FROM
    Employee E
        JOIN
    Location L ON E.location_id = L.location_id
        JOIN
    Country C ON C.country_id = L.country_id
WHERE
    country_name = 'Viet Nam';

-- b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"



SELECT 
    C.country_id, country_name, email
FROM
    Employee E
        JOIN
    Location L ON E.location_id = L.location_id
        JOIN
    Country C ON C.country_id = L.country_id
WHERE
    email = 'nn03@gmail.com';


-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
	SELECT 
    C.country_id, country_name, COUNT(employee_id) AS SoLuong
FROM
    Country C
        LEFT JOIN
    Location L ON C.country_id = L.country_id
        LEFT JOIN
    Employee E ON E.location_id = L.location_id
GROUP BY country_name
ORDER BY C.country_id;

-- 3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee

Drop trigger if exists moiQuocGia10Emp;
Delimiter $$
Create trigger moiQuocGia10Emp
Before insert on Employee for each row
Begin
	Declare V_CountCountry int;
	SELECT 
		count(employee_id) into V_CountCountry
	FROM
    Country C
        LEFT JOIN
    Location L ON C.country_id = L.country_id
        LEFT JOIN
    Employee E ON E.location_id = L.location_id
    where E.employee_id = new.employee_id
	GROUP BY country_name
	;
	if (V_CountCountry > 10 ) then
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'Qua 10 employee, khong them duoc nua';
        end if;
End $$
Delimiter ;

        
-- 4. Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
-- location đó sẽ có location_id = null

-- B1: Xoá khoá ngoại cũ
ALTER table Employee
drop foreign key khoaNgoaiEmployee;

-- B2: Tạo khoá ngoại mới thêm ON DELETE SET NULL
ALTER table Employee
add FOREIGN KEY (location_id) REFERENCES Location(location_id) ON DELETE SET NULL;


                            
                            
                            
                            












