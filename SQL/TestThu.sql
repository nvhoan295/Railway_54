Drop database if exists Requirement1;
Create database Requirement1;
use Requirement1;
Create table Customer(
CustomerID int auto_increment primary key,
Name varchar(50),
Phone char(10),
Email varchar(50),
Address varchar(50),
Note varchar(255)
);

Create table Car(
CarID varchar(10) primary key,
Maker enum('HONDA', 'TOYOTA', 'NISSAN'),
Model varchar(50),
`Year` int,
Color enum('black','white', 'yellow', 'red'),
Note varchar(255)
);

CREATE TABLE CAR_ORDER(
OrderID int auto_increment primary key,
CustomerID int,
foreign key (CustomerID) references Customer(CustomerID),
CarID varchar(10),
foreign key (CarID) references Car(CarID),
Amount int default 1,
SalePrice int,
OrderDate date,
DeliveryDate date,
DeliveryAddress varchar(50),
Staus enum('0' , '1', '2') default '0',
Note varchar(255)
);

insert into Customer values (1, 'Nguyen Van A', 0982222222, 'nguyenvanA@gmail.com', 'Ha Noi', 'Mua lan dau'),
							(2, 'Nguyen Van B', 0982222333, 'nguyenvanB@gmail.com', 'Vinh Phuc', 'Mua lan 2'),
                            (3, 'Nguyen Van C', 0982222444, 'nguyenvanC@gmail.com', 'Hung Yen', 'Mua lan 2'),
                            (4, 'Nguyen Van D', 0982222555, 'nguyenvanD@gmail.com', 'Ha Noi', 'Mua lan dau'),
                            (5, 'Nguyen Van E', 0982222777, 'nguyenvanE@gmail.com', 'Ha Noi', 'Mua lan 2');
                            
insert into Car values ('Civic', 'HONDA', 'SEDAL', 2020, 'black','xe mới'),
						('CRV', 'HONDA', 'SUV', 2021, 'black','xe mới'),
                        ('Vios', 'TOYOTA', 'SEDAL', 2022, 'black','xe mới'),
                        ('Camry', 'TOYOTA', 'SEDAL', 2021, 'white','xe mới'),
                        ('CROSS', 'TOYOTA', 'SEDAL', 2022, 'red','xe mới'),
                        ('Navara', 'NISSAN', 'BAN TAI', 2022, 'yellow','xe mới');

INSERT INTO CAR_ORDER VALUES (1, 1, 'Civic', 100, 16000, '2022-11-12', '2022-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
							(2, 2, 'CRV', 110, 117000, '2021-5-12', '2021-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
                            (3, 3, 'Vios', 140, 10000, '2022-11-12', '2022-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
                            (4, 5, 'Camry', 150, 20000, '2022-11-12', '2022-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
                            (5, 4, 'CROSS', 110, 18000, '2022-11-12', '2022-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
                            (6, 2, 'Navara', 90, 11000, '2022-11-12', '2022-12-12', 'Ha Noi', '1', 'Da Thanh Toan'),
							(7, 2, 'Navara', 90, 11000, '2021-11-12', '2021-12-12', 'Ha Noi', '2', 'Da Thanh Toan'),
							(8, 2, 'Civic', 90, 11000, '2021-11-12', '2021-12-12', 'Ha Noi', '2', 'Da Thanh Toan'),
							(9, 2, 'CROSS', 90, 11000, '2021-11-12', '2021-12-12', 'Ha Noi', '2', 'Da Thanh Toan');
                            
                            
-- Trả lời Câu Hỏi

-- 2. Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã
-- mua và sắp sếp tăng dần theo số lượng oto đã mua.
SELECT 
    `Name`, count(OrderID) as SoXeDaMua
FROM
    Customer C
    left join CAR_ORDER O on C.CustomerID = O.CustomerID
    Group by C.CustomerID
    order by SoXeDaMua asc;
-- 3. Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều
-- oto nhất trong năm nay.
Drop Function if exists HangBanNhieuNhat;
Delimiter $$
Create Function HangBanNhieuNhat() returns varchar(50)
READS SQL DATA
DETERMINISTIC
Begin
	declare HangXeBanNhieuNhat varchar(50);
	with CTE_SL as (SELECT 
		Maker, count(O.CarID) as SL
	FROM
		CAR_ORDER O
		join
		Car C on O.CarID = C.CarID
		Group by Maker)
		SELECT 
		Maker into HangXeBanNhieuNhat
	FROM
		CAR_ORDER O
		join
		Car C on O.CarID = C.CarID
		Group by Maker
		having count(O.CarID) = ( Select max(SL) from CTE_SL);
	return HangXeBanNhieuNhat;
end $$
delimiter ;
Select HangBanNhieuNhat();

-- 4. Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của
-- những năm trước. In ra số lượng bản ghi đã bị xóa.
DROP PROCEDURE IF EXISTS CAU4;
DELIMITER $$
CREATE PROCEDURE CAU4()
BEGIN
	Select
	COUNT(OrderID)
	FROM
	CAR_ORDER
	WHERE Staus = '2'
	AND YEAR(OrderDate) < YEAR(NOW());
	DELETE FROM CAR_ORDER WHERE Staus = '2'
	AND YEAR(OrderDate) < YEAR(NOW());
END $$
DELIMITER ;

CALL CAU4();

-- 5. Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn
-- hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto
-- và tên hãng sản xuất.
Drop procedure if exists Cau5;
Delimiter $$
Create Procedure Cau5( in in_CustomerID int)
Begin
SELECT 
    Name, OrderID, Amount, Maker
FROM
    Customer Cu
    join
    CAR_ORDER O ON Cu.CustomerID = O.CustomerID
    join Car C on C.CarID = O.CarID
    where Cu.CustomerID = in_CustomerID;
end $$
delimiter ;

call Cau5(2);

-- 6 .Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ
-- vào database (DeliveryDate < OrderDate + 15).

DROP TRIGGER IF EXISTS Trigger_insertDate;
DELIMITER $$
CREATE TRIGGER Trigger_insertDate
BEFORE INSERT ON CAR_ORDER
FOR EACH ROW
BEGIN 
    if (NEW.DeliveryDate > Date_sub(new.OrderDate, interval -15 day)) then
		SIGNAL SQLSTATE'12345'
        SET MESSAGE_TEXT = 'NGAY KO HOP LE, DeliveryDate < OrderDate + 15';
	END IF;
END $$
DELIMITER ;


INSERT INTO CAR_ORDER VALUES (11, 1, 'Civic', 100, 16000, '2022-01-01', '2022-01-17', 'Ha Noi', '1', 'Da Thanh Toan');

