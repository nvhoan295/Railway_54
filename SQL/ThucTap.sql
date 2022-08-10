Drop database if exists ThucTap;
create database ThucTap;
use ThucTap;
CREATE TABLE Khoa (
    maKhoa CHAR(10) PRIMARY KEY,
    tenKhoa CHAR(30),
    dienThoai CHAR(10)
);

CREATE TABLE GiangVien (
    maGv INT PRIMARY KEY,
    hoTenGv CHAR(30),
    luong DECIMAL(5 , 2 ),
    maKhoa CHAR(10),
    FOREIGN KEY (maKhoa)
        REFERENCES Khoa(maKhoa)
);
CREATE TABLE SinhVien (
    maSv INT PRIMARY KEY,
    hoTenSv CHAR(30),
    maKhoa CHAR(10),
    namsinh INT,
    quequan CHAR(30),
    FOREIGN KEY (maKhoa)
        REFERENCES Khoa(maKhoa)
);
CREATE TABLE DeTai (
    maDt CHAR(10) PRIMARY KEY,
    tenDt VARCHAR(255),
    kinhPhi INT,
    noiThucTap VARCHAR(255)
);
CREATE TABLE HuongDan (
    maSv INT PRIMARY KEY,
    maDt CHAR(10),
    maGv INT,
    ketQua DECIMAL(5 , 2 ),
    FOREIGN KEY (maSv) REFERENCES SinhVien(maSv),
    FOREIGN KEY (maDt) REFERENCES DeTai(maDt),
    FOREIGN KEY (maGv) REFERENCES GiangVien(maGv)
);

insert into Khoa values ('KT', 'Kinh Tế','0987654321'),
						('CNTT', 'Công Nghệ Thông Tin','098888888'),
                        ('QTKD', 'Quản Trị Kinh Doanh','096666666'),
                        ('DL', 'Địa Lý','096662222'),
                        ('QLTN', 'QLTN','096663333'),
                        ('CNSH', 'Công Nghệ Sinh Học','096667777');
                        
insert into GiangVien values (1, 'Nguyễn Văn A', 100.14, 'KT'),
							(2, 'Nguyễn Thị B', 120.14, 'CNTT'),
                            (3, 'Nguyễn Thanh Bình', 140.45, 'QTKD'),
                             (4, 'Nguyễn Thanh Nam', 140.45, 'DL'),
							(5, 'Nguyễn Thị Vân', 140.45, 'CNTT');

insert into SinhVien values (1, 'Lê Văn Nam', 'KT',2000, 'Hà Nôi'),
							(2, 'Trần Văn Thắng', 'CNTT',2001, 'Hà Nam'),
                            (3, 'Bá Ngọc Đạt', 'QTKD',2002, 'Thái Bình'),
                            (4, 'Bá Ngọc Dung', 'CNSH',2002, 'Thái Bình'),
                            (5, 'Bá Ngọc CHâu', 'CNTT',2002, 'Thái Bình');
                            
insert into DeTai values ('dt1', 'Kinh tế thị trường', 500, 'Viện Kinh tế'),
						('dt2', 'Ứng dụng CNTT vào NCKH', 650, 'Viện Công Nghệ'),
                        ('dt3', 'Quản trị doanh nghiệp trong thời đại 4.0', 790, 'Doanh Nghiệp'),
                        ('dt4', 'Cách mạng Công nghiệp', 600, 'Bộ TTTT'),
                         ('dt5', 'Biện chứng của tự nhiên', 600, 'Trường Đảng'),
                         ('dt6', 'Môi quan hệ giữa chất và lượng', 600, 'Bộ VH');
                        
insert into HuongDan values (1, 'dt1', 1, 100.12),
							(2, 'dt2', 2, 90.12),
                            (3, 'dt3', 3, 85.12),
							(4, 'dt4', 3, 85.12),
                            (5, 'dt4', 3, 95.12);
					
-- 2. Đưa ra thông tin gồm mã số, họ tênvà tên khoa của tất cả các giảng viên
SELECT 
    maGv, hoTenGV, tenKhoa
FROM
    GiangVien
        INNER JOIN
    Khoa ON GiangVien.maKhoa = Khoa.maKhoa;
    
