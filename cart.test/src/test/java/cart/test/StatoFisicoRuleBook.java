package cart.test;

import com.deliveredtechnologies.rulebook.lang.RuleBuilder;
import com.deliveredtechnologies.rulebook.model.rulechain.cor.CoRRuleBook;

import test.test.CaratteristicaBean;

public class StatoFisicoRuleBook extends CoRRuleBook<String> {
	@Override
	public void defineRules() {

		addRule(RuleBuilder.create().withFactType(CaratteristicaBean.class).withResultType(String.class)
				.when(facts -> facts.getOne().getCLLEGA() == "3A" && (facts.getOne().getCLSTATF() == "H00"
						|| facts.getOne().getCLSTATF() == "HA1" || facts.getOne().getCLSTATF() == "H12"))
				.then((facts, result) -> result.setValue("Caratterisitca fisica ammessa")).stop().build());

	}
}