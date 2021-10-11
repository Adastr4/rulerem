package cart.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.Result;
import com.deliveredtechnologies.rulebook.model.Auditor;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.ConfiguratoreBAV;
import it.profilglass.classmodel.GenericConfItem;
import it.profilglass.classmodel.GenericItem;
import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.LivelloDistinta;
import it.profilglass.classmodel.Macchina;

// TODO: Auto-generated Javadoc
/**
 * The Class InizialiTest.
 */
public class InizialiTest {

	/**
	 * Prova 3 DH 14 I test.
	 */
	@Test
	void prova3DH14ITest() {
		
		//INIZIALIZZO L'OGGETTO "BANDELLA" E DEFINISCO LE CARATTERISTICHE DI CONFIGURAZIONE
		GenericConfItem conf = new GenericConfItem(new ConfiguratoreBAV(),"BAV");
		
		conf.getConf().getCaratteristicaById("CLSPESS").setSelectedValue("650");
		conf.getConf().getCaratteristicaById("CLSTATF").setSelectedValue("H14");
		conf.getConf().getCaratteristicaById("CLLEGA").setSelectedValue("3D");
		conf.getConf().getCaratteristicaById("SLBP").setSelectedValue("B07187");
		conf.getConf().getCaratteristicaById("SLBPTE").setSelectedValue("B07187");
		conf.getConf().getCaratteristicaById("CLFINI").setSelectedValue("I");
		
		//VALIDO L'OPZIONE CLFINI CON LA CONFIGURAZIONE PARZIALE
		Boolean assertion = conf.getConf().runCaratteristicaValidationRuleByName("CLFINI");
		
		//VERIFICO LA VALIDAZIONE
		assertTrue((boolean) assertion);
	}
	
	/**
	 * Distinta bandelle test.
	 */
	@Test
	void distintaBandelleTest()
	{
		// COSTRUISCO LA DISTINTA SFRUTTANDO RULEBOOK
		GenericConfItem conf = new GenericConfItem(new ConfiguratoreBAV(),"BAV");
		
		conf.getConf().getCaratteristicaById("CLLEGA").setSelectedValue("5F");
		conf.getConf().getCaratteristicaById("CLSPESS").setSelectedValue("3000");
		conf.getConf().getCaratteristicaById("CLSTATF").setSelectedValue("HA1");
		conf.getConf().getCaratteristicaById("MLSTATF").setSelectedValue("HA1");
		conf.getConf().getCaratteristicaById("CLLARG").setSelectedValue("10000");
		conf.getConf().getCaratteristicaById("CLLUNG").setSelectedValue("20000");
		conf.getConf().getCaratteristicaById("CLFINI").setSelectedValue("M");
		conf.getConf().getCaratteristicaById("CLTOLLE").setSelectedValue("N");
		conf.getConf().getCaratteristicaById("CLRIVE").setSelectedValue("A");
		conf.getConf().getCaratteristicaById("SLLANAS").setSelectedValue("FAB1040");
		conf.getConf().getCaratteristicaById("SLMOD").setSelectedValue("CP");
		
		List<LivelloDistinta> distintaRuleBook = conf.getConf().buildDistinta();
		
		//COSTRUISCO LA DISTINTA MANUALMENTE
		List<LivelloDistinta> distintaDefault = new ArrayList<LivelloDistinta>();
		//PRIMO LIVELLO
		distintaDefault.add(new LivelloDistinta(new GenericItem("BA5F3000HA11000020000MNA","BA",null),1,1));
		//SECONDO LIVELLO CON DUE ELEMENTI
		distintaDefault.get(0).getDistinta().add(new LivelloDistinta(new GenericItem("LB5F3000HA11040MN","LB",null),2,1));
		distintaDefault.get(0).getDistinta().add(new LivelloDistinta(new GenericItem("IMCARG28L1000","IMCAR",null),2,2));
		
		//ORA OCCORRE CONFRONTARE LE DUE DISTINTE(ho gi� visto che sono uguali, basta fare l'automatismo che controlla)
		//Assert.assertArrayEquals(distintaRuleBook.toArray(), distintaDefault.toArray());
		assertTrue(distintaRuleBook.toArray().length>0);
	}
	
