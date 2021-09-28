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
		
		public static boolean getSLBPSpecial(String SLBP, String articolo)
		{
			Statement stmt = null;
			String query = null;
			boolean ret = Boolean.FALSE;
			ResultSet rs = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT * FROM caratteristiche WHERE caratteristica ='SLBP' AND TRIM(articolo) = '" + articolo + "' AND opzione = '" + SLBP + "' LIMIT 1";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					ret = Boolean.FALSE;
				}

				return ret;
			} catch (Exception ex) {
				// handle the error
				ex.printStackTrace();
				return ret;
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
		
		//public static ArrayList<Macchina> getMacchinaFromId(String CLLARG, String CLLUNG, String CLSPESS, String SLLANAS, String CLFINI, String CLRIVE)
		public static Macchina getMacchinaFromId(String idMacchina)
		{
			Statement stmt = null;
			String query = null;
			Macchina ret = null;
			ResultSet rs = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT * FROM macchine WHERE idMacchina ='" + idMacchina + "' LIMIT 1";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					ret = new Macchina(rs.getString("idMacchina"),rs.getString("Descrizione"),rs.getString("idCentroLavoro"),rs.getInt("capacitaBaseGiorn"),rs.getInt("capacitaBaseSett"));
				}

				return ret;
			} catch (Exception ex) {
				// handle the error
				ex.printStackTrace();
				return ret;
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
		
		public static Attivita getAttivitaFromId(String idAttivita)
		{
			Statement stmt = null;
			String query = null;
			Attivita ret = null;
			ResultSet rs = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT * FROM attivita WHERE idAttivita ='" + idAttivita + "' LIMIT 1";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					ret = new Attivita(rs.getString("idAttivita"),rs.getString("Descrizione"),getMacchinaFromId(rs.getString("idMacchinaPred")),rs.getString("idCentroLavPred"));
				}

				return ret;
			} catch (Exception ex) {
				// handle the error
				ex.printStackTrace();
				return ret;
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
		
		public static String getMacchineListFromCharacteristics(String CLLARG, String CLLUNG, String CLSPESS, int rifilo, String CLFINI, String CLRIVE, String idMacchina)
		{
			Statement stmt = null;
			String query = null;
			String ret = "";
			ResultSet rs = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT idMacchina FROM ciclo_macchina_rules WHERE LargMin <=" + Integer.parseInt(CLLARG) + " AND LargMax >=" + Integer.parseInt(CLLARG) +
						 										" LungMin <=" + Integer.parseInt(CLLUNG) + " AND LungMax >= " + Integer.parseInt(CLLUNG) + 
						 										" SpessMin <=" + Integer.parseInt(CLSPESS) + " AND SpessMax >= " + Integer.parseInt(CLSPESS) + 
						 										" RifiloMin <=" + rifilo + " AND RifiloMin >=" + rifilo + 
						 										" AND FinituraList LIKE '%" + CLFINI + "%' AND" +
						 										" (RivestimentoList = 'TUTTI' OR (RivestimentoList = 'NESSUNO' AND " + CLRIVE + " = '') OR RivestimentoList LIKE '%" + CLRIVE + "%') " +
						 										" AND idMacchina = '" + idMacchina + "'";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					//ret = new Macchina(rs.getString("idMacchina"),rs.getString("Descrizione"),rs.getString("idCentroLavoro"),rs.getInt("capacitaBaseGiorn"),rs.getInt("capacitaBaseSett"));
					ret = rs.getString("idMacchina");
				}

				return ret;
			} catch (Exception ex) {
				// handle the error
				ex.printStackTrace();
				return ret;
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
		
		public static Boolean isMacchineListFromCharacteristicsValid(String CLLARG, String CLLUNG, String CLSPESS, int rifilo, String CLFINI, String CLRIVE, String idMacchina)
		{
			Statement stmt = null;
			String query = null;
			Boolean ret = Boolean.FALSE;
			ResultSet rs = null;
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations

				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn =  	       DriverManager.getConnection("jdbc:mysql://localhost/profilglass?" +
						"user=root&password=root");
				stmt = conn.createStatement();
				query = "SELECT idMacchina FROM ciclo_macchina_rules WHERE LargMin <=" + Integer.parseInt(CLLARG) + " AND LargMax >=" + Integer.parseInt(CLLARG) +
						 										" AND LungMin <=" + Integer.parseInt(CLLUNG) + " AND LungMax >= " + Integer.parseInt(CLLUNG) + 
						 										" AND SpessMin <=" + Integer.parseInt(CLSPESS) + " AND SpessMax >= " + Integer.parseInt(CLSPESS) + 
						 										" AND RifiloMin <=" + rifilo + " AND RifiloMax >=" + rifilo + 
						 										" AND FinituraList LIKE '%" + CLFINI + "%' AND" +
						 										" (RivestimentoList = 'TUTTI' OR (RivestimentoList = 'NESSUNO' AND '" + CLRIVE + "' = '') OR RivestimentoList LIKE '%" + CLRIVE + "%') " +
						 										" AND idMacchina = '" + idMacchina + "'LIMIT 1";
				System.out.println(query);
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					//ret = new Macchina(rs.getString("idMacchina"),rs.getString("Descrizione"),rs.getString("idCentroLavoro"),rs.getInt("capacitaBaseGiorn"),rs.getInt("capacitaBaseSett"));
					ret = Boolean.TRUE;
				}

				return ret;
			} catch (Exception ex) {
				// handle the error
				ex.printStackTrace();
				return ret;
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

