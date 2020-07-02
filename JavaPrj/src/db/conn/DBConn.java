package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	/**
	 * 오라클 DB와 연결하기
	 * 
	 * @return Connection 오라클 DB 연결 개체
	 */
	public static Connection getDBConnection() throws SQLException {

		Connection conn = null;
		String url = "jdbc:oracle:thin:@loaclhost:1521:orcl";
		String user = "myuser";
		String passwd = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("접속성공");
		} catch (ClassNotFoundException e) {
			System.out.println("접속실패");
			System.out.println("파일 찾기실페");
			System.out.println("이유 :" + e.toString());
		} catch (Exception e) {
			System.out.println("접속실패");
			System.out.println("최종 오류");
			System.out.println("이유 " + e.toString());
		}
		return conn;
	}

	/**
	 * 오라클 DB 접속 연결 해제
	 * 
	 * @param Connection 기존 오라클 DB와 연결된 자바 객체
	 */
	public static void DBClose(Connection nConn) throws SQLException {
		nConn.close();
	}

}
