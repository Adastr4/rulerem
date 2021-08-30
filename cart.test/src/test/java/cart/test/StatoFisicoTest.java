package cart.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.lang.RuleBookBuilder;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

class StatoFisicoTest {

	@Test
	void testMain() {
		RuleBook statoFisicoRuleBook = RuleBookBuilder.create(StatoFisicoRuleBook.class).withResultType(String.class)
				.withDefaultResult("Caratteristica fisica  NON ammessa").build();
		NameValueReferableMap facts = new FactMap();
		facts.setValue("Caratteristica", new CaratteristicaBean(new BigDecimal(19.8), "3A", "H00", "", "", "", ""));
		statoFisicoRuleBook.run(facts);

		statoFisicoRuleBook.getResult().ifPresent(result -> System.out.println(result));
	}

	@Test
	void prova3DH12MTest() {

		String CLLEGA;
		String CLSTATF;
		String CLFINI;
		String CLASSE;

		CLLEGA = "3D";
		CLSTATF = "H12";
		CLFINI = "M";
		CLASSE = "EDT";

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test.constraints.cs2");

		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();

		CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), CLLEGA, CLSTATF, "", "", CLFINI,
				CLASSE);

		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.FALSE);
		ruleBook.run(facts);

		ruleBook.getResult().ifPresent(result -> {
			System.out.println("Vincolo per Caratteristica finitura " + "validato " + result);

			assertTrue((Boolean) result.getValue());

		});

	}

	@Test
	void withLoopCLSTATF() {

//		List<String> CLLEGAValues = Caratteristiche.getCLLEGAValues();
		List<String> CLSTATFValues = Caratteristiche.getCLSTATFValues();
//		List<String> CLFINIValues = Caratteristiche.getCLFINIValues();

		String CLLEGA;
		String CLSTATF;

		CLLEGA = "3A";

		ListIterator<String> litr = CLSTATFValues.listIterator();
		while (litr.hasNext()) {

			CLSTATF = litr.next();
			CLSTATF = CLSTATF.substring(0, CLSTATF.indexOf("-") - 1);

			RuleBookRunner ruleBook = new RuleBookRunner("cart.test",
					s -> s.equalsIgnoreCase("cart.test.library.subrules1")
							|| s.equalsIgnoreCase("cart.test.library.subrules1")
							|| s.equalsIgnoreCase("cart.test.library.subrules2"));
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), CLLEGA, CLSTATF, "B07187",
					"B07187", "", "");

			facts.put(new Fact<>(applicant1));

			ruleBook.setDefaultResult(Boolean.TRUE);
			ruleBook.run(facts);

			String clstatfRis = CLSTATF;

			ruleBook.getResult().ifPresent(result ->
			{
				System.out	
					.println("Vincolo per Caratteristica stato fisico " + clstatfRis + " validato " + result);
				boolean test = Main2.testVincolo(CLLEGA, clstatfRis, "B07187", "B07187");
				assertTrue(test==(Boolean) result.getValue());
			});
			

			

		}

	}
}
