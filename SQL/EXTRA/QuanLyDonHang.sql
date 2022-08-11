Drop database if exists QuanLyGiaoHangNhanh;
Create database QuanLyGiaoHangNhanh;
use QuanLyGiaoHangNhanh;

Create table LOAIMAHANG( 
MaLoaiMaHang Char(10) primary key,
TenLoaiMaHang Varchar(50)
);

Create table DICHVU (
MaDichVu char(10) primary key,
TenDichVu varchar(50)
);

Create table KHUVUC (
MaKhuVuc char(10) primary key,
TenKhuVuc varchar(255)
);

CREATE TABLE KHOANGTHOIGIAN (
MaKhoangThoiGian char(10) primary key,
MaTa varchar(255)
);

Create table THANHVIENGIAOHANG(
MaThanhVienGiaoHang char(10) primary key,
TenThanhVienGiaoHang varchar(50),
NgaySinh date,
GioiTinh enum('Nam', 'Nu'),
SoDtThanhVien int,
DiaChiThanhVien varchar(255)
);

Create table DANGKYGIAOHANG (
MaThanhVienGiaoHang char(10),
foreign key (MaThanhVienGiaoHang) references THANHVIENGIAOHANG(MaThanhVienGiaoHang) on delete cascade,
MaKhoangThoiGianDKGiaoHang char(10),
foreign key (MaKhoangThoiGianDKGiaoHang) references KHOANGTHOIGIAN(MaKhoangThoiGian) on delete cascade,
primary key(MaThanhVienGiaoHang, MaKhoangThoiGianDKGiaoHang)
);


Create table CHITIET_DONHANG (
MaDonHangGiaoHang char(10),
TenSanPhamDuocGiao char(50),
SoLuong int,
TrongLuong int,
MaLoaiMatHang char(10),
foreign key (MaLoaiMatHang) references LOAIMAHANG(MaLoaiMaHang) on delete cascade,
TienThuHo int,
primary key (MaDonHangGiaoHang, TenSanPhamDuocGiao)
);



CREATE TABLE KHACHHANG (
MaKhachHang char(10) primary key,
MaKhuVuc char(10),
foreign key (MaKhuVuc) references KHUVUC(MaKhuVuc) on delete cascade,
TenKHangHang varchar(50),
TenCuaHang varchar(50),
SoDtKhachHang int,
DiaChiEmail varchar(50),
DiaChiNhanHang varchar(50)
);

CREATE TABLE DONHANG_GIAOHANG (
MaDonHangGiaoHang char(10) primary key,
MaKhachHang char(10),
foreign key (MaKhachHang) references KHACHHANG(MaKhachHang) on delete cascade,
MaThanhVienGiaoHang char(10),
foreign key (MaThanhVienGiaoHang) references THANHVIENGIAOHANG(MaThanhVienGiaoHang) on delete cascade,
MaDichVu char(10),
foreign key (MaDichVu) references DICHVU(MaDichVu) on delete cascade,
MaKhuVucGiaoHang char(10),
foreign key (MaKhuVucGiaoHang) references KHUVUC(MaKhuVuc) on delete cascade,
TenNguoiNhan varchar(50),
DiaChiGiaoHang varchar(255),
SoDtNguoiNhan int,
MaKhoangThoiGianGiaoHang char(10),
foreign key (MaKhoangThoiGianGiaoHang) references KHOANGTHOIGIAN(MaKhoangThoiGian) on delete cascade,
NgayGiaoHang date,
PhuongThucThanhToan enum('Tien mat', 'Chuyen khoan'),
TrangThaiPheDuyet varchar(50),
TrangThaiGiaoHang varchar(50)
);

insert into LOAIMAHANG values ('MH001', 'Quần áo'),
							('MH002', 'Mỹ phẩm'),
                            ('MH003', 'Đồ gia Dụng'),
                            ('MH004', 'Đồ điện tử');
                            
insert into DICHVU values ('DV001', 'Giao hang nguoi nhan tra tien phi'),
						('DV002', 'Giao hang nguoi gui tra tien phi'),
                        ('DV003', 'Giao hang cong ich (khong tien phi)');

insert into KHUVUC values ('KV001', 'Son Tra'),
						('KV002', 'Lien Chieu'),
                        ('KV003', 'Ngu Hanh Son'),
                        ('KV004', 'Hai Chau'),
                        ('KV005', 'Thanh Khe');
                        
