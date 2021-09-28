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

class CicloTest {

	/**
	 * dato un elenco di caratteristiche mi restituisce la lisat delle macchine che
	 * possono lavorare quell'articolo
	 * 
	 */
	@Test
	void cicloTest() {
//		CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), CLLEGA, CLSTATF, "B07187",
//				"B07187", "", "");

		CaratteristicaBean applicant1= getCaratteristiche();
		RuleBookRunner ruleBook=creaRoleBook("");
		runRuleBook(ruleBook,applicant1);
		
		
	}

	private void runRuleBook(RuleBookRunner ruleBook, CaratteristicaBean applicant1) {
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.TRUE);
		ruleBook.run(facts);
		ruleBook.run(facts);
		
	}

	private RuleBookRunner creaRoleBook(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private RuleBookRunner creaRoleBook(List caratteristiche) {
		// TODO Auto-generated method stub
		return null;
	}

	private CaratteristicaBean getCaratteristiche() {
		// TODO Auto-generated method stub
		return null;
	}
}
