package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() {
		
		// DB 연결 : Oracle
		Connection conn = null;
		
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(url,user,pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
