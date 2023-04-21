package com.dao;

import java.util.List;
import com.exception.*;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public class DeptDAO {
//	int n = session.insert("mapper의 id값", 파라미터);
//	int n = session.delete("mapper의 id값", 파라미터);
//	int n = session.update("mapper의 id값", 파라미터);
	
	//결과가 여러개
//	List<DeptDTO> list =session.selectList("id값");
//	List<DeptDTO> list =session.selectList("id값", 파라미터);
//	List<DeptDTO> list =session.selectList("id값", 파라미터, RowBounds);
	
	//결과가 하나
//	DeptDTO dto = session.selectOne("id값");
//	DeptDTO dto = session.selectOne("id값", 파라미터);
	
	public List<DeptDTO> findAll(SqlSession session) {
		List<DeptDTO> list = session.selectList("com.mybatis.DeptMapper.findAll");
		return list;
	}
	
	public int insert(SqlSession session, DeptDTO dto) {
		int n = session.insert("insert", dto);
		return n;
	}
	
	public int update(SqlSession session, DeptDTO dto) {
		int n = session.update("update", dto);
		return n;
	}
	
	public int delete(SqlSession session, int deptno) {
		int n = session.delete("delete", deptno);
		return n;
	}
	
	
}
