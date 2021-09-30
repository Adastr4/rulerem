package test.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Caratteristiche {
	private static List<String> cllegaValues = new ArrayList<>();
	private static List<String> clstatfValues = new ArrayList<>();
	private static List<String> clfiniValues = new ArrayList<>();
	private static List<BigDecimal> clspessValues = new ArrayList<>();
	private static List<String> slbpteValues = new ArrayList<>();
	private static List<String> slbpValues = new ArrayList<>();
	private static List<String> cllargValues = new ArrayList<>();
	private static List<String> cllungValues = new ArrayList<>();
	private static List<String> clriveValues = new ArrayList<>();
	private static List<String> cltolleValues = new ArrayList<>();
	private static List<String> dldestValues = new ArrayList<>();
	private static List<String> dllavValues = new ArrayList<>();
	private static List<String> dllubriValues = new ArrayList<>();
	private static List<String> mlstatfValues = new ArrayList<>();
	private static List<String> plackgValues = new ArrayList<>();
	private static List<String> pmetcValues = new ArrayList<>();
	private static List<String> qspecValues = new ArrayList<>();
	private static List<String> sltollaValues = new ArrayList<>();
	private static List<String> dllatolpValues = new ArrayList<>();
	private static List<String> dllatolnValues = new ArrayList<>();
	private static List<String> sllatolpValues = new ArrayList<>();
	private static List<String> sllatolnValues = new ArrayList<>();

	public static void readCLLEGAValues(String articolo) {

		cllegaValues = ReadDB.readCaratteristica("CLLEGA",articolo);

	}

	public static List<String> getCLLEGAValues(String articolo) {

		if (cllegaValues.isEmpty()) {

			readCLLEGAValues(articolo);

		}
		return cllegaValues;

	}

	public static void readCLSPESSValues(String articolo) {

		clspessValues = ReadDB.readCaratteristicaDecimal("CLSPESS",articolo);

	}

	public static List<BigDecimal> getCLSPESSValues(String articolo) {

		if (clspessValues.isEmpty()) {

			readCLSPESSValues(articolo);

		}
		return clspessValues;

	}

	public static void readCLSTATFValues(String articolo) {

		clstatfValues = ReadDB.readCaratteristica("CLSTATF",articolo);

	}

	public static List<String> getCLSTATFValues(String articolo) {

		if (clstatfValues.isEmpty()) {

			readCLSTATFValues(articolo);

		}
		return clstatfValues;

	}

	public static void readCLFINIValues(String articolo) {

		clfiniValues = ReadDB.readCaratteristica("CLFINI",articolo);

	}

	public static List<String> getCLFINIValues(String articolo) {

		if (clfiniValues.isEmpty()) {

			readCLFINIValues(articolo);

		}
		return clfiniValues;

	}

	public static void readSLBPTEValues(String articolo) {

		slbpteValues = ReadDB.readCaratteristica("SLBPTE",articolo);

	}

	public static List<String> getSLBPTEValues(String articolo) {

		if (slbpteValues.isEmpty()) {

			readSLBPTEValues(articolo);

		}
		return slbpteValues;

	}

	public static void readCLLARGValues(String articolo) {

		cllargValues = ReadDB.readCaratteristica("CLLARG",articolo);
	}

	public static List<String> getCLLARGValues(String articolo) {

		if (cllargValues.isEmpty()) {

			readCLLARGValues(articolo);

		}
		return cllargValues;
	}

	public static void readSLBPValues(String articolo) {

		slbpValues = ReadDB.readCaratteristica("SLBP",articolo);
	}

	public static List<String> getSLBPValues(String articolo) {

		if (slbpValues.isEmpty()) {

			readSLBPValues(articolo);

		}
		return slbpValues;
	}

	public static void readCLLUNGValues(String articolo) {

		cllungValues = ReadDB.readCaratteristica("CLLUNG",articolo);
	}

	public static List<String> getCLLUNGValues(String articolo) {

		if (cllungValues.isEmpty()) {

			readCLLUNGValues(articolo);

		}
		return cllungValues;
	}

	public static void readCLRIVEValues(String articolo) {

		clriveValues = ReadDB.readCaratteristica("CLRIVE",articolo);
	}

	public static List<String> getCLRIVEValues(String articolo) {

		if (clriveValues.isEmpty()) {

			readCLRIVEValues(articolo);

		}
		return clriveValues;
	}

	public static void readCLTOLLEValues(String articolo) {

		cltolleValues = ReadDB.readCaratteristica("CLTOLLE",articolo);
	}

	public static List<String> getCLTOLLEValues(String articolo) {

		if (cltolleValues.isEmpty()) {

			readCLTOLLEValues(articolo);

		}
		return cltolleValues;
	}

	public static void readDLDESTValues(String articolo) {

		dldestValues = ReadDB.readCaratteristica("DLDEST",articolo);
	}

	public static List<String> getDLDESTValues(String articolo) {

		if (dldestValues.isEmpty()) {

			readDLDESTValues(articolo);

		}
		return dldestValues;
	}

	public static void readDLLAVValues(String articolo) {

		dllavValues = ReadDB.readCaratteristica("DLLAV",articolo);
	}

	public static List<String> getDLLAVValues(String articolo) {

		if (dllavValues.isEmpty()) {

			readDLLAVValues(articolo);

		}
		return dllavValues;
	}

	public static void readDLLUBRIValues(String articolo) {

		dllubriValues = ReadDB.readCaratteristica("DLLUBRI",articolo);
	}

	public static List<String> getDLLUBRIValues(String articolo) {

		if (dllubriValues.isEmpty()) {

			readDLLUBRIValues(articolo);

		}
		return dllubriValues;
	}

	public static void readMLSTATFValues(String articolo) {

		mlstatfValues = ReadDB.readCaratteristica("MLSTATF",articolo);
	}

	public static List<String> getMLSTATFValues(String articolo) {

		if (mlstatfValues.isEmpty()) {

			readMLSTATFValues(articolo);

		}
		return mlstatfValues;
	}

	public static void readPLACKGValues(String articolo) {

		plackgValues = ReadDB.readCaratteristica("PLACKG",articolo);
	}

	public static List<String> getPLACKGValues(String articolo) {

		if (plackgValues.isEmpty()) {

			readPLACKGValues(articolo);

		}
		return plackgValues;
	}

	public static void readPMETCGValues(String articolo) {

		pmetcValues = ReadDB.readCaratteristica("PMETC",articolo);
	}

	public static List<String> getPMETCValues(String articolo) {

		if (pmetcValues.isEmpty()) {

			readPMETCGValues(articolo);

		}
		return pmetcValues;
	}

	public static void readQSPECValues(String articolo) {

		qspecValues = ReadDB.readCaratteristica("QSPEC",articolo);
	}

	public static List<String> getQSPECValues(String articolo) {

		if (qspecValues.isEmpty()) {

			readQSPECValues(articolo);

		}
		return qspecValues;
	}

	public static void readSLTOLLAValues(String articolo) {

		sltollaValues = ReadDB.readCaratteristica("SLTOLLA",articolo);
	}

	public static List<String> getSLTOLLAValues(String articolo) {

		if (sltollaValues.isEmpty()) {

			readSLTOLLAValues(articolo);

		}
		return sltollaValues;
	}

	public static void readDLLATOLPValues(String articolo) {

		dllatolpValues = ReadDB.readCaratteristica("DLLATOLP",articolo);
	}

	public static List<String> getDLLATOLPValues(String articolo) {

		if (dllatolpValues.isEmpty()) {

			readDLLATOLPValues(articolo);

		}
		return dllatolpValues;
	}

	public static void readDLLATOLNValues(String articolo) {

		dllatolnValues = ReadDB.readCaratteristica("DLLATOLN",articolo);
	}

	public static List<String> getDLLATOLNValues(String articolo) {

		if (dllatolnValues.isEmpty()) {

			readDLLATOLNValues(articolo);

		}
		return dllatolnValues;
	}

	public static void readSLLATOLPValues(String articolo) {

		sllatolpValues = ReadDB.readCaratteristica("SLLATOLP",articolo);
	}

	public static List<String> getSLLATOLPValues(String articolo) {

		if (sllatolpValues.isEmpty()) {

			readSLLATOLPValues(articolo);

		}
		return sllatolpValues;
	}

	public static void readSLLATOLNValues(String articolo) {

		sllatolnValues = ReadDB.readCaratteristica("SLLATOLN",articolo);
	}

	public static List<String> getSLLATOLNValues(String articolo) {

		if (sllatolnValues.isEmpty()) {

			readSLLATOLNValues(articolo);

		}
		return sllatolnValues;
	}

}
