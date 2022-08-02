
select AccountID,length(FullName) as dainhat from Account
ORDER BY dainhat desc
limit 1;

select max(length(FullName)) from Account;
select * from Account 
where length(FullName) = (select max(length(FullName)) from Account);
SELECT * FROM Testing_System_Assignment_1.Group;
select * from Testing_System_Assignment_1.Group
where CreateDate < '2020-12-20';
-- Câu 7
SELECT * FROM Testing_System_Assignment_1.Answer;
select QuestionID, count(QuestionID) from Answer
Group by QuestionID
having count(QuestionID) >=4;

-- Câu 8
select * from Exam
where Duration >= 60 and CreateDate < '2019-12-20';
-- Câu 9
SELECT * FROM Testing_System_Assignment_1.Group
order by CreateDate desc
limit 5;
-- Câu 10
SELECT * FROM Testing_System_Assignment_1.Account;
Select DepartmentId, count(DepartmentId) as So_Nhan_Vien from Account
where DepartmentId =2;

-- Câu 11
Select * from Account
where FullName like 'D%o';

-- Câu 12

delete from Exam
where CreateDate < '2019-12-20';

