-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước
Drop trigger if exists Trigger_CheckInsertGroup;
Delimiter $$
Create trigger Trigger_CheckInsertGroup
BEFORE insert on `Group` for each row
Begin
	Declare v_CreateDate Datetime;
    Set v_CreateDate = Date_sub( now(), interval 1 year);
		if (NEW.CreateDate <= v_CreateDate) then 
				signal SQLstate'12345'
                SET MESSAGE_TEXT = 'KHÔNG THÊM ĐƯỢC';
                END IF;
END $$
DELIMITER ;

INSERT INTO `Group` values (11, 'Hoan', 3, '2020-12-29 00:22:23');

/* Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
"Sale" cannot add more user"
Bước 1: Viết Trigger khi Insert dữ liệu vào bảng
Bước 2: Viết câu lênh Insert để Test dữ liệu */

Drop trigger if exists Trigger_NotAddUserToSale;
DELIMITER $$
CREATE TRIGGER Trigger_NotAddUserToSale
BEFORE INSERT ON `Account` for each row
BEGIN
	DECLARE v_depID tinyint;
    Select 
    departmentID into v_depID
    from Department d 
    where departmentName = 'Sale';
    IF(NEW.DepartmentID = v_depID) THEN
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
        END IF;
END $$
DELIMITER ;

INSERT INTO `Account`(DepartmentID) values (2);
    
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

DROP TRIGGER IF EXISTS TRIGGER_QUESTION3;
DELIMITER $$
CREATE TRIGGER TRIGGER_QUESTION3
BEFORE INSERT ON GroupAccount FOR EACH ROW
BEGIN
	DECLARE v_COUNT_GroupID int;
	SELECT 
    count(GA.GroupID) into v_COUNT_GroupID
    FROM GroupAccount GA
    Where GA.GroupID = NEW.GroupID;
    IF(v_COUNT_GroupID > 5) then
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'Quá 5 Cant add more User to This Group';
        END IF;
	END $$
DELIMITER ;

INSERT INTO GroupAccount values (1, 8, '2020-12-12 00:00:12');

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

DROP TRIGGER IF EXISTS TRIGGER_BaiThiToiDa10Cau;
DELIMITER $$
CREATE TRIGGER TRIGGER_BaiThiToiDa10Cau
BEFORE INSERT ON ExamQuestion FOR EACH ROW
BEGIN
	declare v_count_Question int;
    Select 
    count(EQ.ExamID) into v_count_Question
    from
    ExamQuestion EQ
    where EQ.ExamID = NEW.ExamID;
    IF (v_count_Question >10) THEN 
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'Num Question in this Exam is limited 10';
        END IF;
END $$
DELIMITER ;

/* Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
tin liên quan tới user đó */

Drop trigger if exists Trigger_DeleteAcount;
DELIMITER $$
CREATE TRIGGER Trigger_DeleteAcount
BEFORE DELETE ON `Account` for each row
begin
	declare v_email varchar(50);
    set v_email = 'admin@gmail.com';
    if ( old.Email = v_email) then
		signal sqlstate'12345'
        set message_text = 'Day la Admin, Khong xoa duoc';
        end if;
end $$
DELIMITER ;

DELETE FROM `Account` where Email = 'admin@gmail.com';

/* Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
vào departmentID thì sẽ được phân vào phòng ban "waiting Department" */


insert into Department values (13, 'waiting Department');

DROP TRIGGER IF EXISTS TRIGGER_QUESTION6;
DELIMITER $$
CREATE TRIGGER TRIGGER_QUESTION6
BEFORE INSERT ON `Account` for each row
Begin
	declare v_DepartmentID int;
    Select 
    D.DepartmentID into v_DepartmentID
    from Department D
    where D.DepartmentName = 'waiting Department';
    if ( New.DepartmentID is null) then 
		set new.DepartmentID = v_DepartmentID;
        end if;
end $$
DELIMITER ;

INSERT INTO `testingsystem`.`account` (`Email`, `Username`, `FullName`, `PositionID`,
`CreateDate`) VALUES ('1','1', '1', '1', '2019-07-15 00:00:00');
	
-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.

