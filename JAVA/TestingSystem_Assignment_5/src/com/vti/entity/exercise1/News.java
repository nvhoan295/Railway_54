package com.vti.entity.exercise1;

import java.util.Scanner;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;

	private String content;
	private float averageRate;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Tin Tức Mới ");
		System.out.print("Nhập Title: ");
		this.title = scanner.nextLine();
		System.out.print("Nhập PublishDate: ");
		this.publishDate = scanner.nextLine();
		System.out.print("Nhập Author: ");
		this.author = scanner.nextLine();
		System.out.print("Nhập Content: ");
		this.content = scanner.nextLine();
		
		
		
		
		
	}
	@Override
	public void display() {
		System.out.println("Title: "+ this.title);
		System.out.println("PublishDate: "+ getPublishDate());
		System.out.println("Author: "+ getAuthor());
		System.out.println("Content: "+ getContent());
		System.out.println("AverageRate: "+ getAverageRate());
	}

	@Override
	public float calculate() {
		System.out.println("Nhập 3 Rate: ");
		Scanner scanner = new Scanner(System.in);
		int[] rates = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập: ");
			rates[i] = scanner.nextInt();
		}
		averageRate = (float)(rates[0] + rates[1] + rates[2]) / 3 ;
		System.out.println("Trung bình:  "+ averageRate);
		return averageRate;
		
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author
				+ ", content=" + content + ", averageRate=" + averageRate + "]";
	}
	
}
