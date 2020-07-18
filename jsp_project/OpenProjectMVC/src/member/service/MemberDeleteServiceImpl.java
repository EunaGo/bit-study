package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import member.dao.MemberDao;

import service.Service;

public class MemberDeleteServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			int idx = Integer.parseInt(request.getParameter("idx"));
		
			dao.deleteMember(conn, idx);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return "/WEB-INF/views/member/memberDelete.jsp";
	}

}