DROP TRIGGER IF EXISTS TRIGGER_QUESTION7;
DELIMITER $$
CREATE TRIGGER TRIGGER_QUESTION7
BEFORE INSERT ON Answer for each row
BEGIN
	DECLARE v_count_Question tinyint;
    Declare v_count_isCorrect tinyint;
		Select
		count(A.QuestionID) into v_count_Question
        from
		Answer A
		where A.QuestionID = NEW.QuestionID;
        Select 
        count(1) into v_count_isCorrect
        from
        Answer A
        Where
        A.QuestionID = NEW.QuestionID
        and A.isCorrect = New.isCorrect;
	if ( v_count_Question > 4 or v_count_isCorrect > 2) then 
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'Cant insert';
        end if;
end $$
DELIMITER ;

/* Question 8: Viết trigger sửa lại dữ liệu cho đúng:
Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database */

DROP TRIGGER IF EXISTS TRIGGER_QUESTION8;
DELIMITER $$
CREATE TRIGGER TRIGGER_QUESTION8
BEFORE INSERT ON `Account` for each row
BEGIN
	IF NEW.Gender = 'Nam' then
		SET NEW.Gender = 'M';
        ELSEIF NEW.Gender = 'Nữ' then
        SET NEW.Gender = 'F';
        ELSEIF NEW.Gender = 'Chưa xác định' then
        SET NEW.Gender = 'U';
	END IF;
END $$
DELIMITER ;

-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS TRIGGER_QUESTION9;
DELIMITER $$
CREATE TRIGGER TRIGGER_QUESTION9
BEFORE DELETE ON EXAM FOR EACH ROW
BEGIN
	DECLARE v_createDate datetime;
    Set v_createDate = Date_sub(now(), interval 2 day);
    if( OLD.CreateDate > v_createDate) then 
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'KHONG XOA DUOC';
        END IF;
END $$
DELIMITER ;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào

DROP TRIGGER IF EXISTS TRIGGER_CheckUpdateQues;
DELIMITER $$
CREATE TRIGGER TRIGGER_CheckUpdateQues
BEFORE UPDATE on Question
for each row
BEGIN 
	DECLARE v_CountQueByID tinyint;
    SET v_CountQueByID = -1;
    SELECT
    COUNT(1) INTO v_CountQueByID
    FROM ExamQuestion EQ
    WHERE EQ.QuestionID = NEW.QuestionID;
    IF( v_CountQueByID != -1) THEN
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'KHONG UPDATE DUOC';
        END IF;
END $$
DELIMITER ;

-- DELETE

DROP TRIGGER IF EXISTS Trigger_CheckDeleteQues;
DELIMITER $$
CREATE TRIGGER Trigger_CheckDeleteQues
BEFORE DELETE ON Question 
for each row
BEGIN
	DECLARE v_CountQuesByID tinyint;
    Set v_CountQuesByID = -1;
    SELECT 
    count(1) into v_CountQuesByID
    FROM
    ExamQuestion EQ
    where EQ.QuestionID = OLD.QuestionID;
	IF ( v_CountQuesByID != -1) THEN
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'KHONG XOA DUOC';
        END IF;
END $
DELIMITER ;

/* Question 12: Lấy ra thông tin exam trong đó:
Duration <= 30 thì sẽ đổi thành giá trị "Short time"
30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
Duration > 60 thì sẽ đổi thành giá trị "Long time" */

SELECT 
E.ExamID, E.Code, E.Title, Case 
								when Duration <= 30 then 'Short Time'
                                when Duration <= 60 then 'Medium Time'
                                Else 'Long time'
                                END as Duration
FROM Exam E;

/* Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
là the_number_user_amount và mang giá trị được quy định như sau:
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher */

Select 
Count(GA.AccountID) as SoLuongAcc, case
										when Count(GA.AccountID) <= 5 then 'Few'
                                        when Count(GA.AccountID) <= 20 then 'Normal'
                                        else 'Higher' end as the_number_user_amount
from
GroupAccount GA
Group by GA.GroupID;

/* Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
không có user thì sẽ thay đổi giá trị 0 thành "Không có User" */

SELECT 
    D.DepartmentID,
    CASE
        WHEN COUNT(AccountID) = 0 THEN 'Không có User'
        ELSE COUNT(AccountID)
    END AS SoLuongAcc
FROM
    Department D
        LEFT JOIN
    Account A ON D.DepartmentID = A.DepartmentID
GROUP BY D.DepartmentID;





































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    