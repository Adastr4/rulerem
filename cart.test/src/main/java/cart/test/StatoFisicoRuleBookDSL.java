package cart.test;

import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.lang.RuleBookBuilder;
import com.deliveredtechnologies.rulebook.lang.RuleBuilder;
import com.deliveredtechnologies.rulebook.model.rulechain.cor.CoRRuleBook;

public class StatoFisicoRuleBookDSL {

	public static void main(String args[]) {

		NameValueReferableMap factMap = new FactMap();
		factMap.setValue("number of pets", Integer.valueOf(args[0]));
		factMap.setValue("number of kids", Integer.valueOf(args[1]));
		/*
		 * RuleBook petRuleBook = RuleBookBuilder.create().withResultType(String.class)
		 * .withDefaultResult("You're probably lonely. You could use a pet!")
		 * .addRule(rule -> rule .when(facts -> facts.IntVal("number of pets") == 0)
		 * .then(facts -> facts.setValue("pet owner", false))) .addRule(rule -> rule
		 * .when(facts -> facts.IntVal("number of kids") > 0) .then(facts ->
		 * facts.setValue("parent", true))) .addRule(rule ->
		 * rule.withFactType(Boolean.class) .when(facts -> facts.getValue("parent") &&
		 * !facts.getValue("pet owner")) .then((facts, result) ->
		 * result.setValue("You should get a pet. Every kid should have a pet."))
		 * .stop()) .addRule(rule -> rule.withFactType(Boolean.class) .when(facts ->
		 * facts.getValue("pet owner")) .then((facts, result) ->
		 * result.setValue("You're a pet owner. That's awesome!"))) .build();
		 */
		NameValueReferableMap<String> facts2 = new FactMap<String>();
		facts2.setValue("sheds", "poodle");
		facts2.setValue("color", "red");
		RuleBook<String> ruleBook = RuleBookBuilder.create().withResultType(String.class)
				.withDefaultResult("unknown breed")
				.addRule(rule -> rule.withFactType(Boolean.class).when(facts -> !facts.getValue("sheds"))
						.then((facts, result) -> result.setValue("poodle")))
				.addRule(rule -> rule.withFactType(Boolean.class).when(facts -> facts2.containsKey("color"))
						.then((facts, result) -> result.setValue(facts.getValue("color") + " " + result.getValue())))
				.build();

		ruleBook.run(facts2); // assume that facts was a NameValueReferableMap previously created
		ruleBook.getResult().ifPresent(System.out::println);

	}
}