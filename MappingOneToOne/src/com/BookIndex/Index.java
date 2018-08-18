package com.BookIndex;

public class Index {
	private Integer pageno;
	private String types;
	private Book book;
	private Integer bookid;
	
	
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Integer getPageno() {
		return pageno;
	}
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
}
