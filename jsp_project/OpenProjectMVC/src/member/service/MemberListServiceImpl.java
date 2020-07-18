package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;
import member.model.MemberListView;
import service.Service;

public class MemberListServiceImpl implements Service {

	MemberDao dao;

	

	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {

		// 페이지 번호 -> 시작 행, 끝 행
		// dao -> List

		Connection conn = null;

		MemberListView listview = null;
		
		// 한 페이지에 표현할 메시지의 개수
		final int MESSAGE_COUNT_PER_PAGE = 3;

	
		try {

			conn = ConnectionProvider.getConnection();

			dao = MemberDao.getInstance();

			// 페이지의 전체 메시지 구하기
			List<Member> memberList = null;

			// 전체 메시지의 게수
			int memberTotalCount = dao.selectTotalCount(conn);
			
			// 현재 페이지 번호
			int pageNumber = 1;
			String page = request.getParameter("page");
			if (page != null) {
				try {
					pageNumber = Integer.parseInt(page);
				} catch (NumberFormatException e) {
					System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
				}
			}

			int startRow = 0;

			if (memberTotalCount > 0) {

				// 시작 행, 마지마 행
				startRow = (pageNumber - 1) * MESSAGE_COUNT_PER_PAGE ;
				

				memberList = dao.selectMemberList(conn, startRow, MESSAGE_COUNT_PER_PAGE);

			} else {
				pageNumber = 0;
				memberList = Collections.emptyList();
			}

			listview = new MemberListView(memberTotalCount, pageNumber, memberList, memberTotalCount, MESSAGE_COUNT_PER_PAGE, startRow); 

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

		request.setAttribute("listView", listview);

		return "/WEB-INF/views/member/memberList.jsp";
	}

}
