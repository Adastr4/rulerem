package test.test;

import com.deliveredtechnologies.rulebook.lang.RuleBuilder;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.model.RuleBookAuditor;
import com.deliveredtechnologies.rulebook.model.rulechain.cor.CoRRuleBook;

public class CaratteristicheRuleBook extends RuleBookAuditor<Boolean> {
	public CaratteristicheRuleBook() {
		this(new CoRRuleBook<>());
	}

	public CaratteristicheRuleBook(RuleBook<Boolean> ruleBook) {
		super(ruleBook);
	}

	@Override
	public void defineRules() {

		addRule(RuleBuilder.create().withResultType(Boolean.class).withName("Rule1")
				.when(facts -> facts.getStrVal("CLSTATF").equalsIgnoreCase("t04")
						|| facts.getStrVal("CLSTATF").equalsIgnoreCase("t06")
						|| facts.getStrVal("CLSTATF").equalsIgnoreCase("t4p"))
				.then((facts, result) -> result.setValue(Boolean.FALSE))
				.then((facts, result) -> System.out.println("Risultato Rule1 " + result.getValue())).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class).withName("Rule2")
				.when(facts -> facts.getStrVal("CLLEGA").substring(0, 1).equalsIgnoreCase("1")
						&& facts.getStrVal("CLSTATF").substring(0, 2).equalsIgnoreCase("h3"))
				.then((facts, result) -> result.setValue(Boolean.FALSE))
				.then((facts, result) -> System.out.println("Risultato Rule2 " + result.getValue())).stop().build());

// **********************************************
		// nested if togliamo lo stop()
		// if CLLEGA(1:1) == '3
		addRule(RuleBuilder.create().withResultType(Boolean.class).withName("Rule3")
				.when(facts -> facts.getStrVal("CLLEGA").substring(0, 1).equalsIgnoreCase("3"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).build());
		// if CLSTATF(1:2) == H3
		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLSTAF").substring(1, 2).equalsIgnoreCase("h3")

				).then((facts, result) -> result.setValue(Boolean.FALSE)).stop().build());
		// else
		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLLEGA").equalsIgnoreCase("3a")
						&& (facts.getStrVal("CLSTAF").equalsIgnoreCase("h00")
								|| facts.getStrVal("CLSTAF").equalsIgnoreCase("ha1")
								|| facts.getStrVal("CLSTAF").equalsIgnoreCase("h12")
								|| facts.getStrVal("CLSTAF").equalsIgnoreCase("h15")
								|| facts.getStrVal("CLSTAF").equalsIgnoreCase("h16")
								|| facts.getStrVal("CLSTAF").equalsIgnoreCase("h17")))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("SLBPTE").equalsIgnoreCase("b07187")
						|| facts.getStrVal("SLBPTE").equalsIgnoreCase("b03835")
						|| facts.getStrVal("SLBPTE").equalsIgnoreCase("b07434"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("SLBPTE").equalsIgnoreCase("slbp")
						&& facts.getStrVal("CLSTATF").equalsIgnoreCase("h14"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)

				.then((facts, result) -> result.setValue(Boolean.FALSE)).stop().build());

// ***************************
		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLLEGA").substring(1, 1).equalsIgnoreCase("4")
						&& facts.getStrVal("CLSTATF").substring(1, 2).equalsIgnoreCase("h3"))
				.then((facts, result) -> result.setValue(Boolean.FALSE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> !facts.getStrVal("CLLEGA").substring(1, 1).equalsIgnoreCase("6"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLSTATF").substring(1, 2).equalsIgnoreCase("h3"))
				.then((facts, result) -> result.setValue(Boolean.FALSE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLSTATF").equalsIgnoreCase("t04")
						|| facts.getStrVal("CLSTATF").equalsIgnoreCase("t06")
						|| facts.getStrVal("CLSTATF").equalsIgnoreCase("t4p"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).stop().build());

		addRule(RuleBuilder.create().withResultType(Boolean.class)
				.when(facts -> facts.getStrVal("CLLEGA").substring(1, 1).equalsIgnoreCase("8")
						&& facts.getStrVal("CLSTATF").substring(1, 2).equalsIgnoreCase("h3"))
				.then((facts, result) -> result.setValue(Boolean.TRUE)).stop().build());

	}
}
