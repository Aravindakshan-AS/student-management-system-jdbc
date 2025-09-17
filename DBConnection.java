import java.sql.*;

public class DBConnection {
	private static String url = "jdbc:mysql://localhost:3306/studentdb";
	private static String user = "root";
	private static String pass = "pass";
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

