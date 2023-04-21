package com.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;
import com.exception.RecordNotFoundException;

public class DeptServiceImpl implements DeptService{

	//////////////////////////////////
	// Connection 역할의 SqlSession 얻기
	// 프로그램 실행시 static 블럭이 실행된다.
	static SqlSessionFactory sqlSessionFactory;
    static {
    	String resource = "com/mybatis/Configuration.xml";
    	InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	sqlSessionFactory =
    	  new SqlSessionFactoryBuilder().build(inputStream);
    }//end static 블럭
    
    /*
	   SqlSession session = sqlSessionFactory.openSession();
		try {
			
		}finally {
			session.close();
		}
	*/
    
	@Override
	public List<DeptDTO> findAll() {
		// SqlSession이 JDBC버전의 Connection 역할이다. close 필수
		SqlSession session = sqlSessionFactory.openSession();
		List<DeptDTO> list = null;
		try {
			DeptDAO dao = new DeptDAO();
			list = dao.findAll(session);
			
		}finally {
			session.close();
		}
		
		return list;
	}
	
	@Override
	// mybatis는 auto commit 지원 안 하므로 꼭 커밋한다.
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.insert(session, dto);
			session.commit();
		} catch (Exception e) {
			throw new DuplicatedDeptnoException("부서번호 " + dto.getDeptno() + "이 이미 사용 중입니다.");
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int update(DeptDTO dto) throws RecordNotFoundException {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.update(session, dto);
			if (n == 0) {
				throw new RecordNotFoundException("해당되는 레코드가 존재하지 않습니다.");
			}
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	@Override
	public int delete(int deptno) throws RecordNotFoundException {
		SqlSession session = sqlSessionFactory.openSession();
		int n = 0;
		
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.delete(session, deptno);
			if (n == 0) {
				throw new RecordNotFoundException("해당되는 레코드가 존재하지 않습니다.");
			}
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	
}