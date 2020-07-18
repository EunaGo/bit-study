package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.jdbc.ConnectionProvider;
import guestbook.model.Message;

public class DeleteMessageService {
	
	private DeleteMessageService() {}
	private static DeleteMessageService service = new DeleteMessageService();
	public static DeleteMessageService getInstance() {
		return service;
	}
	
	MessageDao dao;
	
	public int deleteMessage(int mid, String pw) {
		int resultCnt = 0;
		
		Connection conn = null;
		Message message = null;
		
		// 1. mid �� �̽��� ���� �ϴ��� Ȯ��
		// 2. �޽����� ���� �ϸ� ��ü�� pw ����ڰ� �Է��� pw ��
		// 3. ���� ����� ���ٸ� mid�� �̽����� ����
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			
			message = dao.selectMessage(conn, mid);
			
			if(message == null) {
				resultCnt = -1;
				throw new Exception("���� �� �޽����� �������� ����.");
			}
			
			if(!message.getPw().equals(pw)) {
				resultCnt = -2;
				throw new Exception("��й�ȣ�� ��ġ���� ����.");
			}
			
			// ����
			resultCnt = dao.deleteMessage(conn, mid);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return resultCnt;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}