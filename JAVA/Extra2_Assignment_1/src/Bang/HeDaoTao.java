package Bang;

public class HeDaoTao {
	private int id;
	private String name;
	private int soNamDaoTao;
	private int soTinChi;

	public HeDaoTao(int id, String name, int soNamDaoTao, int soTinChi) {
		super();
		this.id = id;
		this.name = name;
		this.soNamDaoTao = soNamDaoTao;
		this.soTinChi = soTinChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSoNamDaoTao() {
		return soNamDaoTao;
	}

	public void setSoNamDaoTao(int soNamDaoTao) {
		this.soNamDaoTao = soNamDaoTao;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	@Override
	public String toString() {
		return "HeDaoTao [id=" + id + ", name=" + name + ", soNamDaoTao=" + soNamDaoTao + ", soTinChi=" + soTinChi
				+ "]";
	}

}
