package Bang;

public class LopHoc {
	private int id;
	private String tenLop;
	private String monHoc;
	private int thoiGianHoc;
	protected SinhVien[] sinhVien;
	private GiangVien giangVien;

	public LopHoc(int id, String tenLop, String monHoc, int thoiGianHoc, SinhVien[] sinhVien, GiangVien giangVien) {
		super();
		this.id = id;
		this.tenLop = tenLop;
		this.monHoc = monHoc;
		this.thoiGianHoc = thoiGianHoc;
		this.sinhVien = sinhVien;
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
				+ ", giangVien=" + giangVien + "]";
	}

}
