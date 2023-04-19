package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "SCOTT";
		String pw = "TIGER";
		
		//===== 1. 드라이버 로딩 =====
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//===== 2. 연결, 커넥션 맺기 =====
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "insert into dept(deptno, dname, loc) values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			
			int n = pstmt.executeUpdate();
			
			System.out.println(n + "개가 저장되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}

}
