package entity;
 
public class reader {
   private Integer id;
   private String readername;//¶ÁÕßÃû×Ö
   private String readernumber;//¶ÁÕßÑ§ºÅ
   private String password;//¶ÁÕßµÇÂ½ÃÜÂë

   
   public reader(Integer id, String readername, String readernumber, String password) {
	super();
	this.id = id;
	this.readername = readername;
	this.readernumber = readernumber;
	this.password = password;
}


public reader() {
	super();
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getReadername() {
	return readername;
}


public void setReadername(String readername) {
	this.readername = readername;
}


public String getReadernumber() {
	return readernumber;
}


public void setReadernumber(String readernumber) {
	this.readernumber = readernumber;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}
   
   
   
   
	
	
	
}
