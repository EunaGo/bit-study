package member.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;

import member.dao.RequestDao;

import member.model.Request;
import service.Service;

public class MemberReqHistoryFormServiceImpl implements Service {

	RequestDao dao;
	List<Request> requestList = null;
	
	@Override
	public String getViewPage(HttpServletRequest req, HttpServletResponse resp) {
		
		Connection conn = null;
	
		try {

			conn = ConnectionProvider.getConnection();

			dao = RequestDao.getInstance();	
			
			requestList = dao.selectReqHistory(conn, 1);
			System.out.println("requestList: "+requestList);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
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

		req.setAttribute("requesthistory", requestList);
		
		return "/WEB-INF/views/member/reqhistory.jsp";
	}

}
