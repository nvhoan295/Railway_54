package com.vti.entity;

public class CategoryQuestion {
	private int id;
	private CategoryName name;

	public enum CategoryName {
		JAVA, DOT_NET, SQL, POSTMAN, RUBY
	}

	public CategoryQuestion(int id, CategoryName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoryName getName() {
		return name;
	}

	public void setName(CategoryName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CategoryQuestion [id=" + id + ", name=" + name + "]";
	}

}
