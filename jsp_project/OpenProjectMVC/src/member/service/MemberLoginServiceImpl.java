package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.LoginInfo;
import service.Service;

public class MemberLoginServiceImpl implements Service {

	MemberDao dao;

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		int resultCnt = 0;
		
		LoginInfo logininfo = null;

		String uid = null;
		String upw = null;
		String result = "N";


		Connection conn = null;
		
		HttpSession session=request.getSession();

		try {


			conn = ConnectionProvider.getConnection();

			dao = MemberDao.getInstance();
			
			uid = request.getParameter("uid");
			upw = request.getParameter("upw");

			System.out.println("uid: "+uid+"upw: "+upw);
			logininfo = dao.confirmIdPw(conn, uid,upw);

			session.setAttribute("loginResult", logininfo);
			
			if(logininfo != null) {
				System.out.println("일치!!");
//				String result = "<script>"
//						+ "alert('아이디 또는 비밀번호가 틀립니다.');"
//						+ "history.go(-1);"
//						+ "</script>";
//				request.setAttribute("result", result);
//				return "/WEB-INF/views/member/memberLogForm.jsp";
				
				result = "Y";
			}
			
//			String result = "<script>"
//					+ "alert('로그인되었습니다.');"
//					+ "</script>";
//			request.setAttribute("result", result);


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
//		return "/WEB-INF/views/member/memberMypage.jsp";
		request.setAttribute("ajax", result);

		return "/WEB-INF/views/member/ajax.jsp";
	}

}
