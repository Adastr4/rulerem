package it.profilglass.constraints;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import test.test.CaratteristicaBean;

class MainTest {

	/*	@Test
	public void rulef092Executor500500FTest()
	{
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "500";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "K";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		SLTOLLA = "F";
		CLSPESS = new BigDecimal(500);
		
		assertEquals("AAF.K", Main.Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
	}
	
	@Test
	public void rulef092Executor1000500FTest()
	{
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "500";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "K";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		SLTOLLA = "F";
		CLSPESS = new BigDecimal(1000);
		
		assertEquals("BAF.K", Main.Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
	}
	
	@Test
	public void rulef092Executor3000500FTest()
	{
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "500";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "K";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		SLTOLLA = "F";
		CLSPESS = new BigDecimal(3000);
		
		assertEquals("CAF.K", Main.Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
	}
	
	@Test
	public void rulef092Executor7000500FTest()
	{
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "500";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "K";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		SLTOLLA = "F";
		CLSPESS = new BigDecimal(7000);
		
		assertEquals("DAF.K", Main.Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
	}
	
	@Test
	public void rulef092ExecutorWithLoopTest()
	{
		
		List<String> CLLARGValues = Caratteristiche.getCLLARGValues("BAV");
		List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		List<BigDecimal> CLSPESSValues = Caratteristiche.getCLSPESSValues("BAV");
		
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "K";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		
		ListIterator<String> litr = CLLARGValues.listIterator();			
		while (litr.hasNext()) {
			CLLARG = litr.next();
			ListIterator<String> litr2 = SLTOLLAValues.listIterator();
			while (litr2.hasNext()) {
				SLTOLLA = litr2.next();
				ListIterator<BigDecimal> litr3 = CLSPESSValues.listIterator();
				while (litr3.hasNext())
				{
					CLSPESS = litr3.next();
					assertEquals(Main.testRulef092ExecutorStandard(CLSPESS,CLLARG,SLTOLLA), Main.Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
				}
			}
		}
	}
	
	@Test
	public void rulef088Test()
	{
		
		List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "D";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		CLLARG = "0200";
		CLSPESS = new BigDecimal(200);
		
		ListIterator<String> litr2 = SLTOLLAValues.listIterator();
		while (litr2.hasNext()) {
			SLTOLLA = litr2.next();
			assertEquals(Main.testRulef088Standard(SLTOLLA,DLLATOLP), Main.Rulef088(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
		}
	}
	
	@Test
	public void rulef089Test()
	{
		
		List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		
		String CLLEGA;
		String CLSTATF;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
		String SLBPTE;
		String CLASSE;
		String CLLARG;
		String CLLUNG;
		String CLRIVE;
		String CLTOLLE;
		String DLDEST;
		String DLLAV;
		String DLLUBRI;
		String MLSTATF;
		String PLACKG;
		String PMETC;
		String QSPEC;
		String SLTOLLA;
		String DLLATOLP;
		String DLLATOLN;
		String SLLATOLP;
		String SLLATOLN;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "B";
		DLLAV = "000";
		DLLUBRI = "B";
		MLSTATF = "H28";
		PLACKG = "1";
		PMETC = "007";
		QSPEC = "";
		DLLATOLN = "K";
		DLLATOLP = "D";
		SLLATOLP = "AAP";
		SLLATOLN = "AAP";
		CLSTATF = "H00";
		CLLARG = "0200";
		CLSPESS = new BigDecimal(200);
		
		ListIterator<String> litr2 = SLTOLLAValues.listIterator();
		while (litr2.hasNext()) {
			SLTOLLA = litr2.next();
			assertEquals(Main.testRulef089Standard(SLTOLLA,DLLATOLN), Main.Rulef089(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN));
		}
	}*/
	
