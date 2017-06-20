package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//���ݿ�����
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
			System.out.println("��������ʧ��!");
		}catch (SQLException e) {
			System.out.println("���ݿ����ʧ�ܣ�");
		}
		
			 return conn;
   
}
   

//���²���
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
	System.out.println("����ʧ��!");
}
  
  return 0;
  }

//��ѯ����
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
		System.out.println("��ѯʧ�ܣ�");
	}
   return null;
}
//�ر����ݿ�
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
		System.out.println("�ر�ʧ�ܣ�");
	}	


}
}
  



