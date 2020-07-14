package ex;

/*
#기능
   입력, 
   수정(이름, 부서, 급역), 
   삭제(사원번호), 
   리스트, 
   검색(이름)
2. 부서관리 프로그램
#기능
   입력, 
   수정(부서이름, 위치), 
   삭제(부서번호), 
   리스트, 
   검색(부서이름 or 지역)
   */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest6 {
	
	//사원관리 프로그램

	public static void empInsert() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "insert into emp (empno, ename, job) " + " values (7777, 'EUNA', 'STUDENT')";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println(resultCnt + "개 행이 입력되었습니다.");

//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getString(3) + "\n");
//			}

			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void empUpdate() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "update emp set ename = 'MILD', sal = 1000, deptno = 30 where empno = 7934";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println("수정되었습니다.");

//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getString(3) + "\n");
//			}

			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void empDelete() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "delete from emp where empno = 7777";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println("삭제되었습니다.");

//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getString(3) + "\n");
//			}

			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void empList() {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			String sql = "select * from emp";

			pstmt = conn.prepareStatement(sql);
			// 변수 데이터 설정
			//pstmt.setInt(1, 7876 );

			rs = pstmt.executeQuery();

			System.out.println("사원 리스트");
			System.out.println("===============================");
			// ResultSet -> 결과 참조
			while (rs.next()) {
				System.out.printf(rs.getInt("empno") + "\t");
				System.out.printf("%-5s",rs.getString("ename")+"\t");
				System.out.printf("%-5s",rs.getString("job") + "\n");
			}
			System.out.println("===============================");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		}
	}
	
	public static void empSearch() {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			String sql = "select * from emp where ename = ?";

			pstmt = conn.prepareStatement(sql);
			// 변수 데이터 설정
			pstmt.setString(1, "ALLEN" );

			rs = pstmt.executeQuery();

			System.out.println("사원 리스트");
			System.out.println("===============================");
			// ResultSet -> 결과 참조
			while (rs.next()) {
				System.out.printf(rs.getInt("empno") + "\t");
				System.out.printf("%-5s",rs.getString("ename") + "\t");
				System.out.printf("%-5s",rs.getString("job") + "\n");
			}
			System.out.println("===============================");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		}
	}
	
	
	// 부서관리 프로그램
	
	public static void deptInsert() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "insert into dept (deptno, dname, loc) " + " values (70, 'PROGRAMER', 'SEOUL')";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println(resultCnt + "개 행이 입력되었습니다.");

			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deptUpdate() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "update dept set dname = 'SERVICE', loc = 'BUSAN' where deptno = 10";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println("수정되었습니다.");

//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				System.out.print(rs.getInt(1) + "\t");
//				System.out.print(rs.getString(2) + "\t");
//				System.out.print(rs.getString(3) + "\n");
//			}

			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deptDelete() {
		Connection conn = null;
		ResultSet rs = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement : Connection
			Statement stmt = conn.createStatement();

			String sql = "delete from dept where deptno = 70";

			int resultCnt = stmt.executeUpdate(sql);

			System.out.println("삭제되었습니다.");


			rs.close();
			stmt.close();

			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deptList() {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			String sql = "select * from dept";

			pstmt = conn.prepareStatement(sql);
			// 변수 데이터 설정
			//pstmt.setInt(1, 7876 );

			rs = pstmt.executeQuery();

			System.out.println("부서 리스트");
			System.out.println("===============================");
			// ResultSet -> 결과 참조
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.printf("%-12s",rs.getString("dname"));
				System.out.printf("%-5s",rs.getString("loc") + "\n");
			}
			System.out.println("===============================");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		}
	}
	
	public static void deptSearch() {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		// 1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Oracle 드라이버 로드 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			String sql = "select * from dept where loc = ?";

			pstmt = conn.prepareStatement(sql);
			// 변수 데이터 설정
			pstmt.setString(1, "DALLAS" );

			rs = pstmt.executeQuery();

			System.out.println("사원 리스트");
			System.out.println("===============================");
			// ResultSet -> 결과 참조
			while (rs.next()) {
				System.out.print(rs.getInt("deptno") + "\t");
				System.out.printf("%-12s",rs.getString("dname") + "\t");
				System.out.printf("%-5s",rs.getString("loc") + "\n");
			}
			System.out.println("===============================");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		}
	}

	
	
	public static void main(String[] args) {
		
		empList();
		
	}
}