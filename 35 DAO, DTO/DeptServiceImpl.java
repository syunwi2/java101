package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptServiceImpl implements DeptService {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid="SCOTT";
	String passwd="TIGER";
	
	public DeptServiceImpl() {
		 try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}//end 생성자
	
	// 서비스에서는 Connection 만 얻는다.
	@Override
	public List<DeptDTO> findAll() {
		Connection con = null;
		List<DeptDTO> list = null;
		try {
			 con = DriverManager.getConnection(url, userid, passwd);
			 DeptDAO dao = new DeptDAO();
			 list = dao.findAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}//end findAll

	@Override
	public DeptDTO findByDeptno() {
		Connection con = null;
		try {
			 con = DriverManager.getConnection(url, userid, passwd);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<DeptDTO> findByLoc() {
		Connection con = null;
		try {
			 con = DriverManager.getConnection(url, userid, passwd);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}