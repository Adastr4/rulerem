package cart.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.Macchina;


/**
 * per la generazione del ciclo A partire da una serie di caratteristiche viene
 * restituito l'elenco delle macchine che possono lavorare il materiale
 * descritto dalle caratteristiche
 *
 * @author nodejs
 *
 */

class CicloTest {
	/**
	 * dato un elenco di caratteristiche mi restituisce la lisat delle macchine che
	 * possono lavorare quell'articolo
	 *
	 */
	@Test
	void cicloTest() {

		ICaratteristica applicant1 = getCaratteristiche();
		RuleBookRunner ruleBook = creaRoleBook("");
		runRuleBook(ruleBook, applicant1);

	}

	private RuleBookRunner creaRoleBook(List caratteristiche) {
		// TODO Auto-generated method stub
		return null;
	}

	private RuleBookRunner creaRoleBook(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	private ICaratteristica getCaratteristiche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void Macchina_3000_1O_H22_B00084_B00084_1000_1000_Test() {

		ICaratteristica cara = new Caratteristica(new BigDecimal(3000),"1O","H22","B00084","B00084","MF","C","1000","1000", "C", "N","N" , "", "N", "H22", "1", "005", "2", "P", "0", "0", "+1,00", "-0,00",1,1, "1AA1050", "", "BA", "N");
		System.out.println("Valore visualizzato: " + cara.getSLLANASLarg());
		it.profilglass.constraints.Main.RuleMacchina(cara);

	}

	@Test
	void Macchina_3000_1O_H22_B00084_B00084_1111_2222_Test() {

		RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.macchina");
		ICaratteristica caratteristica = new Caratteristica(new BigDecimal(1), "1O", "H22", "B00084", "B00084", "M",
				"C", "1111", "2222", "C", "N", "N", "", "N", "H22", "1", "005", "2", "P", "0", "0", "+1,00", "-0,00", 1,
				1, "1AA150", "", "BA", "N");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		facts.setValue("caratteristica", caratteristica);
		ruleBook.setDefaultResult(new ArrayList<Macchina>());
		ruleBook.run(facts);
		// Result<ArrayList> res = ruleBook.getResult().get();
		// System.out.println("Macchina " + res.getValue());
		ruleBook.getResult().ifPresent(result -> {
			ArrayList res = (ArrayList) result.getValue();
			assertTrue(res.size()==1);
		});
	}

	@Test
	void Macchina_3000_1O_H22_B00084_B00084_Test() {

		RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.macchina");
		ICaratteristica caratteristica = new Caratteristica(new BigDecimal(3000), "1O", "H22", "B00084", "B00084", "MF",
				"C", "10000", "10000", "C", "N", "N", "", "N", "H22", "1", "005", "2", "P", "0", "0", "+1,00", "-0,00",
				1, 1, "1AA1050", "", "BA", "N");

		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		facts.setValue("caratteristica", caratteristica);

		ruleBook.setDefaultResult(new ArrayList<Macchina>());
		ruleBook.run(facts);

		ruleBook.getResult().ifPresent(result -> {
			ArrayList res = (ArrayList) result.getValue();
			assertTrue(res.size()==0);
		});

	}

	private void runRuleBook(RuleBookRunner ruleBook, ICaratteristica applicant1) {
		if (applicant1==null) return;
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		facts.put(new Fact<>(applicant1));

		ruleBook.setDefaultResult(Boolean.TRUE);
		ruleBook.run(facts);


	}

}
