package com.BookAuthor;

import java.util.Set;

public class Book {
	private Integer bookId;
	private String name;
	private String isbn;
	private Set child;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set getChild() {
		return child;
	}
	public void setChild(Set child) {
		this.child = child;
	}
	
	
}
