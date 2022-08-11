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
    DG.MaDonHangGiaoHang, DG.MaKhuVucGiaoHang, K.TenKhuVuc, NgayGiaoHang
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
    MaDonHangGiaoHang, DG.MaThanhVienGiaoHang, TenThanhVienGiaoHang, NgayGiaoHang, PhuongThucThanhToan, TrangThaiGiaoHang
FROM
    DONHANG_GIAOHANG DG
    join
    THANHVIENGIAOHANG T on DG.MaThanhVienGiaoHang = T.MaThanhVienGiaoHang
    where TrangThaiGiaoHang = 'Da giao hang'
    order by NgayGiaoHang asc,
    PhuongThucThanhToan desc;
    
-- Câu 6: Liệt kê những thành viên có giới tính là “Nam” và chưa từng được giao hàng lần nào
SELECT 
   T.MaThanhVienGiaoHang, TenThanhVienGiaoHang, MaDonHangGiaoHang, GioiTinh
FROM
    THANHVIENGIAOHANG T
    LEFT JOIN 
   DONHANG_GIAOHANG D ON T.MaThanhVienGiaoHang = D.MaThanhVienGiaoHang
   WHERE GioiTinh = 'Nam' and
   MaDonHangGiaoHang is null;
   
/* Câu 7: Liệt kê họ tên của những khách hàng đang có trong hệ thống. Nếu họ tên trùng nhau
thì chỉ hiển thị 1 lần. Học viên cần thực hiện yêu cầu này bằng 2 cách khác nhau (mỗi cách
được tính 0.5 điểm) */
SELECT 
    TenKhachHang
FROM
    KHACHHANG
GROUP BY TenKhachHang;

/* Câu 8: Liệt kê MaKhachHang, TenKhachHang, DiaChiNhanHang, MaDonHangGiaoHang,
PhuongThucThanhToan, TrangThaiGiaoHang của tất cả các khách hàng đang có trong hệ
thống */

SELECT 
    K.MaKhachHang, TenKhachHang, DiaChiNhanHang, MaDonHangGiaoHang, PhuongThucThanhToan, TrangThaiGiaoHang
FROM
    KHACHHANG K
    LEFT JOIN
    DONHANG_GIAOHANG D ON K.MaKhachHang = D.MaKhachHang;
    
/* Câu 9: Liệt kê những thành viên giao hàng có giới tính là “Nu” và từng giao hàng cho 5
khách hàng khác nhau ở khu vực giao hàng là “Hai Chau” */

SELECT 
	T.MaThanhVienGiaoHang, GioiTinh, TenKhuVuc
FROM
    THANHVIENGIAOHANG T
    JOIN
    DONHANG_GIAOHANG D ON T.MaThanhVienGiaoHang = D.MaThanhVienGiaoHang
    JOIN
    KHUVUC K ON D.MaKhuVucGiaoHang = K.MaKhuVuc
    WHERE GioiTinh = 'Nu' AND TenKhuVuc = 'Hai Chau'
    GROUP BY T.MaThanhVienGiaoHang
    HAVING COUNT(T.MaThanhVienGiaoHang) >= 5;
    
/* Câu 10: Liệt kê những khách hàng đã từng yêu cầu giao hàng tại khu vực “Hai Chau” và
chưa từng được một thành viên giao hàng nào có giới tính là “Nam” nhận giao hàng */
SELECT 
    TenKhachHang, GioiTinh, TenKhuVuc
FROM
    KHACHHANG K
        LEFT JOIN
    DONHANG_GIAOHANG D ON K.MaKhachHang = D.MaKhachHang
        JOIN
    KHUVUC KV ON D.MaKhuVucGiaoHang = KV.MaKhuVuc
    JOIN
    THANHVIENGIAOHANG T ON T.MaThanhVienGiaoHang = D.MaThanhVienGiaoHang
WHERE
    TenKhuVuc = 'Hai Chau' AND
    GioiTinh != 'Nam';










