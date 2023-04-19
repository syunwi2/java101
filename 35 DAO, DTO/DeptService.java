package dao;

import java.util.List;

public interface DeptService {

	//전체조회
	public abstract List<DeptDTO> findAll();
	//deptno로 조회
	public abstract DeptDTO findByDeptno();
	//loc로 조회
	public List<DeptDTO> findByLoc();
	
}