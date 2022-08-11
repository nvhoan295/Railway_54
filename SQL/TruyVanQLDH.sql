use QuanLyGiaoHangNhanh;
-- Câu 1: Xóa những khách hàng có tên là “Le Thi A”.
delete from KHACHHANG
where TenKhachHang = 'Le Thi A';

-- Câu 2: Cập nhật những khách hàng đang thường trú ở khu vực “Son Tra” thành khu vực “Ngu Hanh Son”.
update KHUVUC
set TenKhuVuc = 'Ngu Hanh Son'
where TenKhuVuc = 'Son Tra';
-- Câu 3: Liệt kê những thành viên (shipper) có họ tên bắt đầu là ký tự ‘Tr’ và có độ dài ít nhất là 25 ký tự (kể cả ký tự trắng).
select * from THANHVIENGIAOHANG
where TenThanhVienGiaoHang like 'Ng%' and length(TenThanhVienGiaoHang) >=10;


-- Câu 4: Liệt kê những đơn hàng có NgayGiaoHang nằm trong năm 2017 và có khu vực giao hàng là “Hai Chau”.
SELECT 
    DG.MaDonHangGiaoHang, DG.MaKhuVucGiaoHang, K.TenKhuVuc
FROM
    DONHANG_GIAOHANG DG
    join
    KHUVUC K ON DG.MaKhuVucGiaoHang = K.MaKhuVuc
WHERE
    YEAR(NgayGiaoHang) = 2017 
    AND K.TenKhuVuc = 'Hai Chau';
    
/* Câu 5: Liệt kê MaDonHangGiaoHang, MaThanhVienGiaoHang, TenThanhVienGiaoHang,
NgayGiaoHang, PhuongThucThanhToan của tất cả những đơn hàng có trạng thái là “Da giao
hang”. Kết quả hiển thị được sắp xếp tăng dần theo NgayGiaoHang và giảm dần theo
PhuongThucThanhToan */
SELECT 
    DG.MaDonHangGiaoHang, DG.MaThanhVienGiaoHang, TenThanhVienGiaoHang, DG.NgayGiaoHang, DG.PhuongThucThanhToan
FROM
    DONHANG_GIAOHANG DG
    JOIN 
    THANHVIENGIAOHANG T ON DG.MaThanhVienGiaoHang = T.MaThanhVienGiaoHang
    ORDER BY NgayGiaoHang ASC;
    
-- Câu 6: Liệt kê những thành viên có giới tính là “Nam” và chưa từng được giao hàng lần nào
SELECT 
   T.MaThanhVienGiaoHang, TenThanhVienGiaoHang
FROM
    DONHANG_GIAOHANG DG
    RIGHT JOIN 
    THANHVIENGIAOHANG T ON DG.MaThanhVienGiaoHang = T.MaThanhVienGiaoHang
    WHERE GioiTinh = 'Nam'
    and DG.MaThanhVienGiaoHang is null
;

/* Câu 7: Liệt kê họ tên của những khách hàng đang có trong hệ thống. Nếu họ tên trùng nhau
thì chỉ hiển thị 1 lần. Học viên cần thực hiện yêu cầu này bằng 2 cách khác nhau (mỗi cách
được tính 0.5 điểm) */

SELECT 
    TenKhachHang
FROM
    KHACHHANG
    group by TenKhachHang;
    
/* Câu 8: Liệt kê MaKhachHang, TenKhachHang, DiaChiNhanHang, MaDonHangGiaoHang,
PhuongThucThanhToan, TrangThaiGiaoHang của tất cả các khách hàng đang có trong hệ
thống */
SELECT 
    K.MaKhachHang, TenKhachHang, DiaChiNhanHang, MaDonHangGiaoHang, PhuongThucThanhToan, TrangThaiGiaoHang
FROM
    KHACHHANG K
LEFT JOIN
	DONHANG_GIAOHANG D ON K.MaKhachHang = D.MaKhachHang;
    
/* Câu 9: Liệt kê những thành viên giao hàng có giới tính là “Nu” và từng giao hàng cho 10
khách hàng khác nhau ở khu vực giao hàng là “Hai Chau” */
SELECT 
    T.MaThanhVienGiaoHang,TenThanhVienGiaoHang, COUNT(T.MaThanhVienGiaoHang)
FROM
    THANHVIENGIAOHANG T
    JOIN 
    DONHANG_GIAOHANG D ON T.MaThanhVienGiaoHang = D.MaThanhVienGiaoHang
where GioiTinh = 'Nu'
GROUP BY T.MaThanhVienGiaoHang
;

/* Câu 10: Liệt kê những khách hàng đã từng yêu cầu giao hàng tại khu vực “Lien Chieu” và
chưa từng được một thành viên giao hàng nào có giới tính là “Nam” nhận giao hàng */

