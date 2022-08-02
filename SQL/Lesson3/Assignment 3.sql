use Testing_System_Assignment_1;
-- Question 2: lấy ra tất cả các phòng ban
SELECT 
    *
FROM
    department;

-- Question 3: lấy ra id của phòng ban "Sale"
SELECT 
    *
FROM
    department
WHERE
    departmentName = 'Sale';

-- Question 4: lấy ra thông tin account có full name dài nhất

select * from Account
where length(Username) = (SELECT max(length(Username)) from Account);

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3
select * from Account
where (length(Username) = (SELECT max(length(Username)) from Account)) and DepartmentID = 3;

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 
    *
FROM
    Testing_System_Assignment_1.Group
WHERE
    CreateDate < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời
SELECT 
    QuestionID, COUNT(QuestionID) AS so_cau_tra_loi
FROM
    Answer
GROUP BY QuestionID
HAVING so_cau_tra_loi = 4;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019

SELECT 
    *
FROM
    exam
WHERE
    Duration >= 60
        AND CreateDate < '2019-12-20';
        
-- Question 9: Lấy ra 5 group được tạo gần đây nhất
SELECT 
    *
FROM
    Testing_System_Assignment_1.Group
ORDER BY CreateDate DESC
LIMIT 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2
SELECT 
    DepartmentID, COUNT(DepartmentID) as so_nhan_vien
FROM
    Account
WHERE
    DepartmentID = 2
GROUP BY DepartmentID;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT 
    *
FROM
    Account
WHERE
    FullName LIKE 'D%o'
;

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM Exam 
WHERE
    CreateDate < '2019-12-20';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE FROM Question 
WHERE
    Content LIKE 'câu hỏi %';

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE Account 
SET 
    FullName = 'Nguyễn Bá Lộc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
    
-- Question 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE Testing_System_Assignment_1.Group 
SET 
    creatorID = 5
WHERE
    GroupID = 4;




    

