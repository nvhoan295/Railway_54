package Bang;

import Bang.GiangVien.HocVi;

public class Test {
	public static void main(String[] args) {
		HeDaoTao daiHoc = new HeDaoTao(1, "Đại Học", 4, 210);
		HeDaoTao caoDang = new HeDaoTao(2, "Cao Đẳng", 3, 150);

		System.out.println(daiHoc);
		System.out.println(caoDang);

		SinhVien sv1 = new SinhVien("sv1", "Nguyen Van A", "Ha Noi", daiHoc);
		SinhVien sv2 = new SinhVien("sv2", "Nguyen Van B", "Hưng Yên", caoDang);
		SinhVien sv3 = new SinhVien("sv3", "Nguyen Van C", "Bắc Ninh", daiHoc);
		SinhVien sv4 = new SinhVien("sv4", "Nguyen Van D", "Bắc Giang", daiHoc);
		SinhVien sv5 = new SinhVien("sv5", "Nguyen Van E", "Hà Nội", daiHoc);
		SinhVien sv6 = new SinhVien("sv6", "Nguyen Van F", "Hà Nội", daiHoc);

		GiangVien gv1 = new GiangVien("gv1", "Trần Nam", "Hà Nội", HocVi.TienSi, 10000000);
		GiangVien gv2 = new GiangVien("gv2", "Trần Sơn", "Bắc Ninh", HocVi.TienSi, 9000000);
		GiangVien gv3 = new GiangVien("gv3", "Phương Mai", "Hưng Yên", HocVi.ThacSi, 8000000);
		GiangVien gv4 = new GiangVien("gv4", "Lan Anh", "Yên Bái", HocVi.TienSi, 10000000);

		LopHoc l1 = new LopHoc(1, "CNTT", "Công nghệ thông tin", 2, gv4);
		LopHoc l2 = new LopHoc(2, "KT", "Kinh tế", 3, gv1);
		LopHoc l3 = new LopHoc(3, "QT", "Quản trị kinh doanh", 4, gv2);
		LopHoc l4 = new LopHoc(4, "TH", "Triết học", 5, gv3);
		
		SinhVien[] sinhViens = {sv1, sv2, sv3, sv4};
		l1.setSinhVien(sinhViens);
		
		
		
		
	}
}
