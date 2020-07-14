package ver06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PhoneBookDao {
	
	public void basic_Insert() {
		
		
				Connection conn = null;
				Statement stmt = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;

				Scanner sc = new Scanner(System.in);
				
				String fr_name=null, fr_phonenumber=null, fr_email=null, fr_address=null;
				
				// 사용자 입력정보 변수
				System.out.println("이름을 입력해주세요.");
				fr_name = sc.nextLine();
		
				System.out.println("전화번호를 입력해주세요.");
				phoneNumber = sc.nextLine();
		
				System.out.println("주소를 입력해주세요.");
				addr = sc.nextLine();
		
				System.out.println("이메일을 입력해주세요.");
				email = sc.nextLine();

				try {
				
					String url = "jdbc:oracle:thin:@localhost:1521:orcl";
					String user = "scott";
					String pw = "tiger";

					conn = DriverManager.getConnection(url, user, pw);

					String sql = "insert into phoneInfo_basic " + " () " + " values (?, ?, ?)";

					pstmt = conn.prepareStatement(sql);
					pstmt.setString(2, fr_name);
					pstmt.setString(3, fr_phonenumber);
					pstmt.setString(4, fr_email);
					pstmt.setString(5, fr_address);

					int resultCnt = pstmt.executeUpdate();

					if (resultCnt > 0) {
						System.out.println("정상적으로 입력 되었습니다.");
						System.out.println(resultCnt + "행이 입력되었습니다.");
					} else {
						System.out.println("입력이 되지않았습니다. 확인후 재 시도해주세요.");
					}


				} catch (SQLException e) {
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

}
