package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import service.Service;

public class MemberLoginServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		int resultCnt = 0;

		String uid = null;
		String upw = null;

		Connection conn = null;

		try {


			conn = ConnectionProvider.getConnection();

			dao = MemberDao.getInstance();
			
			uid = request.getParameter("uid");
			upw = request.getParameter("upw");

			System.out.println("uid: "+uid+"upw: "+upw);
			resultCnt = dao.confirmIdPw(conn, uid,upw);

			request.setAttribute("result", resultCnt);
			
			if(resultCnt < 1) {
				System.out.println("불일치!!");
				return "/WEB-INF/views/member/memberLogForm.jsp";
			}


		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
		return "/WEB-INF/views/member/memberMypage.jsp";
	}

}
