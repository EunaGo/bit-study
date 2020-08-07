package com.openproject.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import com.openproject.mvc.model.RegRequest;

@Repository
public class MemberDao {

	private MemberDao() {}

	private static MemberDao dao = new MemberDao();

	public static MemberDao getInstance() {
		return dao;
	}

	public int insertMember(Connection conn, RegRequest reg) throws SQLException {
		int resultCnt = 0;

		PreparedStatement pstmt = null;
		String sql = "INSERT INTO test.member (uid, upw, uname, uphoto ) VALUES (?,?,?,?)";
		System.out.println(reg);
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reg.getUid());
			pstmt.setString(2, reg.getUpw());
			pstmt.setString(3, reg.getUname());
			

			resultCnt = pstmt.executeUpdate();

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}

		return resultCnt;
	}
}
