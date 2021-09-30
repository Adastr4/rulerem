package cart.test;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.CaratteristicaBean;
import test.test.Macchina;

/**
 * per la generazione del ciclo A partire da una serie di caratteristiche viene
 * restituito l'elenco delle macchine che possono lavorare il materiale
 * descritto dalle caratteristiche
 * 
 * @author nodejs
 * 
 */
class CicloTest {

	@Test
	void machinaTest() {
	
		RuleBookRunner ruleBook = new RuleBookRunner("pippo.test");
		CaratteristicaBean applicant1 = new CaratteristicaBean(new BigDecimal(650), "", "", "", "", "", "");
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
		facts.put(new Fact<>(applicant1));
		ruleBook.setDefaultResult(new ArrayList<Macchina>());
		ruleBook.run(facts);
		// Result<ArrayList> res = ruleBook.getResult().get();
		// System.out.println("Macchina " + res.getValue());
		ruleBook.getResult().ifPresent(result -> {
			ArrayList res = (ArrayList) result.getValue();
			System.out.println(res.get(0));
			// assertTrue(test==(Boolean) result.getValue());
		});
	}
	@Test
	void Macchina_3000_1O_H22_B00084_B00084_Test() {
		
		CaratteristicaBean cara = new CaratteristicaBean(new BigDecimal(3000),"1O","H22","B00084","B00084","MF","C","10000","10000", "C", "N","N" , "", "N", "H22", "1", "005", "2", "P", "0", "0", "+1,00", "-0,00",1,1, "1AA1050", "", "BA", "N");
		System.out.println("Valore visualizzato: " + cara.getSLLANASLarg());
		it.profilglass.constraints.Main.RuleMacchina(cara);
		
	}

}
