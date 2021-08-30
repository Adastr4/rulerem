package cart.test;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.lang.RuleBookBuilder;
import com.deliveredtechnologies.rulebook.model.RuleBook;

public class Main {

	public static void main(String[] args) {

		/**
		 * Example Using RuleBook A HelloWorld Example
		 */
		
		RuleBook ruleBook = RuleBookBuilder.create().addRule(rule -> rule.withNoSpecifiedFactType()
				.then(f -> System.out.print("Hello ")).then(f -> System.out.println("World"))).build();

		ruleBook.run(new FactMap());

		/**
		 * Example Using RuleBook A HelloWorld Example Using Facts
		 */
		RuleBook ruleBook2 = RuleBookBuilder.create()
				.addRule(rule -> rule.withFactType(String.class).when(f -> f.containsKey("hello")).using("hello")
						.then(System.out::print))
				.addRule(rule -> rule.withFactType(String.class).when(f -> f.containsKey("world")).using("world")
						.then(System.out::println))
				.build();

		NameValueReferableMap factMap = new FactMap();
		factMap.setValue("hello", "Hello ");
		factMap.setValue("world", " World");
		ruleBook2.run(factMap);

	}

}
