package entity;

import java.sql.Date;

public class manager {
   private Integer id;
   private String managername;
   private String mnagerpassword;
   private Date entertime;

   
   
   public manager(Integer id, String managername, String mnagerpassword, Date entertime) {
	super();
	this.id = id;
	this.managername = managername;
	this.mnagerpassword = mnagerpassword;
	this.entertime = entertime;
}



public manager() {
	super();
}



public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public String getManagername() {
	return managername;
}



public void setManagername(String managername) {
	this.managername = managername;
}



public String getMnagerpassword() {
	return mnagerpassword;
}



public void setMnagerpassword(String mnagerpassword) {
	this.mnagerpassword = mnagerpassword;
}



public Date getEntertime() {
	return entertime;
}



public void setEntertime(Date entertime) {
	this.entertime = entertime;
}
	
	
	
	
}
