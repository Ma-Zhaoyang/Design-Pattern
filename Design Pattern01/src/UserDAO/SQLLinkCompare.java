package UserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLLinkCompare {
	public static String str = "";
	//private Student student;
	private String nameString;
	private String codeString;

	public SQLLinkCompare(String name, String code) throws SQLException {
        nameString = name;
        codeString = code;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("连接成功1");
		} catch (Exception e) {
			System.out.println("连接失败1");
		}
		String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;" + "databaseName=teaching;" + "user=sa;"
				+ "password=123456789";
		Connection conn = null;// 处理与特定数据库的连接

		try {
			 conn = DriverManager.getConnection(connectionUrl);
				System.out.println("连接成功2");
				Statement stmt = conn.createStatement(
		        		ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		        String sql = "select * from link ";
		        ResultSet rs = stmt.executeQuery(sql);
		        if(rs.next())
		          str = rs.getString("password");
		        if (nameString.equals(str)) {
					System.out.println("登陆成功");
				}
		        rs.close();
		        stmt.close();
		        conn.close();
		        //System.out.println(str);
		} catch (SQLException e) {
			System.out.println("请输入正确的表名" + e);
			System.out.println("连接失败2");
		}
	}
}
