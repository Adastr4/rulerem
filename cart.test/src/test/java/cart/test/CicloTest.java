package cart.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

class CicloTest {



	@Test
	void machinaTest() {
		System.out.println("AAB");
		RuleBookRunner ruleBook = new RuleBookRunner("pippo.test");
		CaratteristicaBean applicant1 = new CaratteristicaBean(
				new BigDecimal(650), "", "",  "", "", "", "");
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
		facts.put(new Fact<>(applicant1));
		ruleBook.setDefaultResult(new ArrayList<Macchina>());
		ruleBook.run(facts);
		//Result<ArrayList> res = ruleBook.getResult().get();
		//System.out.println("Macchina " + res.getValue());
		ruleBook.getResult().ifPresent(result ->
		{
			ArrayList res = (ArrayList)result.getValue();
			System.out.println(res.get(0));
			//assertTrue(test==(Boolean) result.getValue());
		});
	}
}
