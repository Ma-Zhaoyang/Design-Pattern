package StudentGrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLlinkInsert {
	public static String str = "";
	private Student student;

	public SQLlinkInsert(Student student) throws SQLException {

		this.student = student;
		student.See();

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("���ӳɹ�1");
		} catch (Exception e) {
			System.out.println("����ʧ��1");
		}
		String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;" + "databaseName=teaching;" + "user=sa;"
				+ "password=123456789";
		Connection conn = null;// �������ض����ݿ������

		try {
			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("���ӳɹ�2");
			// Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
			// ResultSet.CONCUR_UPDATABLE);

			PreparedStatement pstmt;

			/*
			 * String sql = "select * from link "; ResultSet rs = stmt.executeQuery(sql); if
			 * (rs.next()) str = rs.getString("password"); System.out.println(str);
			 */

			String sql = "insert into student(����,ѧ��,����,�༶)  values(?,?,?,?)";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getID());
			pstmt.setString(3, student.getAge());
			pstmt.setString(4, student.getClas());
			int i = pstmt.executeUpdate();

			System.out.println("�����ɹ�");

			// rs.close();
			pstmt.close();
			conn.close();
			// System.out.println(str);
		} catch (SQLException e) {
			System.out.println("��������ȷ�ı���" + e);
			System.out.println("����ʧ��2");
		}
	}
}