	//@Test
	public void ruleSLLATOLPTest()
	{
		List<CaratteristicaBean> returnCases = new ArrayList<CaratteristicaBean>();
		
		returnCases = Main.buildCases();
		
		for (CaratteristicaBean caratteristica : returnCases) {
			
			RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLP");
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
			facts.put(new Fact<>(caratteristica));
			ruleBookCLLARG.run(facts);
			
			ruleBookCLLARG.getResult().ifPresent(result -> {System.out.println("Vincolo per SLLATOLP con valore " + caratteristica.getSLLATOLP().toString() + " Valore per SLTOLLA " + caratteristica.getSLTOLLA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per DLLATOLP " + caratteristica.getDLLATOLP().toString() + " validato " + result.toString());
															assertEquals((Boolean) result.getValue(), Main.testRuleSLLATOLPStandard(caratteristica.getCLSPESS(),caratteristica.getCLLARG().toString(),caratteristica.getSLTOLLA().toString(), caratteristica.getDLLATOLP().toString(),caratteristica.getSLLATOLP().toString()));
												});	
		}
	}
	
	//@Test
	public void ruleSLLATOLPSingleTest()
	{
		CaratteristicaBean caratteristica = new CaratteristicaBean(new BigDecimal(620), "", "", "", "", "", "", "500", "", "", "", "", "", "", "", "", "", "", "F", "0", "", "BAF.0.1", "",1,1,"3CJ1240","B11","BA","N");
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLP");
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			
		ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
		facts.put(new Fact<>(caratteristica));
		ruleBookCLLARG.run(facts);
		
		ruleBookCLLARG.getResult().ifPresent(result -> {System.out.println("Vincolo per SLLATOLP con valore " + caratteristica.getSLLATOLP().toString() + " Valore per SLTOLLA " + caratteristica.getSLTOLLA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per DLLATOLP " + caratteristica.getDLLATOLP().toString() + " validato " + result.toString());
														assertEquals((Boolean) result.getValue(), Main.testRuleSLLATOLPStandard(caratteristica.getCLSPESS(),caratteristica.getCLLARG().toString(),caratteristica.getSLTOLLA().toString(), caratteristica.getDLLATOLP().toString(),caratteristica.getSLLATOLP().toString()));
											});
	}
	
	//@Test
	public void ruleSLLATOLNTest()
	{
		List<CaratteristicaBean> returnCases = new ArrayList<CaratteristicaBean>();
		
		returnCases = Main.buildCases();
		
		for (CaratteristicaBean caratteristica : returnCases) {
			
			RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLN");
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
			facts.put(new Fact<>(caratteristica));
			ruleBookCLLARG.run(facts);
			
			ruleBookCLLARG.getResult().ifPresent(result -> {System.out.println("Vincolo per SLLATOLN con valore " + caratteristica.getSLLATOLN().toString() + " Valore per SLTOLLA " + caratteristica.getSLTOLLA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per DLLATOLN " + caratteristica.getDLLATOLN().toString() + " validato " + result.toString());
															assertEquals((Boolean) result.getValue(), Main.testRuleSLLATOLNStandard(caratteristica.getCLSPESS(),caratteristica.getCLLARG().toString(),caratteristica.getSLTOLLA().toString(), caratteristica.getDLLATOLN().toString(),caratteristica.getSLLATOLN().toString()));
												});	
		}
	}
	
	//@Test
	public void ruleSLLATOLNSingleTest()
	{
		CaratteristicaBean caratteristica = new CaratteristicaBean(new BigDecimal(620), "", "", "", "", "", "", "500", "", "", "", "", "", "", "", "", "", "", "F", "", "0", "", "BAF.0.1",1,1,"3CJ1240","B11","BA","N");
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLN");
		NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			
		ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
		facts.put(new Fact<>(caratteristica));
		ruleBookCLLARG.run(facts);
		
		ruleBookCLLARG.getResult().ifPresent(result -> {System.out.println("Vincolo per SLLATOLN con valore " + caratteristica.getSLLATOLN().toString() + " Valore per SLTOLLA " + caratteristica.getSLTOLLA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per DLLATOLN " + caratteristica.getDLLATOLN().toString() + " validato " + result.toString());
														assertEquals((Boolean) result.getValue(), Main.testRuleSLLATOLNStandard(caratteristica.getCLSPESS(),caratteristica.getCLLARG().toString(),caratteristica.getSLTOLLA().toString(), caratteristica.getDLLATOLN().toString(),caratteristica.getSLLATOLN().toString()));
											});
	}
	
	//@Test
	public void ruleCLSTATFTest()
	{
		List<CaratteristicaBean> returnCases = new ArrayList<CaratteristicaBean>();
		
		returnCases = Main.buildCases();

		for (CaratteristicaBean caratteristica : returnCases) {
			
			RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.CLSTATF");
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
			facts.put(new Fact<>(caratteristica));
			ruleBookCLLARG.run(facts);
			
			ruleBookCLLARG.getResult().ifPresent(result -> {System.out.println("Vincolo per CLSTATF con valore " + caratteristica.getCLSTATF().toString() + " Valore per CLLEGA " + caratteristica.getCLLEGA().toString() + "; per SLBPTE " + caratteristica.getSLBPTE().toString() + "; per SLBP " + caratteristica.getSLBP().toString() + " validato " + result.toString());
															assertEquals((Boolean) result.getValue(), Main.testCLSTATFRuleStandard(caratteristica.getCLLEGA().toString(),caratteristica.getCLSTATF().toString(),caratteristica.getSLBPTE().toString(), caratteristica.getSLBP().toString()));
												});	
		}
	}
	
	@Test
	public void ruleMLSTATFTest()
	{
		List<CaratteristicaBean> returnCases = new ArrayList<CaratteristicaBean>();
		
		returnCases = Main.buildCases();

		for (CaratteristicaBean caratteristica : returnCases) {
			
			RuleBookRunner ruleBookMLSTATF = new RuleBookRunner("it.profilglass.constraint.bav.MLSTATF");
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			ruleBookMLSTATF.setDefaultResult(caratteristica.getCLSTATF());
			facts.setValue("caratteristica", caratteristica);
			ruleBookMLSTATF.run(facts);
			
			ruleBookMLSTATF.getResult().ifPresent(result -> {System.out.println("Vincolo per CLSTATF con valore " + caratteristica.getCLSTATF().toString() + " Valore per CLLEGA " + caratteristica.getCLLEGA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per SLBP " + caratteristica.getSLBP().toString() + "; per CLLUNG " + caratteristica.getCLLUNG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per CLRIVE " + caratteristica.getCLRIVE().toString() + ";  validato " + result.toString());
															assertEquals((String) result.getValue(), Main.testMLSTATFRuleStandard(caratteristica.getCLLEGA().toString(), caratteristica.getCLSTATF().toString(), caratteristica.getCLLARG().toString(), caratteristica.getCLLUNG().toString(), caratteristica.getCLSPESS(), caratteristica.getCLRIVE().toString(), caratteristica.getDLDEST().toString(), caratteristica.getSLBP().toString()));
												});	
		}
	}

}
