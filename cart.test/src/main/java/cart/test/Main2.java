package cart.test;

import java.math.BigDecimal;
import java.util.List;
import java.util.ListIterator;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * RuleBook<Boolean> caratteristicheRuleBook =
		 * RuleBookBuilder.create(CaratteristicheRuleBook.class)
		 * .withResultType(Boolean.class) .withDefaultResult(Boolean.FALSE)
		 *
		 * .build();
		 *
		 * NameValueReferableMap<String> facts = new FactMap<String>();
		 * facts.setValue("CLSTATF", "H3"); facts.setValue("CLLEGA", "1A");
		 * //facts.setValue("First Time Homebuyer", true);
		 *
		 * caratteristicheRuleBook.run(facts);
		 *
		 *
		 *
		 *
		 * Auditor auditor = (Auditor)caratteristicheRuleBook;
		 * System.out.println("Stato Rule1 " + auditor.getRuleStatus("Rule1")); //prints
		 * EXECUTED System.out.println("Stato Rule2 " + auditor.getRuleStatus("Rule2"));
		 * //prints SKIPPED System.out.println("Stato Rule3 " +
		 * auditor.getRuleStatus("Rule3")); //prints SKIPPED
		 *
		 * caratteristicheRuleBook.getResult().ifPresent(result ->
		 * System.out.println("stato fisico H00 ammesso per lega 1A : " + result));
		 */

		/*
		 * Stream<String> stream = Stream.of("Geeks", "FOr", "GEEKSQUIZ",
		 * "GeeksforGeeks");
		 *
		 * // Check if Character at 1st index is // UpperCase in any string or not using
		 * // Stream anyMatch(Predicate predicate) boolean answer = stream.allMatch(str
		 * -> Character.isUpperCase(str.charAt(0)));
		 *
		 * // Displaying the result System.out.println(answer); }
		 *
		 *
		 */
		// Predicate<String> libtest1 = s ->
		// s.startsWith("cart.test.library.subrules1");

		/*
		 * List<String> CLLEGAValues = Caratteristiche.getCLLEGAValues(); List<String>
		 * CLSTATFValues = Caratteristiche.getCLSTATFValues(); List<String> CLFINIValues
		 * = Caratteristiche.getCLFINIValues();
		 *
		 *
		 * String CLLEGA; String CLSTATF;
		 *
		 */

		/*
		 * Console c = System.console();
		 * System.out.println("Seleziona un valore per la caratteristica lega: ");
		 * System.out.println("Tra i seguenti valori"); ListIterator<String> litr =
		 * CLLEGAValues.listIterator(); while(litr.hasNext()){
		 * System.out.println(litr.next()); } String n = c.readLine();
		 * System.out.println("Hai selezionato " + n); CLLEGA = n;
		 */
//		CLLEGA = "3A";

		/*
		 * System.out.println("Seleziona un valore per la caratteristica stato fisico: "
		 * ); System.out.println("Tra i seguenti valori"); litr =
		 * CLSTATFValues.listIterator(); while(litr.hasNext()){
		 * System.out.println(litr.next()); } n = c.readLine();
		 * System.out.println("Hai selezionato " + n); CLSTATF = n;
		 */

		/*
		 * ListIterator<String> litr = CLSTATFValues.listIterator();
		 * while(litr.hasNext()){
		 *
		 * CLSTATF = litr.next(); CLSTATF = CLSTATF.substring(0, CLSTATF.indexOf("-") -
		 * 1);
		 *
		 *
		 *
		 * RuleBookRunner ruleBook = new RuleBookRunner("cart.test", s ->
		 * s.equalsIgnoreCase("cart.test") ||
		 * s.equalsIgnoreCase("cart.test.library.subrules1") ||
		 * s.equalsIgnoreCase("cart.test.library.subrules2") );
		 * NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
		 * CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650),
		 * CLLEGA, CLSTATF, "B07187", "B07187"); // CaratteristicaBean applicant1 = new
		 * CaratteristicaBean(new BigDecimal(650), "3A", "H14", "B07187", "B07187");
		 *
		 * facts.put(new Fact<>(applicant1));
		 *
		 *
		 * ruleBook.setDefaultResult(Boolean.FALSE); ruleBook.run(facts);
		 *
		 * String clstatfRis = CLSTATF;
		 *
		 * ruleBook.getResult().ifPresent(result ->
		 * System.out.println("Vincolo per Caratteristica stato fisico " + clstatfRis +
		 * " validato " + result));
		 *
		 * boolean test = testVincolo("3A", clstatfRis, "B07187", "B07187");
		 * System.out.println("TEST per " + clstatfRis + " " + test);
		 *
		 *
		 *
		 * }
		 */

