package StudentGrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLlinkCheck {
	public static String str = "";
	// private Student student;

	public SQLlinkCheck() throws SQLException {

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

			String sql = "select * from student ";
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("============================");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
					System.out.print(rs.getString(i) + "\t");
					if ((i == 2) && (rs.getString(i).length() < 8)) {
						System.out.print("\t");
					}
				}
				System.out.println("\n");
			}
			System.out.println("��ѯ�ɹ�");

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
