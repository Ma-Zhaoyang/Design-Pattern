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

			PreparedStatement pstmt;

			String sql = "update student set ����='" + student.getAge() + 
					"' where ����='" + student.getName() + "'";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();

			System.out.println("�޸ĳɹ�");

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
