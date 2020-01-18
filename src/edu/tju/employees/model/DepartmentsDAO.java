package edu.tju.employees.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.tju.employees.db.DBConnection;

public class DepartmentsDAO {
	/**
	 * 查询:返回全部部门
	 * @param emp
	 */
	public List<Departments> findAll() {		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		List<Departments> list = new ArrayList<Departments>(); 

		conn = DBConnection.getConnection();
		
		// TODO

		return list;
	}
	
	/**
	 * 增加
	 * @param dept
	 */
	public void insert(Departments dept) {
		
		String deptNo = dept.getDeptNo();
		String deptName = dept.getDeptName();
		assert deptNo != null;
		assert deptName != null;
		
		Connection conn = null;
		PreparedStatement stat = null;

		conn = DBConnection.getConnection();

		// TODO
	}
	
	/**
	 * 删除
	 * @param dept
	 */
	public void delete(Departments dept) {
		
		String deptNo = dept.getDeptNo();
		assert deptNo != null;
		
		Connection conn = null;
		PreparedStatement stat = null;

		conn = DBConnection.getConnection();
		
		// TODO
	}
	
	/**
	 * 修改
	 * @param dept
	 */
	public void update(Departments dept) {
		
		String deptNo = dept.getDeptNo();
		String deptName = dept.getDeptName();
		assert deptNo != null;
		assert deptName != null;
		
		Connection conn = null;
		PreparedStatement stat = null;

		conn = DBConnection.getConnection();

		// TODO
	}
	
	/**
	 * 查询:查找指定编号的员工（根据主键查找）
	 * @param emp
	 */
	public Departments query(String deptNo) {
		
		assert deptNo != null;
		
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		Departments dept = new Departments(); 

		conn = DBConnection.getConnection();
		
		// TODO

		return dept;
	}
}
