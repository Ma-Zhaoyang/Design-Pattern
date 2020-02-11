package StudentGrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLlinkChange {
	public static String str = "";
	private Student student;

	public SQLlinkChange(Student student) throws SQLException {

		this.student = student;
		student.See();

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

			String sql = "update student set 年龄='" + student.getAge() + 
					"' where 姓名='" + student.getName() + "'";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();

			System.out.println("修改成功");

			// rs.close();
			pstmt.close();
			conn.close();
			// System.out.println(str);
		} catch (SQLException e) {
			System.out.println("请输入正确的表名" + e);
			System.out.println("连接失败2");
		}
	}
}
