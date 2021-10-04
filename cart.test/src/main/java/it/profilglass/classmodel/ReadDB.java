package it.profilglass.classmodel;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadDB {
	private static Connection conn = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(
					"jdbc:mysql://212.237.47.99:3306/profilglass?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&"
							+ "user=profilglass&password=Qc89d9a~");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Attivita getAttivitaFromId(String idAttivita) {
		Statement stmt = null;
		String query = null;
		Attivita ret = null;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM attivita WHERE idAttivita ='" + idAttivita + "' LIMIT 1";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret = new Attivita(rs.getString("idAttivita"), rs.getString("Descrizione"),
						getMacchinaFromId(rs.getString("idMacchinaPred")), rs.getString("idCentroLavPred"));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static ArrayList<ICaratteristica> getCaratteristicheFromConfigurator(String articolo) {
		Statement stmt = null;
		String query = null;
		final ArrayList<ICaratteristica> ret = new ArrayList<>();
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT Caratteristica, Descrizione, Sequenza FROM caratteristicaconfiguratore WHERE trim(articolo) ='"
					+ articolo + "' AND ExpireDate >= current_date";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret.add(new Caratteristica(rs.getString("Caratteristica"), rs.getString("Descrizione"),
						rs.getInt("Sequenza"), articolo));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static it.profilglass.classmodel.Attivita getClassmodelAttivitaFromId(String idAttivita) {
		Statement stmt = null;
		String query = null;
		it.profilglass.classmodel.Attivita ret = null;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations
			stmt = conn.createStatement();
			query = "SELECT * FROM attivita WHERE idAttivita ='" + idAttivita + "' LIMIT 1";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret = new it.profilglass.classmodel.Attivita(rs.getString("idAttivita"), rs.getString("Descrizione"),
						getClassmodelMacchinaFromId(rs.getString("idMacchinaPred")), rs.getString("idCentroLavPred"));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static it.profilglass.classmodel.Macchina getClassmodelMacchinaFromId(String idMacchina) {
		Statement stmt = null;
		String query = null;
		it.profilglass.classmodel.Macchina ret = null;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM macchine WHERE idMacchina ='" + idMacchina + "' LIMIT 1";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret = new it.profilglass.classmodel.Macchina(rs.getString("idMacchina"), rs.getString("Descrizione"),
						rs.getString("idCentroLavoro"), rs.getInt("capacitaBaseGiorn"), rs.getInt("capacitaBaseSett"));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	// public static ArrayList<Macchina> getMacchinaFromId(String CLLARG, String
	// CLLUNG, String CLSPESS, String SLLANAS, String CLFINI, String CLRIVE)
	public static Macchina getMacchinaFromId(String idMacchina) {
		Statement stmt = null;
		String query = null;
		Macchina ret = null;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM macchine WHERE idMacchina ='" + idMacchina + "' LIMIT 1";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret = new Macchina(rs.getString("idMacchina"), rs.getString("Descrizione"),
						rs.getString("idCentroLavoro"), rs.getInt("capacitaBaseGiorn"), rs.getInt("capacitaBaseSett"));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static String getMacchineListFromCharacteristics(String CLLARG, String CLLUNG, String CLSPESS, int rifilo,
			String CLFINI, String CLRIVE, String idMacchina) {
		Statement stmt = null;
		String query = null;
		String ret = "";
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT idMacchina FROM ciclo_macchina_rules WHERE LargMin <=" + Integer.parseInt(CLLARG)
					+ " AND LargMax >=" + Integer.parseInt(CLLARG) + " LungMin <=" + Integer.parseInt(CLLUNG)
					+ " AND LungMax >= " + Integer.parseInt(CLLUNG) + " SpessMin <=" + Integer.parseInt(CLSPESS)
					+ " AND SpessMax >= " + Integer.parseInt(CLSPESS) + " RifiloMin <=" + rifilo + " AND RifiloMin >="
					+ rifilo + " AND FinituraList LIKE '%" + CLFINI + "%' AND"
					+ " (RivestimentoList = 'TUTTI' OR (RivestimentoList = 'NESSUNO' AND " + CLRIVE
					+ " = '') OR RivestimentoList LIKE '%" + CLRIVE + "%') " + " AND idMacchina = '" + idMacchina + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				// ret = new
				// Macchina(rs.getString("idMacchina"),rs.getString("Descrizione"),rs.getString("idCentroLavoro"),rs.getInt("capacitaBaseGiorn"),rs.getInt("capacitaBaseSett"));
				ret = rs.getString("idMacchina");
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static ArrayList<Opzione> getOpzioniList(String configuratore, String caratteristica) {
		Statement stmt = null;
		String query = null;
		final ArrayList<Opzione> ret = new ArrayList<>();
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT opzione, descrizione FROM caratteristiche WHERE trim(articolo) ='" + configuratore
					+ "' AND caratteristica ='" + caratteristica + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret.add(new Opzione(rs.getString("opzione"), rs.getString("descrizione")));
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static boolean getSLBPSpecial(String SLBP, String articolo) {
		Statement stmt = null;
		String query = null;
		boolean ret = Boolean.FALSE;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM caratteristiche WHERE caratteristica ='SLBP' AND TRIM(articolo) = '" + articolo
					+ "' AND opzione = '" + SLBP + "' LIMIT 1";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				ret = Boolean.FALSE;
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static Boolean isMacchineListFromCharacteristicsValid(String CLLARG, String CLLUNG, String CLSPESS,
			int rifilo, String CLFINI, String CLRIVE, String idMacchina) {
		Statement stmt = null;
		String query = null;
		Boolean ret = Boolean.FALSE;
		ResultSet rs = null;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();

			query = "SELECT idMacchina FROM ciclo_macchina_rules WHERE LargMin <=" + Integer.parseInt(CLLARG) / 10
					+ " AND LargMax >=" + Integer.parseInt(CLLARG) / 10 + " AND LungMin <="
					+ Integer.parseInt(CLLUNG) / 10 + " AND LungMax >= " + Integer.parseInt(CLLUNG) / 10
					+ " AND SpessMin <=" + Double.parseDouble(CLSPESS) / 1000 + " AND SpessMax >= "
					+ Double.parseDouble(CLSPESS) / 1000 + " AND RifiloMin <=" + rifilo + " AND RifiloMax >=" + rifilo
					+ " AND FinituraList LIKE '%" + CLFINI + "%' AND"
					+ " (RivestimentoList = 'TUTTI' OR (RivestimentoList = 'NESSUNO' AND '" + CLRIVE
					+ "' = '') OR RivestimentoList LIKE '%" + CLRIVE + "%') " + " AND idMacchina = '" + idMacchina
					+ "'LIMIT 1";
			System.out.println(query);
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("true " + idMacchina.toString());
				// ret = new
				// Macchina(rs.getString("idMacchina"),rs.getString("Descrizione"),rs.getString("idCentroLavoro"),rs.getInt("capacitaBaseGiorn"),rs.getInt("capacitaBaseSett"));
				ret = Boolean.TRUE;
			}

			return ret;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return ret;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static List<String> readCaratteristica(String caratteristica, String articolo) {
		Statement stmt = null;
		String query = null;
		ResultSet rs = null;
		final List<String> res = new ArrayList<>();
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM caratteristiche WHERE caratteristica ='" + caratteristica
					+ "' AND TRIM(articolo) = '" + articolo + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				final String opzione = rs.getString("opzione");
				res.add(opzione);
			}

			return res;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return null;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static List<BigDecimal> readCaratteristicaDecimal(String caratteristica, String articolo) {
		Statement stmt = null;
		String query = null;
		ResultSet rs = null;
		final List<BigDecimal> res = new ArrayList<>();
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			query = "SELECT * FROM caratteristiche WHERE caratteristica ='" + caratteristica
					+ "' AND TRIM(articolo) = '" + articolo + "'";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				final BigDecimal opzione = new BigDecimal(rs.getString("opzione"));
				res.add(opzione);
			}
			return res;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return null;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}

	public static String readClasse() {
		Statement stmt = null;
		ResultSet rs = null;
		String res = "prova";
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM carclfini"); // where classe = 'PROVA'
			while (rs.next()) {
				final String classe = rs.getString("classe");
				res = classe;
			}

			return res;
		} catch (final Exception ex) {
			// handle the error
			ex.printStackTrace();
			return null;
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed

			if (rs != null) {
				try {
					rs.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (final SQLException sqlEx) {
				} // ignore

				stmt = null;
			}

		}
	}
}
