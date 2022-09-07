package Bang;

public class GiangVien {
	private String id;
	private String name;
	private String queQuan;
	private HocVi hocVi;
	private int luong;

	public enum HocVi {
		ThacSi, TienSi
	}

	public GiangVien(String id, String name, String queQuan, HocVi hocVi, int luong) {
		super();
		this.id = id;
		this.name = name;
		this.queQuan = queQuan;
		this.hocVi = hocVi;
		this.luong = luong;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public HocVi getHocVi() {
		return hocVi;
	}

	public void setHocVi(HocVi hocVi) {
		this.hocVi = hocVi;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "GiangVien [id=" + id + ", name=" + name + ", queQuan=" + queQuan + ", hocVi=" + hocVi + ", luong="
				+ luong + "]";
	}

	public static void soanBai() {
		System.out.println("Giảng viên soạn bài trước khi lên lớp");
	}

	public static void huongDanDeTai() {
		System.out.println("Giảng viên hướng dẫn Sinh Viên làm Khoá luận");
	}
}