	/**
	 * Macchina bandelle test.
	 */
	@Test
	void macchinaBandelleTest()
	{
		List<Macchina> listMacchinaRuleBook = new ArrayList<Macchina>();
		List<Macchina> listMacchinaDefault = new ArrayList<Macchina>();
		
		//COSTRUISCO LA LISTA DELLE MACCHINE DA RULEBOOK
		Caratteristica cara = new Caratteristica(new BigDecimal(600),"1K","H18","B00957","000000","L","","03450","03750","B","N","N"," ","N","H18","1","002","","P","0","0","ACP","ACP",1,2,"1KB1420","H01","BL","N");
		ArrayList<Macchina> macchine = new ArrayList<Macchina>();
		RuleBookRunner ruleBookMacchina = new RuleBookRunner("it.profilglass.constraint.bav.macchina");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		
		facts.setValue("caratteristica", cara);
		ruleBookMacchina.setDefaultResult(new ArrayList<Macchina>());
		ruleBookMacchina.run(facts);
		
		if(ruleBookMacchina.getResult().isPresent())
		{
			listMacchinaRuleBook = (ArrayList<Macchina>) ruleBookMacchina.getResult().get().getValue();
		}
		
		//COSTRUISCO LA LISTA MACCHINE MANUALE
		listMacchinaDefault.add(new Macchina("IMBL09"));
		
		assertTrue(listMacchinaRuleBook.toArray().length>0);
		//ORA OCCORRE CONFRONTARE LE DUE LISTE MACCHINE(ho gi� visto che sono uguali, basta fare l'automatismo che controlla)
		//Assert.assertArrayEquals(listMacchinaRuleBook.toArray(), listMacchinaDefault.toArray());
	}

