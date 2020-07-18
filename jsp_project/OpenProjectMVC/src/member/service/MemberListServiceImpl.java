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

		// ������ ��ȣ -> ���� ��, �� ��
		// dao -> List

		Connection conn = null;

		MemberListView listview = null;
		
		// �� �������� ǥ���� �޽����� ����
		final int MESSAGE_COUNT_PER_PAGE = 3;

	
		try {

			conn = ConnectionProvider.getConnection();

			dao = MemberDao.getInstance();

			// �������� ��ü �޽��� ���ϱ�
			List<Member> memberList = null;

			// ��ü �޽����� �Լ�
			int memberTotalCount = dao.selectTotalCount(conn);
			
			// ���� ������ ��ȣ
			int pageNumber = 1;
			String page = request.getParameter("page");
			if (page != null) {
				try {
					pageNumber = Integer.parseInt(page);
				} catch (NumberFormatException e) {
					System.out.println("���� Ÿ���� ���ڿ��� ���޵��� �ʾ� ���� �߻�");
				}
			}

			int startRow = 0;

			if (memberTotalCount > 0) {

				// ���� ��, ������ ��
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
