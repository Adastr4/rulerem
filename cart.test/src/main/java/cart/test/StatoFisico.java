package cart.test;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.lang.RuleBookBuilder;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import java.math.BigDecimal;

public class StatoFisico {
	public static void main(String[] args) {
		RuleBook statoFisicoRuleBook = RuleBookBuilder.create(StatoFisicoRuleBook.class).withResultType(String.class)
				.withDefaultResult("Caratteristica fisica  NON ammessa").build();
		NameValueReferableMap facts = new FactMap();
		facts.setValue("Caratteristica", new CaratteristicaBean(new BigDecimal(19.8), "3A", "H00", "", "", "", ""));
		statoFisicoRuleBook.run(facts);

		statoFisicoRuleBook.getResult().ifPresent(result -> System.out.println(result));
	}
}