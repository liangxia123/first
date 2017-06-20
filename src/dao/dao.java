package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//数据库连接
public abstract  class dao
{
	protected Connection conn;
	protected PreparedStatement pst;
	ResultSet rs=null;
	protected Connection getConnection() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","mysql");
		 
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败!");
		}catch (SQLException e) {
			System.out.println("数据库加载失败！");
		}
		
			 return conn;
   
}
   

//更新操作
protected int executUpdate(String sql,Object...obj)
{
  try {
	pst = getConnection().prepareStatement(sql);
	if(obj!=null)
	  {
		 for(int i=0;i<obj.length;i++) 
		 {
			pst.setObject(i+1,obj[i]); 
		 }
	  }
 }catch (SQLException e) {
	System.out.println("更新失败!");
}
  
  return 0;
  }

//查询操作
protected ResultSet executeQuery(String sql,Object...obj)
{
	try {
		pst=getConnection().prepareStatement(sql);
	if(obj!=null)
	{
		for(int i=0;i<obj.length;i++) 
		 {
			pst.setObject(i+1,obj[i]); 
		 }	
	}
	return pst.executeQuery();
	}
	catch (SQLException e) {
		System.out.println("查询失败！");
	}
   return null;
}
//关闭数据库
protected void closeAll(ResultSet rs,Statement sta,Connection conn)
{
try {
  if(rs!=null)
  {
 
	rs.close();
} 
  
  if(sta!=null)
  {
	sta.close();
  }
  if(conn!=null)
  {
	 conn.close();
  }
}
  catch (SQLException e) {
		System.out.println("关闭失败！");
	}	


}
}
  



