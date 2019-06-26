package it.houhong.jdbc.firstDay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test1(){
		String url      = "jdbc:mysql://localhost:3306/demo2";
		String userName = "root";
		String passWord = "1234";
		String sql      = "select *from good";
		 Connection connection=null;
		try {
			//注册链接
			Class.forName("com.mysql.jdbc.Driver");
			//获得链接
			connection = DriverManager.getConnection(url,userName,passWord);
			//获得sql的执行平台
			 Statement  cst = connection.createStatement();
			//执行查询语句
			 ResultSet result = cst.executeQuery(sql);
			 while (result.next()) {
				
				/*System.out.println(result.getString(1));*/
				System.err.print(result.getString(1));
				System.err.print(result.getString(2));
				System.err.print(result.getString(3));
				System.err.println("\n");
				/*System.out.println(result.getString(2));*/
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
