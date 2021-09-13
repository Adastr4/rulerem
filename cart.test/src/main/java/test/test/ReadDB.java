package test.test;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDB {

		private static int counter;
		private static Connection conn = null;

		public static String readClasse() {
			Statement stmt = null;
			ResultSet rs = null;
			String res = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
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
		
		public static List<String> readCaratteristica(String caratteristica, String articolo) {
			Statement stmt = null;
			String query = null;
			ResultSet rs = null;
			List<String> res = new ArrayList<String>();
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT * FROM caratteristiche WHERE caratteristica ='" + caratteristica + "' AND TRIM(articolo) = '" + articolo + "'";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					String opzione = rs.getString("opzione");
					res.add(opzione);
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
		
		public static List<BigDecimal> readCaratteristicaDecimal(String caratteristica, String articolo) {
			Statement stmt = null;
			String query = null;
			ResultSet rs = null;
			List<BigDecimal> res = new ArrayList<BigDecimal>();
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT * FROM caratteristiche WHERE caratteristica ='" + caratteristica + "' AND TRIM(articolo) = '" + articolo + "'";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					BigDecimal opzione = new BigDecimal(rs.getString("opzione"));
					res.add(opzione);
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