-- 3. Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va QLTN’
SELECT 
    *
FROM
    GiangVien
        INNER JOIN
    Khoa ON GiangVien.maKhoa = Khoa.maKhoa
    where Khoa.maKhoa = 'DL' or Khoa.maKhoa ='QLTN';
-- 4. Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’
SELECT maKhoa, count(maKhoa)
from sinhVien
where maKhoa = 'CNTT'
group by maKhoa
order by maKhoa;
    
-- 5. Đưa ra danh sách gồm mã số, họ tênvà tuổi của các sinh viên khoa ‘Công nghệ thông tin’
SELECT 
   maSv, hoTenSv, tenKhoa
FROM
    SinhVien sv
inner join Khoa k on sv.maKhoa = k.maKhoa
where tenKhoa = 'Công Nghệ Thông Tin';

-- 6. Cho biết số giảng viên của khoa ‘CONG NGHE Thông Tin’
SELECT 
   gv.maKhoa, tenKhoa, count(maGv) as So_Luong_Giang_Vien
FROM
    GiangVien gv
    inner join Khoa k on gv.maKhoa = k.maKhoa
where tenKhoa = 'Công Nghệ Thông Tin'
group by maKhoa;

-- 7. Cho biết thông tin về sinh viên không tham gia thực tập
SELECT *
FROM SinhVien s
left join HuongDan h on h.maSv = s.maSv
where h.maDt is null;

-- 8. Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa
select k.maKhoa, k.tenKhoa, count(k.maKhoa) as So_Giang_Vien
from Khoa k
right join GiangVien g on k.maKhoa = g.maKhoa
GROUP BY k.maKhoa;

-- 9. Cho biết số điện thoại của khoa mà sinh viên có tên ‘Lê Văn Nam’ đang theo học
select hoTenSv, tenKhoa, dienThoai
from SinhVien s
inner join Khoa k on s.maKhoa = k.maKhoa
where hoTenSv = 'Lê Văn Nam';

-- 10. Cho biết mã số và tên của các đề tài do giảng viên ‘Nguyễn Thanh Bình’ hướng dẫn
select hoTenGV, h.madt, d.tenDt
from GiangVien g
join HuongDan h on g.maGv = h.maGV
join DeTai d on h.madt = d.madt
where hoTenGv = 'Nguyễn Thanh Bình';

-- 11. Cho biết tên đề tài không có sinh viên nào thực tập
select  d.maDt, TenDT
from SinhVien s 
right join HuongDan h on s.maSV = h.maSv
right join DeTai d on d.maDt = h.maDt
where hoTenSv is null;

-- 12. Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên.
select hoTenGv, count(hoTenGv) as GvHuongDan
from GiangVien g
left join HuongDan h on g.maGv = h.maGv
GROUP BY hoTenGv
having GvHuongDan >= 3;

-- 13. Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất
SELECT 
   *
FROM
    DeTai
where kinhPhi = (SELECT max(kinhPhi) from DeTai);

-- 14. Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập
SELECT 
    h.maDt, tenDt, COUNT(h.maDt) AS SinhVienDangKy
FROM
    HuongDan h
        LEFT JOIN
    DeTai d ON h.maDt = d.maDt
GROUP BY h.maDt
HAVING COUNT(h.maDt) >= 2;
    
-- 15. Đưa ra mã số, họ tên và điểm của các sinh viên khoa ‘CNTT và KT’
select
* 
from SinhVien s
left join HuongDan h on s.maSv = h.maSv
where maKhoa = 'CNTT' or 'KT'
;

-- 16. Đưa ra tên khoa, số lượng sinh viên của mỗi khoa
select tenKhoa, count(tenKhoa) as SoLuongSinhVien
from Khoa k
right join SinhVien s on k.maKhoa = s.maKhoa
GROUP BY tenKhoa
;
-- 17. Cho biết thông tin về các sinh viên thực tập tại quê nhà
-- 18. Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập
SELECT 
    *
FROM
    SinhVien s
        LEFT JOIN
    HuongDan h ON s.maSv = h.maSv
WHERE
    ketQua IS NULL;
    
-- 19. Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0
SELECT 
    *
FROM
    SinhVien s
left join HuongDan h on s.maSv = h.maSv
where ketQua = 0;


    

