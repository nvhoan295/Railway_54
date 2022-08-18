Use TestingSystem;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
Drop Procedure if exists Store_Question1;
delimiter $$
Create PROCEDURE Store_Question1 ( in TenPhongBan varchar(50))
Begin
	SELECT 
		AccountID, Email, FullName
	FROM
		Department D
		join
		Account A on D.DepartmentID = A.DepartmentID
		where DepartmentName = TenPhongBan;
end $$
delimiter ;
call Store_Question1('sale');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
Drop procedure if exists Store_Question2;
delimiter $$
Create procedure Store_Question2 ( in TenGroup int)
begin
	SELECT 
		Count(GA.AccountID) as SoLuongAccount
	FROM
		`Group` G
	join 
		GroupAccount GA on G.GroupID = GA.GroupID
	Where GA.GroupID = TenGroup;
end $$
delimiter ;

Drop Function if exists Store_Question2;
delimiter $$
Create Function Store_Question2 (TenGroup int) returns varchar(50)
READS SQL DATA
DETERMINISTIC
begin
DECLARE SoLuongAccount VARCHAR(50);
	SELECT 
		Count(GA.AccountID) INTO SoLuongAccount
	FROM
		`Group` G
	join 
		GroupAccount GA on G.GroupID = GA.GroupID
	Where GA.GroupID = TenGroup;
    RETURN SoLuongAccount;
end $$
delimiter ;

SELECT Store_Question2(3);

 


-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
Drop procedure if exists Store_Question3;
Delimiter $$
Create procedure Store_Question3 ()
Begin
	SELECT 
		TypeName, COUNT(QuestionID)
	FROM
		TypeQuestion TQ
			JOIN
		Question Q ON TQ.TypeID = Q.TypeID
	WHERE
		MONTH(CreateDate) = MONTH(NOW())
	AND YEAR(CreateDate) = YEAR(NOW())
	GROUP BY TypeName;
end $$
Delimiter ;


-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
Drop procedure if exists Store_Question4;
DELIMITER $$
CREATE PROCEDURE Store_Question4()
BEGIN
		with sl as(
		SELECT 
			Count(TQ.TypeID) as SlCauHoi
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID)
		SELECT 
			TQ.TypeID, Count(TQ.TypeID) as SlCauHoi
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID
			having Count(TQ.TypeID) = (select max(SlCauHoi) from sl);
END $$
DELIMITER ;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
Drop procedure if exists Store_Question5;
DELIMITER $$
CREATE PROCEDURE Store_Question5()
BEGIN
		with sl as(
		SELECT 
			Count(TQ.TypeID) as SlCauHoi
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID)
		SELECT 
			TypeName, Count(TQ.TypeID) as SlCauHoi
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID
			having Count(TQ.TypeID) = (select max(SlCauHoi) from sl);
END $$
DELIMITER ;

/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào */

/* Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
trong store sẽ tự động gán:

username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ

Sau đó in ra kết quả tạo thành công */

DROP PROCEDURE IF EXISTS sp_insertAccount;
DELIMITER $$
CREATE PROCEDURE sp_insertAccount
( IN var_Email VARCHAR(50),
IN var_Fullname VARCHAR(50))
BEGIN
DECLARE v_Username VARCHAR(50) DEFAULT SUBSTRING_INDEX(var_Email, '@', 1);
DECLARE v_DepartmentID TINYINT UNSIGNED DEFAULT 11;
DECLARE v_PositionID TINYINT UNSIGNED DEFAULT 1;
DECLARE v_CreateDate DATETIME DEFAULT now();
INSERT INTO `account` (`Email`, `Username`, `FullName`,
`DepartmentID`, `PositionID`, `CreateDate`)
VALUES (var_Email, v_Username, var_Fullname,
v_DepartmentID, v_PositionID, v_CreateDate);
END$$
DELIMITER ;

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

Drop procedure if exists Store_Question8;
DELIMITER $$
CREATE PROCEDURE Store_Question8 ( IN NhapTypeName varchar(50))
BEGIN
	SELECT 
		max(length(content))
	FROM
		TypeQuestion TQ
		join 
		Question Q on TQ.TypeID = Q.TypeID
		where TypeName = NhapTypeName;
END $$
DELIMITER ;