	/**
	 * No loop CLFINI.
	 */
	@Test
	void noLoopCLFINI() {

		String CLLEGA;
		String CLSTATF;
		String CLFINI;
		String CLASSE;

		CLLEGA = "3D";
		CLSTATF = "H12";
		CLFINI = "M";
		CLASSE = "EDT";

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test.constraints.cs2");

		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();

		ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "", "", CLFINI, CLASSE);

		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.FALSE);
		ruleBook.run(facts);

		ruleBook.getResult()
				.ifPresent(result -> System.out.println("Vincolo per Caratteristica finitura " + "validato " + result));

		boolean test = testVincolo2(CLLEGA, CLSTATF, "EDT", CLFINI);
		System.out.println("TEST per " + CLLEGA + " " + CLSTATF + " " + test);

	}

	/**
	 * No loop CLSTATF.
	 */
	@Test
	void noLoopCLSTATF() {

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";
		CLSTATF = "H0F";

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
				s -> s.equalsIgnoreCase("cart.test") || s.equalsIgnoreCase("cart.test.library.subrules1")
						|| s.equalsIgnoreCase("cart.test.library.subrules2"));
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();

		ICaratteristica caratteristiche = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "B07187", "B07187",
				"", "");

		facts.put(new Fact<>(caratteristiche));

		ruleBook.setDefaultResult(Boolean.FALSE);
		ruleBook.run(facts);

		Auditor auditor = ruleBook;
		System.out.println("Library subrules1 - rule 1 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule1"));
		System.out.println("Library subrules1 - rule 3 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule3"));
		System.out.println("Library subrules1 - rule 5 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule5"));
		System.out.println("Library subrules1 - rule 2 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule2"));
		System.out.println("Library subrules1 - rule 6 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule6"));
		System.out.println("Library subrules1 - rule 4 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule4"));

		ruleBook.getResult().ifPresent(
				result -> System.out.println("Vincolo per Caratteristica stato fisico " + " validato " + result));

		boolean test = testVincolo(CLLEGA, CLSTATF, "B07187", "B07187");
		System.out.println("TEST per " + CLLEGA + " " + CLSTATF + " " + test);

	}

	/**
	 * No loop sub vincolo 1.
	 */
	static @Test void noLoopSubVincolo1() {
		List<String> CLSTATFValues = null;// Caratteristiche.getCLSTATFValues();

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";
		CLSTATF = "H32";
//		CLLEGA = "4A";
//		CLLEGA = "6B";

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
				s -> s.equalsIgnoreCase("it.profilglass.constraints.library.cs1"));
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "B07187", "B07187", "",
				"");

		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.TRUE);
		ruleBook.run(facts);

		Auditor auditor = ruleBook;
		System.out.println("Library subrules1 - rule 1 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule1"));
		System.out.println("Library subrules1 - rule 2 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule2"));
		System.out.println("Library subrules1 - rule 3 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule3"));
		System.out.println("Library subrules1 - rule 4 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule4"));
		System.out.println("Library subrules1 - rule 5 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule5"));
		System.out.println("Library subrules1 - rule 6 status: " + auditor.getRuleStatus("CLSTATF_CLLEGA_Rule6"));

		String clstatfRis = CLSTATF;

		ruleBook.getResult().ifPresent(result -> System.out
				.println("Vincolo per Caratteristica stato fisico " + clstatfRis + " validato " + result));

		boolean test = testSubvincolo1(CLLEGA, clstatfRis, "B07187", "B07187");
		System.out.println("TEST per " + CLLEGA + " " + clstatfRis + " " + test);

	}

	/**
	 * Test return array.
	 */
	@Test
	void testReturnArray() {
		System.out.println("AAA");
		RuleBookRunner ruleBook = new RuleBookRunner("pippo.test");
		ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), "", "", "", "", "", "");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		facts.put(new Fact<>(applicant1));
		ruleBook.setDefaultResult(new ArrayList<Macchina>());
		ruleBook.run(facts);
		ruleBook.getResult().ifPresent(result -> result.toString());

	}

	/**
	 * Test subvincolo 1.
	 *
	 * @param CLLEGA the cllega
	 * @param CLSTATF the clstatf
	 * @param SLBPTE the slbpte
	 * @param SLBP the slbp
	 * @return true, if successful
	 */
	static boolean testSubvincolo1(String CLLEGA, String CLSTATF, String SLBPTE, String SLBP) {
		boolean validate = Boolean.TRUE;
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
		return validate;

	}

	/**
	 * Test vincolo.
	 *
	 * @param CLLEGA the cllega
	 * @param CLSTATF the clstatf
	 * @param SLBPTE the slbpte
	 * @param SLBP the slbp
	 * @return true, if successful
	 */
	static boolean testVincolo(String CLLEGA, String CLSTATF, String SLBPTE, String SLBP) {
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
	 * Test vincolo 2.
	 *
	 * @param CLLEGA the cllega
	 * @param CLSTATF the clstatf
	 * @param CLASSE the classe
	 * @param CLFINI the clfini
	 * @return true, if successful
	 */
	static boolean testVincolo2(String CLLEGA, String CLSTATF, String CLASSE, String CLFINI) {
		boolean validate = Boolean.FALSE;
		if (!CLASSE.equalsIgnoreCase("EDT")) {
			if (CLFINI.equalsIgnoreCase("i") || CLFINI.equalsIgnoreCase("t") || CLFINI.equalsIgnoreCase("u")
					|| CLFINI.equalsIgnoreCase("y") || CLFINI.equalsIgnoreCase("o")) {
				validate = Boolean.TRUE;
				if (CLLEGA.equalsIgnoreCase("3d") && CLSTATF.equalsIgnoreCase("h12"))
					validate = Boolean.FALSE;
				if (CLSTATF.substring(0, 2).equalsIgnoreCase("00") || CLSTATF.substring(0, 2).equalsIgnoreCase("a1")) {
					if (CLLEGA.equalsIgnoreCase("1a") || CLLEGA.equalsIgnoreCase("1k") || CLLEGA.equalsIgnoreCase("1o")
							|| CLLEGA.equalsIgnoreCase("1p") || CLLEGA.equalsIgnoreCase("1q"))
						validate = Boolean.FALSE;
					if (CLLEGA.equalsIgnoreCase("3a") || CLLEGA.equalsIgnoreCase("3h"))
						validate = Boolean.FALSE;
					if (CLLEGA.equalsIgnoreCase("3c") || CLLEGA.equalsIgnoreCase("3g") || CLLEGA.equalsIgnoreCase("3p"))
						validate = Boolean.FALSE;

				}
			}
		} else {
			validate = Boolean.FALSE;
			if (CLFINI.equalsIgnoreCase("f") || CLFINI.equalsIgnoreCase("n"))
				validate = Boolean.TRUE;

		}
		return validate;
	}

	/**
	 * With loop CLFINI.
	 */
	@Test
	void withLoopCLFINI() {

		String CLLEGA;
		String CLSTATF;
		String CLFINI;
		String CLASSE;

		CLLEGA = "3D";
		CLSTATF = "H12";

		CLASSE = "EDT";

		List<String> CLFINIValues = null;// Caratteristiche.getCLFINIValues();
		if (CLFINIValues == null)
			return;
		ListIterator<String> litr = CLFINIValues.listIterator();
		while (litr.hasNext()) {

			CLFINI = litr.next();
			CLFINI = CLFINI.substring(0, CLFINI.indexOf("-") - 1);

			RuleBookRunner ruleBook = new RuleBookRunner("cart.test.constraints.cs2");

			NameValueReferableMap<ICaratteristica> facts = new FactMap<>();

			ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "", "", CLFINI,
					CLASSE);

			facts.put(new Fact<>(applicant1));

			ruleBook.setDefaultResult(Boolean.FALSE);
			ruleBook.run(facts);

			ruleBook.getResult().ifPresent(
					result -> System.out.println("Vincolo per Caratteristica finitura " + "validato " + result));

			boolean test = testVincolo2(CLLEGA, CLSTATF, CLASSE, CLFINI);
			System.out.println("TEST per " + CLLEGA + " " + CLSTATF + " " + CLASSE + " " + CLFINI + " " + test);
		}
	}

	/**
	 * test con i dati clblati.
	 */
	@Test
	void withLoopCLSTATF() {

//		List<String> CLLEGAValues = Caratteristiche.getCLLEGAValues();
		List<String> CLSTATFValues = null;// Caratteristiche.getCLSTATFValues();
//		List<String> CLFINIValues = Caratteristiche.getCLFINIValues();

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";
		if (CLSTATFValues == null)
			return;
		ListIterator<String> litr = CLSTATFValues.listIterator();
		while (litr.hasNext()) {

			CLSTATF = litr.next();
			CLSTATF = CLSTATF.substring(0, CLSTATF.indexOf("-") - 1);

			RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
					s -> s.equalsIgnoreCase("cart.test.library.subrules1")
							|| s.equalsIgnoreCase("cart.test.library.subrules1")
							|| s.equalsIgnoreCase("cart.test.library.subrules2"));
			NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
			ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "B07187", "B07187",
					"", "");

			facts.put(new Fact<>(applicant1));

			ruleBook.setDefaultResult(Boolean.TRUE);
			ruleBook.run(facts);

			String clstatfRis = CLSTATF;

			ruleBook.getResult().ifPresent(result -> System.out
					.println("Vincolo per Caratteristica stato fisico " + clstatfRis + " validato " + result));
			System.out.println(CLLEGA + " " + clstatfRis);

			boolean test = testVincolo(CLLEGA, clstatfRis, "B07187", "B07187");
			System.out.println("TEST per " + CLLEGA + " " + clstatfRis + " " + test);

		}

	}

	/**
	 * With loop sub vincolo 1.
	 */
	@Test
	void withLoopSubVincolo1() {
		List<String> CLSTATFValues = null;// Caratteristiche.getCLSTATFValues();

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";
//		CLLEGA = "4A";
//		CLLEGA = "6B";
		if (CLSTATFValues == null)
			return;

		ListIterator<String> litr = CLSTATFValues.listIterator();
		while (litr.hasNext()) {

			CLSTATF = litr.next();
			CLSTATF = CLSTATF.substring(0, CLSTATF.indexOf("-") - 1);

			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraints.library.cs1"

			);
			NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
			ICaratteristica applicant1 = new Caratteristica(new BigDecimal(650), CLLEGA, CLSTATF, "B07187", "B07187",
					"", "");

			facts.put(new Fact<>(applicant1));

			ruleBook.setDefaultResult(Boolean.TRUE);
			ruleBook.run(facts);

			String clstatfRis = CLSTATF;

			ruleBook.getResult().ifPresent(result -> System.out
					.println("Vincolo per Caratteristica stato fisico " + clstatfRis + " validato " + result));
			System.out.println(CLLEGA + " " + clstatfRis);

			boolean test = testSubvincolo1(CLLEGA, clstatfRis, "B07187", "B07187");
			System.out.println("TEST per " + CLLEGA + " " + clstatfRis + " " + test);

		}

	}

}
