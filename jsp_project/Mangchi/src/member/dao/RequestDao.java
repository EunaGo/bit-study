package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import member.model.Member;
import member.model.Request;

public class RequestDao {
	
	private RequestDao() { // 다른곳에서 생성 못함
	}

	private static RequestDao dao = new RequestDao();

	public static RequestDao getInstance() {
		return dao;
	}
	
	// 나의 렌탈 게시물
	public List<Request> selectReqHistory(Connection conn, int idx, int startRow, int endRow) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs;
		
		List<Request> list = new ArrayList();


		try {
			String sql = "select * from project.request_list where req_writer=? limit ?,?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Request req = new Request();
				req.setReq_idx(rs.getInt("req_idx"));
				req.setReq_title(rs.getString("req_title"));
				req.setReq_loc(rs.getString("req_loc"));
				req.setReq_price(rs.getInt("req_price"));
				req.setReq_status(rs.getInt("req_status"));
				req.setReq_regdate(rs.getDate("req_regdate"));
				list.add(req);
			}

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}

		return list;
	}
	
	// 나의 대여 게시물
	public List<Request> selectRntHistory(Connection conn, int idx) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs;
		
		List<Request> list = new ArrayList();


		try {
			String sql = "select * from project.request_list where req_helper=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Request req = new Request();
				req.setReq_idx(rs.getInt("req_idx"));
				req.setReq_title(rs.getString("req_title"));
				req.setReq_loc(rs.getString("req_loc"));
				req.setReq_price(rs.getInt("req_price"));
				req.setReq_status(rs.getInt("req_status"));
				req.setReq_regdate(rs.getDate("req_regdate"));
				list.add(req);
			}

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}

		return list;
	}
	
	// 모든 게시물
	public List<Request> selectAllrequest(Connection conn, int startRow, int endRow) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs;
		
		List<Request> list = new ArrayList();


		try {
			String sql = "select * from project.request_list limit ?,?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Request req = new Request();
				req.setReq_idx(rs.getInt("req_idx"));
				req.setReq_writer(rs.getInt("req_writer"));
				req.setReq_title(rs.getString("req_title"));
				req.setReq_loc(rs.getString("req_loc"));
				req.setReq_price(rs.getInt("req_price"));
				req.setReq_status(rs.getInt("req_status"));
				req.setReq_regdate(rs.getDate("req_regdate"));
				list.add(req);
			}

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}

		return list;
	}
	
	// 검색
	public List<Request> searchRequest(Connection conn, String sch ,int startRow, int endRow ) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs;
		
		List<Request> list = new ArrayList();

		try {

			String sql = "select * from project.request_list where req_title like '%"+sch+"%' limit ?,?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Request req = new Request();
				req.setReq_idx(rs.getInt("req_idx"));
				req.setReq_writer(rs.getInt("req_writer"));
				req.setReq_title(rs.getString("req_title"));
				req.setReq_loc(rs.getString("req_loc"));
				req.setReq_price(rs.getInt("req_price"));
				req.setReq_status(rs.getInt("req_status"));
				req.setReq_regdate(rs.getDate("req_regdate"));
				list.add(req);
			}

		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
		}

		return list;
	}
	
	public int selectTotalCount(Connection conn) throws SQLException {

		int resultCnt = 0;

		Statement stmt = null;
		ResultSet rs = null;

		try {

			stmt = conn.createStatement();
			String sql = "select count(*) from project.request_list";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				resultCnt = rs.getInt(1);
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return resultCnt;
	}
	
	public int selectTotalschCount(Connection conn, String sch) throws SQLException {

		int resultCnt = 0;

		Statement stmt = null;
		ResultSet rs = null;

		try {
			
			if(sch==null) {
				return resultCnt;
			}

			stmt = conn.createStatement();
			String sql = "select count(*) from project.request_list where req_title like '%"+sch+"%'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				resultCnt = rs.getInt(1);
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}

		return resultCnt;
	}


}
