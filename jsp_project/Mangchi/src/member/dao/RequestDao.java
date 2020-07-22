package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	
	public List<Request> selectReqHistory(Connection conn, int idx) throws SQLException {

		PreparedStatement pstmt = null;
		ResultSet rs;
		
		List<Request> list = new ArrayList();


		try {
			String sql = "select * from project.request_list where req_writer=?";
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


}
