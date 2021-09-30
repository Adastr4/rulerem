package cart.test;

import java.util.ArrayList;
import java.util.List;

public class Caratteristiche {

	private static List<String> cllegaValues = new ArrayList<>();
	private static List<String> clstatfValues = new ArrayList<>();
	private static List<String> clfiniValues = new ArrayList<>();

	public static void readCLLEGAValues() {

		cllegaValues = new ReadExcel().readValues(0);

	}

	public static List<String> getCLLEGAValues() {

		if (cllegaValues.isEmpty()) {

			readCLLEGAValues();

		}
		return cllegaValues;

	}

	public static void readCLSTATFValues() {

		clstatfValues = new ReadExcel().readValues(2);

	}

	public static List<String> getCLSTATFValues() {

		if (clstatfValues.isEmpty()) {

			readCLSTATFValues();

		}
		return clstatfValues;

	}

	public static void readCLFINIValues() {

		clfiniValues = new ReadExcel().readValues(3);

	}

	public static List<String> getCLFINIValues() {

		if (clfiniValues.isEmpty()) {

			readCLFINIValues();

		}
		return clfiniValues;

	}


}
