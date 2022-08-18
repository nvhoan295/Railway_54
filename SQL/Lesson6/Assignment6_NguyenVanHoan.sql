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
Create procedure Store_Question2 ( in TenGroup varchar(50))
begin
	SELECT 
		GroupName, count(CreatorID)
	FROM
		`Group` G
	left join
	GroupAccount GA on G.GroupID = GA.GroupID
    Where GroupName = TenGroup
	Group by G.GroupID;
end $$
delimiter ;

Call Store_Question2('Testing System');

-- Function

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
CREATE PROCEDURE Store_Question4(out out_TypeID int)
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
			Count(TQ.TypeID) as SlCauHoi into out_TypeID
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID
			having Count(TQ.TypeID) = (select max(SlCauHoi) from sl);
END $$
DELIMITER ;
 
 set @out_TypeID = 0;
 call Store_Question4(@out_TypeID);
 select @out_TypeID;


-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
Drop procedure if exists Store_Question5;
DELIMITER $$
CREATE PROCEDURE Store_Question5(out out_TypeName varchar(50))
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
			TypeName into out_TypeName
		FROM
			TypeQuestion TQ
			join
			Question Q on TQ.TypeID = Q.TypeID
			Group by TQ.TypeID
			having Count(TQ.TypeID) = (select max(SlCauHoi) from sl);
END $$
DELIMITER ;

set @out_TypeName = 0;
call Store_Question5(@out_TypeName);
select @out_TypeName;

/* Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào */

Drop procedure if exists Cau6;
delimiter $$
Create procedure Cau6 (in var_String varchar(50))
begin
	SELECT g.GroupName FROM `group` g 
	Where g.GroupName like Concat('%', var_String,'%')
	UNION
	SELECT a.Username FROM `account` a
	Where a.Username like concat('%', var_String, '%');
	end $$
delimiter ;

Call Cau6('sale');