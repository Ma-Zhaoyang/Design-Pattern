package StudentGrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLlinkDelete {
	public static String str = "";

	public SQLlinkDelete(String name) throws SQLException {

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

			PreparedStatement pstmt;

			String sql ="delete from student where 姓名=" +"'"+ name +"'";
					//"delete from student where 姓名='" + name + "'";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			System.out.println(name);
			System.out.println("删除成功");
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("请输入正确的表名" + e);
			System.out.println("连接失败2");
		}
	}
}
