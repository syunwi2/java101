package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Dept 테이블 접근하는 객체
public class DeptDAO {

	
	public List<DeptDTO> findAll(Connection con) {
		
		List<DeptDTO> list = new ArrayList<>();
		// con 이용해서 DB 연동
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select deptno, dname, loc from dept";  // 반드시 ; 제외
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { //행 선택
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc); 
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//역순으로 close
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public DeptDTO findByDeptno() {
		return null;
	}
	public List<DeptDTO> findByLoc() {
		return null;
	}
	
	public void insert() {}
	public void update() {}
	public void delete() {}
}
