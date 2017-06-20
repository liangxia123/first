package entity;

import java.sql.Date;

public class loansheet {
    private Integer id;
    private Integer bookid;
    private Integer readerid;
    private Date lendtime;
    private Date returntime;
    private Boolean bookstatus;
	
    
    
    public loansheet(Integer id, Integer bookid, Integer readerid, Date lendtime, Date returntime, Boolean bookstatus) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.readerid = readerid;
		this.lendtime = lendtime;
		this.returntime = returntime;
		this.bookstatus = bookstatus;
	}
	
    
    
    public loansheet() {
		super();
	}
	
    
    
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Integer getReaderid() {
		return readerid;
	}
	public void setReaderid(Integer readerid) {
		this.readerid = readerid;
	}
	public Date getLendtime() {
		return lendtime;
	}
	public void setLendtime(Date lendtime) {
		this.lendtime = lendtime;
	}
	public Date getReturntime() {
		return returntime;
	}
	public void setReturntime(Date returntime) {
		this.returntime = returntime;
	}
	public Boolean getBookstatus() {
		return bookstatus;
	}
	public void setBookstatus(Boolean bookstatus) {
		this.bookstatus = bookstatus;
	}
    
    
    
	
	
	
	
	
}
