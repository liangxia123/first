package entity;
//ͼ����Ϣ��
public class book {
 private Integer id;
private String bookname;//����
 private String bookauthor;//����
 private String bookintro;//��ļ��
 private String bookplace;//���λ��
//���췽��
 
//�вι��췽��
public book(Integer id, String bookname, String bookauthor, String bookintro, String bookplace) {
	super();
	this.id = id;
	this.bookname = bookname;
	this.bookauthor = bookauthor;
	this.bookintro = bookintro;
	this.bookplace = bookplace;
}
//�޲εĹ��췽��
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
