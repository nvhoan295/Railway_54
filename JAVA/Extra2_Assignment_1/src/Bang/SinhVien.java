package Bang;

import java.security.Identity;

public class SinhVien {
	private String id;
	private String name;
	private String queQuan;
	private HeDaoTao heDaoTao;

	public SinhVien(String id, String name, String queQuan, HeDaoTao heDaoTao) {
		super();
		this.id = id;
		this.name = name;
		this.queQuan = queQuan;
		this.heDaoTao = heDaoTao;
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

	public HeDaoTao getHeDaoTao() {
		return heDaoTao;
	}

	public void setHeDaoTao(HeDaoTao heDaoTao) {
		this.heDaoTao = heDaoTao;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", queQuan=" + queQuan + ", heDaoTao=" + heDaoTao + "]";
	}
	
	public static String diHoc(SinhVien sinhVien) {
		return "Sinh viên "+ sinhVien.name + " hằng ngày đi học";
	}
	
	
}
