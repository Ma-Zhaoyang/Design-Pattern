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

			String sql ="delete from student where ����=" +"'"+ name +"'";
					//"delete from student where ����='" + name + "'";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			System.out.println(name);
			System.out.println("ɾ���ɹ�");
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("��������ȷ�ı���" + e);
			System.out.println("����ʧ��2");
		}
	}
}
