package entity;
//图书信息类
public class book {
 private Integer id;
private String bookname;//书名
 private String bookauthor;//作者
 private String bookintro;//书的简介
 private String bookplace;//书的位置
//构造方法
 
//有参构造方法
public book(Integer id, String bookname, String bookauthor, String bookintro, String bookplace) {
	super();
	this.id = id;
	this.bookname = bookname;
	this.bookauthor = bookauthor;
	this.bookintro = bookintro;
	this.bookplace = bookplace;
}
//无参的构造方法
public book() {
	super();
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
 
 public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) {
	this.bookauthor = bookauthor;
}
public String getBookintro() {
	return bookintro;
}
public void setBookintro(String bookintro) {
	this.bookintro = bookintro;
}
public String getBookplace() {
	return bookplace;
}
public void setBookplace(String bookplace) {
	this.bookplace = bookplace;
}

 

}
