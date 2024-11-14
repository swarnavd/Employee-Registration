package com.register;
import java.sql.*;

public class LoginDao {
	String url="jdbc:mysql://localhost:3306/swarnav";
	String user="swarnav";
	String pass="swarnav";
	String sql="insert into registration values(?,?,?,?,?)";
	public boolean insertData(String name, String uname, String password, String address, String contact) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2,uname);
			st.setString(3,password);
			st.setString(4,address);
			st.setString(5,contact);
			int i=st.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}