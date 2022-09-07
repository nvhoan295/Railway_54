package Bang;

import java.util.Arrays;

public class LopHoc {
	private int id;
	private String tenLop;
	private String monHoc;
	private int thoiGianHoc;
	private SinhVien[] sinhVien;
	private GiangVien giangVien;

	
	public LopHoc() {
		super();
	}

	public LopHoc(int id, String tenLop, String monHoc, int thoiGianHoc, GiangVien giangVien) {
		super();
		this.id = id;
		this.tenLop = tenLop;
		this.monHoc = monHoc;
		this.thoiGianHoc = thoiGianHoc;
		this.giangVien = giangVien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public int getThoiGianHoc() {
		return thoiGianHoc;
	}

	public void setThoiGianHoc(int thoiGianHoc) {
		this.thoiGianHoc = thoiGianHoc;
	}

	public SinhVien[] getSinhVien() {
		return sinhVien;
	}

	public void setSinhVien(SinhVien[] sinhVien) {
		this.sinhVien = sinhVien;
	}

	public GiangVien getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}

	@Override
	public String toString() {
		return "LopHoc [id=" + id + ", tenLop=" + tenLop + ", monHoc=" + monHoc + ", thoiGianHoc=" + thoiGianHoc
				+ ", sinhVien=" + Arrays.toString(sinhVien) + ", giangVien=" + giangVien + "]";
	}

}
