package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

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
		ResultSet rs = null;				// ResultSet: 결과 테이블 저장(column header 참조들을 저장)
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "select deptno, dname, loc from dept";		// SELECT -> ; 제외
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// execute(): Create 구문
			// executeQuery(): SELECT 구문, ResultSet 반환
			// executeUpdate(): Delete, Insert, Update 구문, 적용된 행의 개수 반환
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				
				System.out.println(deptno + " " + dname + " " + loc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// if rs(ResultSet) is null, RuntimeException is thrown.
				if(rs != null) {
					rs.close();
				}
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}

}
