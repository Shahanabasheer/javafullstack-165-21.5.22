package javadatabase;
import java.sql.*;

public class DatabaseConnection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from customer_details");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
