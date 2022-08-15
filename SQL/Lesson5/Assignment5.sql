-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE OR REPLACE VIEW Question1 As
SELECT 
    a.*, DepartmentName
FROM
    department d
    join
    Account a on d.DepartmentID = a.DepartmentID
    where DepartmentName = 'sale';
    
select * from cau;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất

Create view Question2 as
SELECT 
      A.AccountID, Username, FullName,  COUNT(groupID) AS sl
    FROM
        Account A
    JOIN GroupAccount GA ON A.AccountID = GA.AccountID
    GROUP BY A.AccountID
    HAVING sl = (SELECT 
					MAX(sl)
				FROM
					(SELECT 
						COUNT(groupID) AS sl
					FROM
						Account A
					JOIN GroupAccount GA ON A.AccountID = GA.AccountID
					GROUP BY A.AccountID) as Bang);
                    
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi

Create or replace view Question3 as
SELECT 
    QuestionID, Content, length(Content) As DoDaiContent
FROM
    Question
where length(Content) >= 20;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW Question4 AS
    SELECT 
        D.DepartmentID,
        DepartmentName,
        COUNT(AccountID) AS SoLuongNhanVien
    FROM
        Department D
            JOIN
        Account A ON D.DepartmentID = A.DepartmentID
    GROUP BY D.DepartmentID
    HAVING SoLuongNhanVien = (SELECT 
								MAX(SoLuongNhanVien)
							FROM
								(SELECT 
									COUNT(AccountID) AS SoLuongNhanVien
								FROM
									Department D
								JOIN Account A ON D.DepartmentID = A.DepartmentID
								GROUP BY D.DepartmentID) AS Bang);

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
Create or REPLACE view Question5 as
SELECT 
    QuestionID, Content, FullName
FROM
    Question Q
    join 
Account A on Q.CreatorID = A.AccountID
where FullName like 'Nguyen%';
















