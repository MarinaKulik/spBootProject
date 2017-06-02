package com.marina.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	int id;
	String author;
	String title;

	public Books() {
	}

	public Books(int id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
