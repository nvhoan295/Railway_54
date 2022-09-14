package entity;


import java.util.Date;

public class Bao extends TaiLieu{
	private Date date;

	public Bao() {
		super();
	}

	public Bao(String id, String tenNXB, int soLuong) {
		super(id, tenNXB, soLuong);
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void input() {
		super.input();
		date = new Date();
				
	}
	
	
}
