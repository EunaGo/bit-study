package com.openproject.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.openproject.mvc.model.RegRequest;

import com.openproject.mvc.model.Member;

@Repository
public class JdbcTemplateMemberDao {

	private JdbcTemplateMemberDao() {}

	private static JdbcTemplateMemberDao dao = new JdbcTemplateMemberDao();

	public static JdbcTemplateMemberDao getInstance() {
		return dao;
	}
	
	@Inject
	JdbcTemplate jdbcTemplate;
	
	public int insertMember(Member m) throws SQLException {
		
		return jdbcTemplate.update("INSERT INTO test.member (uid, upw, uname, uphoto ) VALUES (?,?,?,?)", m.getUid(), m.getUpw(), m.getUname(), m.getUphoto());
	}
	

	public int selectTotalCount() throws SQLException {

//		int resultCnt = 0;
//		String sql="select count(*) from test.member";
//		resultCnt = jdbcTemplate.queryForObject(sql, Integer.class);
//		return resultCnt;
		
		return jdbcTemplate.queryForObject("select count(*) from test.member",Integer.class);
	}

	public List<Member> selectMemberList(Connection conn, int startRow, int endRow) throws SQLException {

//		List<Member> list = new ArrayList();
//		String sql = "select * from test.member limit ?,?";
//		list = jdbcTemplate.query(sql, new Object[] {startRow, endRow}, new MemberRowMapper());
//		return list;

		return jdbcTemplate.query("select * from test.member limit ?,?",new Object[] {startRow, endRow}, new MemberRowMapper());
		
	}
}
