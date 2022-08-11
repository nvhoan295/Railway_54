use TestingSystem;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 
    AccountID, UserName, FullName, DepartmentName
FROM
    Account a
inner join Department d on a.DepartmentID = d.DepartmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010

SELECT 
    *
FROM
    Account
    where CreateDate > '2010-12-20';
    
-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT 
    AccountID, Username, FullName, PositionName
FROM
    Account a 
	JOIN `Position` p on a.PositionID = p.PositionID
    where PositionName = 'Dev'
    order by AccountID;
    
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 
    d.DepartmentID, DepartmentName, count(DepartmentName) as So_Luong_Nhan_Vien
FROM
    Department d
	JOIN
    Account a ON a.DepartmentID = d.DepartmentID
    GROUP BY DepartmentName
    having So_Luong_Nhan_Vien >= 3
    ORDER BY d.DepartmentID
    ;
    
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

SELECT 
    q.QuestionID, q.Content, COUNT(eq.ExamID) AS SoLan
FROM
    Question q
        LEFT JOIN
    ExamQuestion eq ON q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID
having SoLan = (select max(SoLan) from
				(SELECT 
					COUNT(eq.ExamID) AS SoLan
				FROM
					Question q
						LEFT JOIN
					ExamQuestion eq ON q.QuestionID = eq.QuestionID
				GROUP BY q.QuestionID) as Bang);
    
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 
    c.CategoryID, CategoryName, count(QuestionID) as SoLuong
FROM
    CategoryQuestion c
        JOIN
    Question q ON c.CategoryID = q.CategoryID
    group by c.CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT 
    q.QuestionID, Content, count(eq.ExamID)
FROM
    Question q
        left JOIN
    ExamQuestion eq ON q.QuestionID = eq.QuestionID
    Group by q.QuestionID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT 
    q.QuestionID, q.Content, COUNT(q.QuestionID) AS SoLanTraLoi
FROM
    Question q
        JOIN
    Answer a ON a.QuestionID = q.QuestionID
GROUP BY q.QuestionID
HAVING SoLanTraLoi = (SELECT 
							MAX(SoLanTraLoi)
						FROM
							(SELECT 
								COUNT(q.QuestionID) AS SoLanTraLoi
							FROM
								Question q
							JOIN Answer a ON a.QuestionID = q.QuestionID
							GROUP BY q.QuestionID) AS Bang);
    
    
-- Question 9: Thống kê số lượng account trong mỗi group
    SELECT 
    g.GroupID, g.GroupName, COUNT(a.GroupID) as SoLuongAccount
FROM
   `Group`  g
	left join GroupAccount a on g.GroupID = a.GroupID
    GROUP BY g.GroupID
    ;
    
-- Question 10: Tìm chức vụ có ít người nhất
SELECT 
    PositionName, COUNT(AccountID) AS SoLuong
FROM
    Position p
        JOIN
    Account a ON p.PositionID = a.PositionID
GROUP BY PositionName
having SoLuong = (SELECT MIN(SoLuong)
							from 
							(SELECT 
								COUNT(AccountID) AS SoLuong
							FROM
								Position p
									JOIN
								Account a ON p.PositionID = a.PositionID
							GROUP BY PositionName) AS BANG);

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT 
    d.DepartmentID,d.DepartmentName, p.PositionName, count(PositionName)
FROM
    Department d
	join Account a on d.DepartmentID = a.DepartmentID
    join Position p on a.PositionID = p.PositionID
    Group by d.DepartmentID, p.PositionID;
  
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question,
-- loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
SELECT 
    q.QuestionID, q.Content, CategoryId, CreatorID, a.Content
FROM
    Question q
    left join 
    Answer a on q.QuestionID = a.QuestionID;
    

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT 
    t.TypeID, TypeName, count(QuestionID) as SoCau
FROM
    TypeQuestion t
    join Question q on t.TypeID = q.TypeID
    group by t.TypeID;


-- Question 14:Lấy ra group không có account nào
SELECT 
    g.GroupID, GroupName, AccountID
FROM
    `Group` g
        LEFT JOIN
    GroupAccount ga ON g.GroupID = ga.GroupID
    where AccountID is null
    order by  g.GroupID;
    

    
-- Question 16: Lấy ra question không có answer nào
SELECT 
    q.QuestionID, q.Content, AnswerID
FROM
    Question q
    left join Answer a on q.QuestionID = a.QuestionID
    where AnswerID is null
    ;
    
-- Exercise 2: Union
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
SELECT 
    GA.AccountID, FullName, GroupID
FROM
    GroupAccount GA
    join Account A on GA.AccountID = A.AccountID
    where GroupID = 1;
    
-- b) Lấy các account thuộc nhóm thứ 3
SELECT 
    GA.AccountID, FullName, GroupID
FROM
    GroupAccount GA
    join Account A on GA.AccountID = A.AccountID
    where GroupID = 3;
    
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT 
    GA.AccountID, FullName, GroupID
FROM
    GroupAccount GA
    join Account A on GA.AccountID = A.AccountID
    where GroupID = 1
UNION
SELECT 
    GA.AccountID, FullName, GroupID
FROM
    GroupAccount GA
    join Account A on GA.AccountID = A.AccountID
    where GroupID = 3;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
SELECT 
    GroupName, count(GA.GroupID) as SoThanhVien
FROM
    GroupAccount GA
        JOIN
    `Group` G ON GA.GroupID = G.GroupID
    group by GroupName
    having SoThanhVien >= 5;

-- b) Lấy các group có nhỏ hơn 7 thành viên
SELECT 
    GroupName, count(GA.GroupID) as SoThanhVien
FROM
    GroupAccount GA
        JOIN
    `Group` G ON GA.GroupID = G.GroupID
    group by GroupName
    having SoThanhVien <7;

-- c) Ghép 2 kết quả từ câu a) và câu b)

SELECT 
    GroupName, count(GA.GroupID) as SoThanhVien
FROM
    GroupAccount GA
        JOIN
    `Group` G ON GA.GroupID = G.GroupID
    group by GroupName
    having SoThanhVien >= 5
    UNION ALL
    SELECT 
    GroupName, count(GA.GroupID) as SoThanhVien
FROM
    GroupAccount GA
        JOIN
    `Group` G ON GA.GroupID = G.GroupID
    group by GroupName
    having SoThanhVien <7;




