package cart.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDB {
	private static Connection conn =null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn =  	       DriverManager.getConnection("jdbc:mysql://212.237.47.99:3306/profilglass?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&"+
					"user=profilglass&password=Qc89d9a~");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int counter;


	public static String readClasse() {
		Statement stmt = null;
		ResultSet rs = null;
		String res = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM CAR_CLFINI where classe = 'PROVA'");
			while(rs.next()) {
				String classe = rs.getString("classe");
				res = classe;
			}

			return res;
		} catch (Exception ex) {
			// handle the error
			ex.printStackTrace();
			return null;
		}
		finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore

				stmt = null;
			}

		}
	}
}

