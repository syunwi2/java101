package com.service;

import java.util.List;

import com.dto.DeptDTO;
import com.exception.*;


public interface DeptService {
	
	public List<DeptDTO> findAll();
	
	//부서저장
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException;
	//부서 수정
	public int update(DeptDTO dto) throws RecordNotFoundException;
	//부서 삭제
	public int delete(int deptno) throws RecordNotFoundException;
}