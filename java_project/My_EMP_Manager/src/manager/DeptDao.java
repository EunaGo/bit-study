package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DeptDao {
	
	public void deptEdit() {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정하고자 하는 부서 이름: ");
		String searchName = sc.nextLine();
		
		try {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		conn = DriverManager.getConnection(url, user, pw);
		
		stmt = conn.createStatement();
		
		String selectSql = "select * from dept where dname='" + searchName + "'";
		
		rs = stmt.executeQuery(selectSql);
		
		int sDeptno = 0;
		String sDname = "";
		String sLoc = "";
		
		if(rs.next()) {
			sDeptno = rs.getInt("deptno");
			sDname = rs.getString("dname");
			sLoc = rs.getString("loc");
		} else {
			System.out.println("검색하신 데이터가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("부서 정보를 입력해주세요.");

		System.out.println("부서 번호 : " + sDeptno);
		System.out.println("부서 번호는 수정되지 않습니다.");

		System.out.println("부서 이름 ( " + sDname + "  ) : ");
		String dname = sc.nextLine();

		System.out.println("지역 ( " + sLoc + "  ) : ");
		String loc = sc.nextLine();

		String sql = "update dept  set  dname=?, loc=? " + " where deptno=?";

		pstmt = conn.prepareStatement(sql);

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dname);
		pstmt.setString(2, loc);
		pstmt.setInt(3, sDeptno);

		int resultCnt = pstmt.executeUpdate();

		if (resultCnt > 0) {
			System.out.println("정상적으로 수정 되었습니다.");
			System.out.println(resultCnt + "행이 수정되었습니다.");
		} else {
			System.out.println("수정이 되지않았습니다. 확인후 재 시도해주세요.");
		}
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
		
		
	}
	
	
	public static void deptDelete() {
		
	}
	
}
