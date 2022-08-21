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


/* Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
trong store sẽ tự động gán:
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
Sau đó in ra kết quả tạo thành công */

drop procedure if exists Store_Question7;
delimiter $$
Create procedure Store_Question7 
( in in_email varchar(50), 
in in_fullName varchar(50))
begin
	Declare v_Username varchar(50) Default SUBSTRING_INDEX(in_email, '@', 1);
    Declare v_DepartmentID tinyint unsigned default 11;
    Declare v_PositionID tinyint unsigned default 1;
    Declare v_CreateDate Datetime Default now();
    insert into `Account`(`Email`, `Username`, `FullName`, `DepartmentID`, `PositionID`, `CreateDate`) values
						(in_email, v_Username, in_fullName, v_DepartmentID, v_PositionID, v_CreateDate);
End $$
delimiter ;
    


-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

Drop Procedure if exists Store_Question8;
delimiter $$
Create Procedure Store_Question8 ( in in_TypeName varchar(50))
begin
	with CTE_Length as (SELECT 
		length(Content) as SoLuong
	FROM
		TypeQuestion TQ
	join
	Question Q on TQ.TypeID = Q.TypeID
    where TypeName = in_TypeName)
	SELECT 
		QuestionID, Content
	FROM
		TypeQuestion TQ
	join
	Question Q on TQ.TypeID = Q.TypeID
	having length(Content) = (Select max(SoLuong) from CTE_Length);
end $$
delimiter ;

call Store_Question8('Essay');
call Store_Question8('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
Drop Procedure if exists Store_Question9;
delimiter $$
create procedure Store_Question9 ( in in_ExamID int)
begin
	Delete from Exam
    where ExamID = in_ExamID;
end $$
delimiter ;

/* Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
chuyển về phòng ban default là phòng ban chờ việc */


Drop procedure if exists Store_Question11;
delimiter $$
Create procedure Store_Question11( in in_DepartmentName varchar(50))
Begin
	Declare v_DepartmentID int;
	Select
    DepartmentID into v_DepartmentID
    from Department
    Where DepartmentName = in_DepartmentName;
    Update `Account` set DepartmentID = 11 where DepartmentID = v_DepartmentID;
    delete from Department where DepartmentName = in_DepartmentName;
end $$
delimiter ;
call Store_Question11('Marketing');


-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
Drop procedure if exists Store_Question12;
Delimiter $$
Create procedure Store_Question12()
begin
	With CTE_Month as(
	Select 1 as Month union 
	Select 2 as Month union
	Select 3 as Month union
	Select 4 as Month union
	Select 5 as Month union
	Select 6 as Month union
	Select 7 as Month union
	Select 8 as Month union
	Select 9 as Month union
	Select 10 as Month union
	Select 11 as Month union
	Select 12 as Month)
	Select M.Month, count(month(Q.CreateDate)) as SL
	from CTE_Month M
	left join ( Select * from Question Q1 where year(Q1.CreateDate) = year(now()) ) Q
	on M.Month = month(Q.CreateDate)
	group by M.Month;
end $$
delimiter ;

/* Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6
tháng gần đây nhất
(Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong
tháng") */






