
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;





public class Shuju {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("�ɹ�");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("ʧ��");
		e.printStackTrace();
	}
	try {
		Connection con = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studb", "root", "admin");
		System.out.println("���ӳɹ�");
		Statement sta = (Statement) con.createStatement();
	int n= sta.executeUpdate("insert studentinfo values('106','GG','25','444')");
	System.out.println("����"+n+"��");
	
		
		ResultSet rs = (ResultSet) sta.executeQuery("select*from studentinfo");
		while (rs.next()) {
			String usersname = rs.getString("userName");
			String password = rs.getString("password");
			System.out.println(usersname + password);
			 
		}
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("�����쳣");
		e.printStackTrace();
	}

}
}
