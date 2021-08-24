package cart.test;

import java.util.ArrayList;
import java.util.List;

public class Caratteristiche {

	private static List<String> cllegaValues = new ArrayList<String>();
	private static List<String> clstatfValues = new ArrayList<String>();
	private static List<String> clfiniValues = new ArrayList<String>();

	public static void readCLLEGAValues() {

		cllegaValues = ReadExcel.readValues(0);

	}

	public static List<String> getCLLEGAValues() {

		if (cllegaValues.isEmpty()) {

			readCLLEGAValues();

		}
		return cllegaValues;

	}

	public static void readCLSTATFValues() {

		clstatfValues = ReadExcel.readValues(2);

	}

	public static List<String> getCLSTATFValues() {

		if (clstatfValues.isEmpty()) {

			readCLSTATFValues();

		}
		return clstatfValues;

	}

	public static void readCLFINIValues() {

		clfiniValues = ReadExcel.readValues(3);

	}

	public static List<String> getCLFINIValues() {

		if (clfiniValues.isEmpty()) {

			readCLFINIValues();

		}
		return clfiniValues;

	}

}
