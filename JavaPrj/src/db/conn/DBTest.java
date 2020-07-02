package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	public static void main(String args) throws SQLException {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "myuser";
		String passwd = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("접속성공");

		} catch (ClassNotFoundException e) {
			System.out.println("접속 실패");
			System.out.println("파일찾기 실페");
			System.out.println("이유 :" + e.toString());
		} catch (Exception e) {
			System.out.println("접속실패");
			System.out.println("최종오류");
			System.out.println("이유 :" + e.toString());
		} finally {
			if (conn != null) {
				conn = null;
			}
		}

	}

}