//		noLoop();
		withLoop();

	}

	private static boolean testVincolo(String CLLEGA, String CLSTATF, String SLBPTE, String SLBP) {
		boolean validate = Boolean.TRUE;
		if (CLSTATF.equalsIgnoreCase("t04") || CLSTATF.equalsIgnoreCase("t06") || CLSTATF.equalsIgnoreCase("t4p"))
			validate = Boolean.FALSE;
		if (CLLEGA.substring(0, 1).equalsIgnoreCase("1"))
			if (CLSTATF.substring(0, 2).equalsIgnoreCase("h3"))
				validate = Boolean.FALSE;
		if (CLLEGA.substring(0, 1).equalsIgnoreCase("3")) {
			if (CLSTATF.substring(0, 2).equalsIgnoreCase("h3"))
				validate = Boolean.FALSE;
			else {
				if (CLLEGA.equalsIgnoreCase("3a"))
					if (CLSTATF.equalsIgnoreCase("h00") || CLSTATF.equalsIgnoreCase("ha1")
							|| CLSTATF.equalsIgnoreCase("h12") || CLSTATF.equalsIgnoreCase("h15")
							|| CLSTATF.equalsIgnoreCase("h16") || CLSTATF.equalsIgnoreCase("h17")) {
						if (SLBPTE.equalsIgnoreCase("b07187") || SLBPTE.equalsIgnoreCase("b03835")
								|| SLBPTE.equalsIgnoreCase("b07434")) {
						}

						else {
							validate = Boolean.FALSE;
							if (SLBPTE.equalsIgnoreCase(SLBP) && CLSTATF.equalsIgnoreCase("h14"))
								validate = Boolean.TRUE;
						}
					}
			}

		}
		if (CLLEGA.substring(0, 1).equalsIgnoreCase("4"))
			if (CLSTATF.substring(0, 2).equalsIgnoreCase("h3"))
				validate = Boolean.FALSE;
		if (CLLEGA.substring(0, 1).equalsIgnoreCase("6")) {
			if (CLSTATF.substring(0, 2).equalsIgnoreCase("h3"))
				validate = Boolean.FALSE;
			if (CLSTATF.equalsIgnoreCase("t04") || CLSTATF.equalsIgnoreCase("t06") || CLSTATF.equalsIgnoreCase("t4p")
					|| CLSTATF.equalsIgnoreCase("h00"))
				validate = Boolean.TRUE;
		}
		if (CLLEGA.substring(0, 1).equalsIgnoreCase("8"))
			if (CLSTATF.substring(0, 2).equalsIgnoreCase("h3"))
				validate = Boolean.FALSE;
		return validate;

	}

	/**
	 * test con i dati clblati
	 *
	 */
	private static void withLoop() {
		List<String> CLLEGAValues = Caratteristiche.getCLLEGAValues();
		List<String> CLSTATFValues = Caratteristiche.getCLSTATFValues();
		List<String> CLFINIValues = Caratteristiche.getCLFINIValues();

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";

		ListIterator<String> litr = CLSTATFValues.listIterator();
		while (litr.hasNext()) {

			CLSTATF = litr.next();
			CLSTATF = CLSTATF.substring(0, CLSTATF.indexOf("-") - 1);

			RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
					s -> s.equalsIgnoreCase("cart.test.constraints.cs1") || s.equalsIgnoreCase("cart.test.library.subrules1")
							|| s.equalsIgnoreCase("cart.test.library.subrules2"));
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), CLLEGA, CLSTATF, "B07187",
					"B07187", "");

			facts.put(new Fact<>(applicant1));

			ruleBook.setDefaultResult(Boolean.TRUE);
			ruleBook.run(facts);

			String clstatfRis = CLSTATF;

			ruleBook.getResult().ifPresent(result -> System.out
					.println("Vincolo per Caratteristica stato fisico " + clstatfRis + " validato " + result));

			boolean test = testVincolo(CLLEGA, clstatfRis, "B07187", "B07187");
			System.out.println("TEST per " + CLLEGA + " " + clstatfRis + " " + test);

		}

	}

	private static void noLoop() {
		List<String> CLLEGAValues = Caratteristiche.getCLLEGAValues();
		List<String> CLSTATFValues = Caratteristiche.getCLSTATFValues();
		List<String> CLFINIValues = Caratteristiche.getCLFINIValues();


		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";
		CLSTATF = "H0F";

		ListIterator<String> litr = CLSTATFValues.listIterator();

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
				s -> s.equalsIgnoreCase("cart.test") || s.equalsIgnoreCase("cart.test.library.subrules1")
						|| s.equalsIgnoreCase("cart.test.library.subrules2"));
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();

		CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), CLLEGA, CLSTATF, "B07187",
				"B07187", "");

		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.FALSE);
		ruleBook.run(facts);

		ruleBook.getResult().ifPresent(
				result -> System.out.println("Vincolo per Caratteristica stato fisico " + " validato " + result));

		boolean test = testVincolo(CLLEGA, CLSTATF, "B07187", "B07187");
		System.out.println("TEST per " + CLLEGA + " " + CLSTATF + " " + test);

	}
}