insert into KHOANGTHOIGIAN values ('TG001', '7h - 9h AM'),
								('TG002', '9h - 11h AM'),
                                ('TG003', '1h - 3h PM'),
                                ('TG004', '3h - 5h PM'),
                                ('TG005', '7h - 9h30 PM');

insert into THANHVIENGIAOHANG values ('TV0001', 'Nguyen Van A', '1995-11-20', 'Nam', '090511111', '23 Ong Ich Khiem'),
									('TV0002', 'Nguyen Van B', '1996-11-20', 'Nu', '090511111', '234 Ton Duc Thang'),
                                    ('TV0003', 'Nguyen Van C', '1997-11-20', 'Nu', '090511111', '45 Hoang Dieu'),
                                    ('TV0004', 'Nguyen Van D', '1998-11-20', 'Nam', '090511111', '3 Ngu Hanh Son'),
                                    ('TV0005', 'Nguyen Van E', '1999-11-20', 'Nam', '090511111', '23 Dinh Thi Dieu');
                                    
insert into DANGKYGIAOHANG values ('TV0001', 'TG004'),
									('TV0002', 'TG005'),
                                    ('TV0003', 'TG001'),
                                    ('TV0003', 'TG002'),
                                    ('TV0003', 'TG003');

insert into KHACHHANG values ('KH001', 'KV001', 'Le Thi A', 'Cua Hang 1', 092344444, 'ac@gmail.com', '80 Pham Phu Thai'),
							('KH002', 'KV001', 'Le Thi B', 'Cua Hang 2', 092344444, 'ac@gmail.com', '800 Pham TU'),
                            ('KH003', 'KV002', 'Le Thi C', 'Cua Hang 3', 092344444, 'ac@gmail.com', '23 AN THUONG'),
                            ('KH004', 'KV002', 'Le Thi D', 'Cua Hang 4', 092344444, 'ac@gmail.com', '67 Ngo The Thai'),
                            ('KH005', 'KV001', 'Le Thi E', 'Cua Hang 5', 092344444, 'ac@gmail.com', '100 Chau Thi Vinh');
                            
insert into DONHANG_GIAOHANG values
('DH0001', 'KH001', 'TV0001', 'DV001', 'KV001', 'Phan Van A', '30 Hoang Van Thu', 09834444, 'TG004', '2016-10-10', 'Tien mat', 'Da phe duyet', 'Da giao hang'),
('DH0002', 'KH001', 'TV0002', 'DV001', 'KV005', 'Phan Van B', '45 Hoang Thai', 09834444, 'TG005', '2017-10-10', 'Tien mat', 'Da phe duyet', 'Chua giao hang'),
('DH0003', 'KH002', 'TV0003', 'DV001', 'KV005', 'Phan Van C', '67 Nguyen Van Thu', 09834444, 'TG001', '2015-10-10', 'Tien mat', 'Da phe duyet', 'Da giao hang'),
('DH0004', 'KH003', 'TV0001', 'DV003', 'KV002', 'Phan Van D', '12 Tran Van Tuan', 09834444, 'TG002', '2018-10-10', 'Chuyen khoan', 'Da phe duyet', 'Da giao hang'),
('DH0005', 'KH003', 'TV0005', 'DV003', 'KV003', 'Phan Van E', '90 Hoang Van Thu', 09834444, 'TG003', '2016-11-10', 'Chuyen khoan', 'Chua phe duyet', 'NULL');
                            
insert into CHITIET_DONHANG values ('DH0001', 'Ao len', 2, 0.5, 'MH001', 200000),
									('DH0001', 'Quan au', 1, 0.25, 'MH001', 350000),
                                    ('DH0002', 'Ao thun', 1, 0.25, 'MH001', 1000000),
                                    ('DH0002', 'Ao khoac', 3, 0.25, 'MH001', 2000000),
                                    ('DH0003', 'Sua duong the', 2, 0.5, 'MH002', 780000),
                                    ('DH0003', 'Kem tay da chet', 4, 0.5, 'MH002', 150000),
                                    ('DH0003', 'Kem duong ban dem', 3, 0.25, 'MH002', 900000);

                            







