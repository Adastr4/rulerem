package cart.prove;

import com.deliveredtechnologies.rulebook.lang.RuleBuilder;
import com.deliveredtechnologies.rulebook.model.rulechain.cor.CoRRuleBook;

import it.profilglass.classmodel.ICaratteristica;

public class StatoFisicoRuleBook extends CoRRuleBook<String> {
	@Override
	public void defineRules() {

		addRule(RuleBuilder.create().withFactType(ICaratteristica.class).withResultType(String.class)
				.when(facts -> facts.getOne().getCLLEGA() == "3A" && (facts.getOne().getCLSTATF() == "H00"
						|| facts.getOne().getCLSTATF() == "HA1" || facts.getOne().getCLSTATF() == "H12"))
				.then((facts, result) -> result.setValue("Caratterisitca fisica ammessa")).stop().build());

	}
}