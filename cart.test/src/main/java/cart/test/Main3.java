package cart.test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

public class Main3 {

	public static void main(String[] args) {

		RuleBookRunner ruleBook = new RuleBookRunner("cart.test.test");
		NameValueReferableMap facts = new FactMap();
	    facts.setValue("fact1", "Hello");
	    facts.setValue("fact2", "World");
	    ruleBook.run(facts);
	    ruleBook.getResult().ifPresent(result -> System.out.println("Applicant qualified for the following rate: " + result));
	  

	}

}
