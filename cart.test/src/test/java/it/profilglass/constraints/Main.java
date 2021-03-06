package it.profilglass.constraints;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import cart.prove.Caratteristiche;
import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.ConfiguratoreBAV;
import it.profilglass.classmodel.GenericConfItem;
import it.profilglass.classmodel.GenericItem;
import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.LivelloDistinta;
import it.profilglass.classmodel.Macchina;


public class Main {

	static List<ICaratteristica> buildCases()
	{
		//List<String> CLLARGValues = Caratteristiche.getCLLARGValues("BAV");
		List<String> CLLARGValues = new ArrayList<>();
		List<BigDecimal> CLSPESSValues = new ArrayList<>();
		//List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		List<String> SLTOLLAValues = new ArrayList<>();
		//List<BigDecimal> CLSPESSValues = Caratteristiche.getCLSPESSValues("BAV");
		//List<String> SLLATOLPValues = Caratteristiche.getSLLATOLPValues("BAV");
		List<String> SLLATOLPValues = new ArrayList<>();
		List<String> DLLATOLPValues = new ArrayList<>();
		List<String> CLLEGAValues = new ArrayList<>();
		List<String> CLSTATFValues = new ArrayList<>();
		List<String> SLBPTEValues = new ArrayList<>();
		List<String> SLBPValues = new ArrayList<>();
		List<String> SLLANASValues = new ArrayList<>();
		List<String> QLLAVDETValues = new ArrayList<>();
		List<String> SLMODValues = new ArrayList<>();
		List<String> QLLAVValues = new ArrayList<>();

		List<ICaratteristica> returnCases = new ArrayList<>();

		SLTOLLAValues.add("F");

		SLLATOLPValues.add("F");

		CLLARGValues.add("500");
		CLLARGValues.add("1500");
		CLLARGValues.add("3000");
		CLLARGValues.add("4500");
		CLLARGValues.add("7000");
		CLLARGValues.add("11000");
		CLLARGValues.add("13000");

		CLSPESSValues.add(new BigDecimal(500));
		CLSPESSValues.add(new BigDecimal(620));
		CLSPESSValues.add(new BigDecimal(1000));
		CLSPESSValues.add(new BigDecimal(3000));
		CLSPESSValues.add(new BigDecimal(6000));
		CLSPESSValues.add(new BigDecimal(6001));

		DLLATOLPValues.add("0.2");
		DLLATOLPValues.add("-1");
		DLLATOLPValues.add("0.75");
		DLLATOLPValues.add("0.08");
		DLLATOLPValues.add("1.6");
		DLLATOLPValues.add("1.1");
		DLLATOLPValues.add("0.04");
		DLLATOLPValues.add("0.15");
		DLLATOLPValues.add(".5");
		DLLATOLPValues.add("0");
		DLLATOLPValues.add("0.1");
		DLLATOLPValues.add("0.8");
		DLLATOLPValues.add("2");
		DLLATOLPValues.add("0.25");
		DLLATOLPValues.add("0.05");
		DLLATOLPValues.add("0.3");
		DLLATOLPValues.add("1.5");

		CLLEGAValues.add("1A");
		CLLEGAValues.add("1B");
		CLLEGAValues.add("1D");
		CLLEGAValues.add("1K");
		CLLEGAValues.add("1O");
		CLLEGAValues.add("1Q");
		CLLEGAValues.add("3A");
		CLLEGAValues.add("3B");
		CLLEGAValues.add("3C");
		CLLEGAValues.add("3D");
		CLLEGAValues.add("3G");
		CLLEGAValues.add("5E");
		CLLEGAValues.add("6B");

		CLSTATFValues.add("H00");
		CLSTATFValues.add("H0F");
		CLSTATFValues.add("H12");
		CLSTATFValues.add("H14");
		CLSTATFValues.add("H15");
		CLSTATFValues.add("H16");
		CLSTATFValues.add("H18");
		CLSTATFValues.add("H27");
		CLSTATFValues.add("HA1");
		CLSTATFValues.add("H44");
		CLSTATFValues.add("HD4");
		CLSTATFValues.add("T00");
		CLSTATFValues.add("T04");
		CLSTATFValues.add("T06");
		CLSTATFValues.add("T22");
		CLSTATFValues.add("T24");
		CLSTATFValues.add("T4P");
		CLSTATFValues.add("TA1");

		SLBPTEValues.add("B07187");
		SLBPTEValues.add("B03835");
		SLBPTEValues.add("B07434");
		SLBPTEValues.add("B01111");
		SLBPTEValues.add("B01112");

		SLBPValues.add("B07187");
		SLBPValues.add("B03835");
		SLBPValues.add("B07434");
		SLBPValues.add("B01111");
		SLBPValues.add("B01112");

		SLLANASValues.add("3CJ1240");

		QLLAVDETValues.add("A01");

		SLMODValues.add("BA");

		QLLAVValues.add("N");
		QLLAVValues.add("C");

		String CLLEGA;
		BigDecimal CLSPESS;
		String SLBP;
		String CLFINI;
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
		String CLSTATF;
		String SLBPTE;
		String SLLANAS;
		String QLLAVDET;
		String SLMOD;
		String QLLAV;

		CLLEGA = "3A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "2000";
		CLLUNG = "01280";
		CLRIVE = "A";
		CLTOLLE = "C";
		DLDEST = "PERC";
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
					ListIterator<String> litr4 = SLLATOLPValues.listIterator();
					while (litr4.hasNext())
					{
						SLLATOLP = litr4.next();
						ListIterator<String> litr5 = DLLATOLPValues.listIterator();
						while (litr5.hasNext())
						{
							DLLATOLP = litr5.next();
							ListIterator<String> litr6 = CLLEGAValues.listIterator();
							while (litr6.hasNext())
							{
								CLLEGA = litr6.next();
								ListIterator<String> litr7 = CLSTATFValues.listIterator();
								while (litr7.hasNext())
								{
									CLSTATF = litr7.next();
									ListIterator<String> litr8 = SLBPTEValues.listIterator();
									while (litr8.hasNext())
									{
										SLBPTE = litr8.next();
										ListIterator<String> litr9 = SLBPValues.listIterator();
										while (litr9.hasNext())
										{
											SLBP = litr9.next();
											ListIterator<String> litr10 = SLLANASValues.listIterator();
											while (litr10.hasNext())
											{
												SLLANAS = litr10.next();
												ListIterator<String> litr11 = QLLAVDETValues.listIterator();
												while (litr11.hasNext())
												{
													QLLAVDET = litr11.next();
													ListIterator<String> litr12 = SLMODValues.listIterator();
													while (litr12.hasNext())
													{
														SLMOD = litr12.next();
														ListIterator<String> litr13 = QLLAVValues.listIterator();
														while (litr13.hasNext())
														{
															QLLAV = litr13.next();
															returnCases.add(new Caratteristica(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLP, SLLATOLP, SLLATOLP,1,1, SLLANAS, QLLAVDET, SLMOD, QLLAV));
														}
													}
												}
											}
										}
									}
								}

							}
						}
					}
				}
			}
		}

		return returnCases;
	}

	public static List<LivelloDistinta> distintaDefault()
	{
		List<LivelloDistinta> distinta = new ArrayList<>();
		distinta.add(new LivelloDistinta(new GenericItem("BA5F3000HA11000020000MNA","BA",null),1,1));
		distinta.add(new LivelloDistinta(new GenericItem("LB5F3000HA1MN","LB",null),2,1));
		distinta.add(new LivelloDistinta(new GenericItem("IMCARG90L1000","IMCAR",null),2,2));
		return distinta;
	}

	public static void main(String[] args) {

		GenericConfItem item = new GenericConfItem(new ConfiguratoreBAV(), "BAV");
		item.getConf().getCaratteristicaById("CLFINI").setSelectedValue("M");
		item.getConf().getCaratteristicaById("CLLEGA").setSelectedValue("5F");
		item.getConf().getCaratteristicaById("CLSPESS").setSelectedValue("3000");
		item.getConf().getCaratteristicaById("CLSTATF").setSelectedValue("HA1");
		item.getConf().getCaratteristicaById("MLSTATF").setSelectedValue("HA1");
		item.getConf().getCaratteristicaById("CLLARG").setSelectedValue("10000");
		item.getConf().getCaratteristicaById("CLLUNG").setSelectedValue("20000");
		item.getConf().getCaratteristicaById("CLTOLLE").setSelectedValue("N");
		item.getConf().getCaratteristicaById("CLRIVE").setSelectedValue("A");
		item.getConf().getCaratteristicaById("SLLANAS").setSelectedValue("FAB1040");
		RunDistintaNew(item);
	}

	public static String Rulef088(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP, String CLFINI, String CLASSE, String CLLARG, String CLLUNG, String CLRIVE, String CLTOLLE, String DLDEST, String DLLAV, String DLLUBRI, String MLSTATF, String PLACKG, String PMETC, String QSPEC, String SLTOLLA, String DLLATOLP, String DLLATOLN, String SLLATOLP, String SLLATOLN, String QLLAVDET, String SLMOD, String QLLAV)
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.f088");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN, 1, 1, "3CJ1240", QLLAVDET, SLMOD, QLLAV);

		facts.put(new Fact<>(applicant1));
		ruleBookCLLARG.run(facts);

		StringBuilder totalString = new StringBuilder();
		ruleBookCLLARG.getResult().ifPresent(result -> totalString.append(result.toString()));

		System.out.println("Vincolo per DLLATOLP. Valore per SLTOLLA " + SLTOLLA.toString() + " -> DLLATOLP " + totalString.toString());

		return totalString.toString();
	}

	public static String Rulef089(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP, String CLFINI, String CLASSE, String CLLARG, String CLLUNG, String CLRIVE, String CLTOLLE, String DLDEST, String DLLAV, String DLLUBRI, String MLSTATF, String PLACKG, String PMETC, String QSPEC, String SLTOLLA, String DLLATOLP, String DLLATOLN, String SLLATOLP, String SLLATOLN, String SLLANAS, String QLLAVDET, String SLMOD, String QLLAV)
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.f089");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN, 1, 1, SLLANAS, QLLAVDET, SLMOD, QLLAV);

		facts.put(new Fact<>(applicant1));
		ruleBookCLLARG.run(facts);

		StringBuilder totalString = new StringBuilder();
		ruleBookCLLARG.getResult().ifPresent(result -> totalString.append(result.toString()));

		System.out.println("Vincolo per DLLATOLP. Valore per SLTOLLA " + SLTOLLA.toString() + " -> DLLATOLN " + totalString.toString());

		return totalString.toString();
	}

	private static String Rulef092CLLARGExecutor(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP, String CLFINI, String CLASSE, String CLLARG, String CLLUNG, String CLRIVE, String CLTOLLE, String DLDEST, String DLLAV, String DLLUBRI, String MLSTATF, String PLACKG, String PMETC, String QSPEC, String SLTOLLA, String DLLATOLP, String DLLATOLN, String SLLATOLP, String SLLATOLN, String SLLANAS, String QLLAVDET, String SLMOD, String QLLAV)
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.f092.CLLARG");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN,1,1, SLLANAS, QLLAVDET, SLMOD, QLLAV);

		facts.put(new Fact<>(applicant1));
		ruleBookCLLARG.run(facts);

		StringBuilder totalString = new StringBuilder();
		ruleBookCLLARG.getResult().ifPresent(result -> totalString.append(result.toString()));

		System.out.println("Vincolo per Caratteristica larghezza " + CLLARG.toString() + " valore " + totalString.toString());

		return totalString.toString();
	}

	private static void Rulef092CLLARGExecutorList()
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.f092.CLLARG");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();

		List<ICaratteristica> applicanti = buildCases();

		for (ICaratteristica applicante : applicanti) {
			facts.put(new Fact<>(applicante));
		}

		ruleBookCLLARG.run(facts);

		StringBuilder totalString = new StringBuilder();
		ruleBookCLLARG.getResult().ifPresent(result -> {totalString.append(result.toString()); System.out.println("Vincolo per Caratteristica larghezza valore " + result.toString());});

		//System.out.println("Vincolo per Caratteristica larghezza " + CLLARG.toString() + " valore " + totalString.toString());

		//return totalString.toString();
	}

	static String Rulef092Executor(BigDecimal CLSPESS, String CLLEGA, String CLSTATF, String SLBPTE, String SLBP, String CLFINI, String CLASSE, String CLLARG, String CLLUNG, String CLRIVE, String CLTOLLE, String DLDEST, String DLLAV, String DLLUBRI, String MLSTATF, String PLACKG, String PMETC, String QSPEC, String SLTOLLA, String DLLATOLP, String DLLATOLN, String SLLATOLP, String SLLATOLN, String SLLANAS, String QLLAVDET, String SLMOD, String QLLAV) {
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.f092.CLLARG");
		RuleBookRunner ruleBookCLSPESS = new RuleBookRunner("it.profilglass.constraint.bav.f092.CLSPESS");
		RuleBookRunner ruleBookSLTOLLA = new RuleBookRunner("it.profilglass.constraint.bav.f092.SLTOLLA");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN,1,1, SLLANAS, QLLAVDET, SLMOD, QLLAV);

		facts.put(new Fact<>(applicant1));

		ruleBookCLLARG.run(facts);
		ruleBookCLSPESS.run(facts);
		ruleBookSLTOLLA.run(facts);

		String cllargRis = CLLARG;
		String tolleRis = SLTOLLA;
		BigDecimal spessRis = CLSPESS;

		StringBuilder totalString = new StringBuilder();
		ruleBookCLSPESS.getResult().ifPresent(result -> totalString.append(result.toString()));
		ruleBookCLLARG.getResult().ifPresent(result -> totalString.append(result.toString()));
		ruleBookSLTOLLA.getResult().ifPresent(result -> totalString.append(result.toString()));

		System.out.println("Vincolo per Caratteristica larghezza " + cllargRis + ", tolleranza " + tolleRis + " e spessore " + spessRis.toString() + " con risultato per stolla " + totalString.toString());

		return totalString.toString();
	}

	public static void RuleMacchina(ICaratteristica caratteristica)
	{
		ArrayList<Macchina> macchine = new ArrayList<>();
		RuleBookRunner ruleBookMacchina = new RuleBookRunner("it.profilglass.constraint.bav.macchina");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();

		facts.setValue("caratteristica", caratteristica);
		ruleBookMacchina.setDefaultResult(new ArrayList<Macchina>());
		ruleBookMacchina.run(facts);

		if(ruleBookMacchina.getResult().isPresent())
		{
			macchine = (ArrayList<Macchina>) ruleBookMacchina.getResult().get().getValue();
			System.out.println("Lista Macchine:");
			for(Macchina macch : macchine)
			{
				System.out.println(macch.getIdMacchina());
			}
		}

		//ruleBookMacchina.getResult().ifPresent(result -> macchine = (ArrayList<Macchina>) result.stream().collect(Collectors.toList()))));


	}

	private static void ruleMLSTATFTest()
	{
		List<ICaratteristica> returnCases = new ArrayList<>();

		returnCases = Main.buildCases();

		for (ICaratteristica caratteristica : returnCases) {

			testMLSTATFRuleStandard(caratteristica.getCLLEGA(), caratteristica.getCLSTATF(), caratteristica.getCLLARG(), caratteristica.getCLLUNG(), caratteristica.getCLSPESS(), caratteristica.getCLRIVE(), caratteristica.getDLDEST(), caratteristica.getSLBP());
			/*RuleBookRunner ruleBookMLSTATF = new RuleBookRunner("it.profilglass.constraint.bav.val.MLSTATF");
			NameValueReferableMap<CaratteristicaBean> facts = new FactMap<>();
			ruleBookMLSTATF.setDefaultResult(caratteristica.getCLSTATF());
			facts.put(new Fact<>(caratteristica));
			ruleBookMLSTATF.run(facts);

			ruleBookMLSTATF.getResult().ifPresent(result -> {System.out.println("Vincolo per MLSTATF con valore " + caratteristica.getMLSTATF().toString() + " Valore per CLLEGA " + caratteristica.getCLLEGA().toString() + "; per CLLARG " + caratteristica.getCLLARG().toString() + "; per SLBP " + caratteristica.getSLBP().toString() + "; per CLLUNG " + caratteristica.getCLLUNG().toString() + "; per CLSPESS " + caratteristica.getCLSPESS().toString() + "; per CLRIVE " + caratteristica.getCLRIVE().toString() + " validato " + result.toString());
															assertEquals((String) result.getValue(), Main.testMLSTATFRuleStandard(caratteristica.getCLLEGA().toString(), caratteristica.getCLSTATF().toString(), caratteristica.getCLLARG().toString(), caratteristica.getCLLUNG().toString(), caratteristica.getCLSPESS(), caratteristica.getCLRIVE().toString(), caratteristica.getDLDEST().toString(), caratteristica.getSLBP().toString()));
												});	*/

		}
	}

	public static void RuleSLLATOLN(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLN, String SLLATOLN)
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLN");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, "A3", "H00", "A", "", "", "", CLLARG, "", "", "", "", "", "", "", "", "", "", SLTOLLA, "" , DLLATOLN, "" , SLLATOLN,1,1,"3CJ1240","B11","BA","N");

		ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
		facts.put(new Fact<>(applicant1));
		ruleBookCLLARG.run(facts);

		ruleBookCLLARG.getResult().ifPresent(result -> System.out.println("Vincolo per SLLATOLN con valore " + SLLATOLN.toString() + " Valore per SLTOLLA " + SLTOLLA.toString() + "; per CLLARG " + CLLARG.toString() + "; per CLSPESS " + CLSPESS.toString() + "; per DLLATOLN " + DLLATOLN.toString() + " validato " + result.toString()));
	}

	public static void RuleSLLATOLNIterator()
	{
		List<String> CLLARGValues = Caratteristiche.getCLLARGValues("BAV");
		List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		List<BigDecimal> CLSPESSValues = Caratteristiche.getCLSPESSValues("BAV");
		List<String> SLLATOLNValues = Caratteristiche.getSLLATOLNValues("BAV");

		String CLLARG;
		String SLTOLLA;
		BigDecimal CLSPESS;
		String SLLATOLN;
		String DLLATOLN;

		DLLATOLN= "0.5";

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
					ListIterator<String> litr4 =SLLATOLNValues.listIterator();
					while (litr4.hasNext())
					{
						SLLATOLN = litr4.next();
						RuleSLLATOLN(CLSPESS,CLLARG,SLTOLLA,DLLATOLN,SLLATOLN);
					}
				}
			}
		}
	}

	public static void RuleSLLATOLNNoIterator(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLN, String SLLATOLN)
	{
		RuleSLLATOLN(CLSPESS,CLLARG,SLTOLLA,DLLATOLN,SLLATOLN);
	}

	public static void RuleSLLATOLP(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLP, String SLLATOLP)
	{
		RuleBookRunner ruleBookCLLARG = new RuleBookRunner("it.profilglass.constraint.bav.val.SLLATOLP");
		NameValueReferableMap<ICaratteristica> facts = new FactMap<>();
		ICaratteristica applicant1 = new Caratteristica(CLSPESS, "A3", "H00", "A", "", "", "", CLLARG, "", "", "", "", "", "", "", "", "", "", SLTOLLA, DLLATOLP, "", SLLATOLP, "",1,1,"3CJ1240","B11","BA","N");

		ruleBookCLLARG.setDefaultResult(Boolean.TRUE);
		facts.put(new Fact<>(applicant1));
		ruleBookCLLARG.run(facts);

		ruleBookCLLARG.getResult().ifPresent(result -> System.out.println("Vincolo per SLLATOLP con valore " + SLLATOLP.toString() + " Valore per SLTOLLA " + SLTOLLA.toString() + "; per CLLARG " + CLLARG.toString() + "; per CLSPESS " + CLSPESS.toString() + "; per DLLATOLP " + DLLATOLP.toString() + " validato " + result.toString()));
	}

	public static void RuleSLLATOLPIterator()
	{
		List<String> CLLARGValues = Caratteristiche.getCLLARGValues("BAV");
		List<String> SLTOLLAValues = Caratteristiche.getSLTOLLAValues("BAV");
		List<BigDecimal> CLSPESSValues = Caratteristiche.getCLSPESSValues("BAV");
		List<String> SLLATOLPValues = Caratteristiche.getSLLATOLPValues("BAV");

		String CLLARG;
		String SLTOLLA;
		BigDecimal CLSPESS;
		String SLLATOLP;
		String DLLATOLP;

		DLLATOLP = "0.5";

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
					ListIterator<String> litr4 =SLLATOLPValues.listIterator();
					while (litr4.hasNext())
					{
						SLLATOLP = litr4.next();
						RuleSLLATOLP(CLSPESS,CLLARG,SLTOLLA,DLLATOLP,SLLATOLP);
					}
				}
			}
		}
	}

	public static void RuleSLLATOLPNoIterator(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLP, String SLLATOLP)
	{
		RuleSLLATOLP(CLSPESS,CLLARG,SLTOLLA,DLLATOLP,SLLATOLP);
	}

	public static void RunCLFININew(GenericConfItem conf)
	{
		if(conf.getConf().runCaratteristicaValidationRuleByName("CLFINI"))
			System.out.println("Validated");
		else
			System.out.println("Not Validated");
	}

	public static List<LivelloDistinta> RunDistintaNew(GenericConfItem conf)
	{
		List<LivelloDistinta> distinta = conf.getConf().buildDistinta();
		return distinta;
	}

	public static Boolean testCLSTATFRuleStandard(String CLLEGA, String CLSTATF, String SLBPTE, String SLBP)
	{
		Boolean validate = Boolean.TRUE;
		if (CLSTATF.toString().equalsIgnoreCase("T04") || CLSTATF.toString().equalsIgnoreCase("T06") || CLSTATF.toString().equalsIgnoreCase("T4P"))
		{
			validate = Boolean.FALSE;
		}

		if(CLLEGA.toString().substring(0, 1).equalsIgnoreCase("1"))
		{
			if(CLSTATF.toString().substring(0, 2).equalsIgnoreCase("H3"))
			{
				validate = Boolean.FALSE;
			}
		}

		if(CLLEGA.toString().substring(0, 1).equalsIgnoreCase("3"))
		{
			if(CLSTATF.toString().substring(0, 2).equalsIgnoreCase("H3"))
			{
				validate = Boolean.FALSE;
			}
			else
			{
				if(CLLEGA.toString().equalsIgnoreCase("3A"))
					if(CLSTATF.toString().equalsIgnoreCase("H00") || CLSTATF.toString().equalsIgnoreCase("HA1") || CLSTATF.toString().equalsIgnoreCase("H12") || CLSTATF.toString().equalsIgnoreCase("H15") || CLSTATF.toString().equalsIgnoreCase("H16") || CLSTATF.toString().equalsIgnoreCase("H17"))
					{
						if(!(SLBPTE.toString().equalsIgnoreCase("B07187") || SLBPTE.toString().equalsIgnoreCase("B03835") || SLBPTE.toString().equalsIgnoreCase("B07434")))
						{
							validate = Boolean.FALSE;
							if(SLBPTE.toString().equals(SLBPTE) && CLSTATF.toString().equalsIgnoreCase("H14"))
							{
								validate = Boolean.TRUE;
							}
						}
					}
			}
		}

		if(CLLEGA.toString().substring(0, 1).equalsIgnoreCase("4"))
		{
			if(CLSTATF.toString().substring(0, 2).equalsIgnoreCase("H3"))
			{
				validate = Boolean.FALSE;
			}
		}

		if(CLLEGA.toString().substring(0, 1).equalsIgnoreCase("6"))
		{
			if(CLSTATF.toString().substring(0, 2).equalsIgnoreCase("H3"))
			{
				validate = Boolean.FALSE;
			}
			if(CLSTATF.toString().equalsIgnoreCase("T04") || CLSTATF.toString().equalsIgnoreCase("T06") || CLSTATF.toString().equalsIgnoreCase("T4P") || CLSTATF.toString().equalsIgnoreCase("H00"))
			{
				validate = Boolean.TRUE;
			}
		}

		if(CLLEGA.toString().substring(0, 1).equalsIgnoreCase("8"))
		{
			if(CLSTATF.toString().substring(0, 2).equalsIgnoreCase("H3"))
			{
				validate = Boolean.FALSE;
			}
		}

		return validate;
	}

	public static String testMLSTATFRuleStandard(String CLLEGA, String CLSTATF, String CLLARG, String CLLUNG, BigDecimal CLSPESS, String CLRIVE, String DLDEST, String SLBP)
	{
		String MLSTATF = CLSTATF;

		System.out.println(CLLEGA.substring(0, 1));

		switch(CLLEGA.substring(0,1))
		{
			case "1":
				if(CLSTATF == "H24" || CLSTATF == "H14")
				{
					if(CLSPESS.intValue() == 4000 || CLSPESS.intValue() == 5000 || CLSPESS.intValue() == 6000)
						MLSTATF = "H14";
					else
						MLSTATF = "H24";
				}
				if(CLLEGA == "1O")
				{
					if(CLSTATF == "H24" || CLSTATF == "H14")
					{
						if(CLSPESS.intValue() == 4000)
							MLSTATF = "H14";
						else
							MLSTATF = "H24";
					}
				}
				if(CLLEGA == "1Q")
				{
					if(CLSTATF == "H24" || CLSTATF == "H14")
					{
						if(CLSPESS.intValue() == 2000)
							MLSTATF = "H14";
						else
							MLSTATF = "H24";
					}

				}
				if( CLLEGA == "1A" && CLRIVE == "B" && CLSTATF == "H00")
				{
					if(Integer.parseInt(CLLARG) <= 6500 && Integer.parseInt(CLLUNG) <= 6500)
							MLSTATF = "H18";
				}
				if(CLSTATF == "H12" && CLSPESS.intValue() < 900)
				{
					 MLSTATF = "H22";
				}
			    if(CLSTATF == "H22")
			    {
				   if(CLSPESS.intValue() >= 900 && CLSPESS.intValue() <= 1500)
					  MLSTATF = "H12";
			    }
			    if(CLSTATF == "H00" || CLSTATF == "HA1")
			    {
				   if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
				   {
					  if(CLRIVE== "B")
					  {
					     if(CLSPESS.intValue() >= 2500)
						    MLSTATF = "H00";
					     else
						    MLSTATF = "H18";
					  }
				   }
			    }
			    if(CLSTATF == "H26" && CLSPESS.intValue() == 3000)
			    {
				   MLSTATF = "H16";
			    }
			    if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
			    {
				  if(DLDEST.substring(0,3) == "PEN" && CLRIVE == "B" && CLSTATF == "H00")
				  {
					  MLSTATF = "H18";
				  }
			    }
			    break;
			case "3":
				if(CLLEGA == "3A")
				{
					if(CLSTATF == "H00" || CLSTATF == "HA1")
					{
						if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
						{
								MLSTATF = "H18";
						}
					}
					if(CLSTATF == "H14")
					{
						MLSTATF = "H24";
					}
				}
				if(CLLEGA == "3D" || CLLEGA == "3T")
				{
					 if(CLSPESS.intValue() <= 1000 && CLSPESS.intValue() >= 400)
					 {
						if(CLSTATF == "H14")
						{
						   MLSTATF = "H24";
						}
						if(CLSTATF == "H16")
						{
						   MLSTATF = "H26";
						}
						if(CLSTATF == "H18")
						{
						   if(CLSPESS.intValue() <= 2000 && CLSPESS.intValue() >= 400)
						   {
							  MLSTATF = "H28";
						   }
						}
						if(CLSTATF == "H19")
						{
						   MLSTATF = "H29";
						}
					}
					if(CLSTATF == "H22" || CLSTATF == "H23" || CLSTATF == "H24")
					{
						MLSTATF = "H24";
					}

					 if(CLSPESS.intValue() <= 4000 && CLSPESS.intValue() > 1000)
					 {
						if(CLSTATF == "H14")
						{
						   MLSTATF = "H24";
						}
					 }
					 if(CLSPESS.intValue() <= 3000 && CLSPESS.intValue() > 1000)
					 {
						if(CLSTATF == "H16")
						{
						   MLSTATF = "H26";
						}
					 }
				}
				if(CLLEGA == "3C" || CLLEGA == "3G")
				{
					if(CLSPESS.intValue() <= 2000 && CLSPESS.intValue() >= 600)
					{
						if(CLSTATF == "H22")
						{
						   MLSTATF = "H12";
						}
					}
				}
				if(CLLEGA == "3Q" && CLRIVE == "B" && CLSTATF == "H00")
				{
					 if(Integer.parseInt(CLLARG) <= 6500 && Integer.parseInt(CLLUNG) <= 6500)
					 {
						MLSTATF = "H18";
					 }
				}
				if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
				{
					if(DLDEST.substring(0,3) == "PEN" && CLRIVE == "B" && CLSTATF == "H00")
					{
						MLSTATF = "H18";
					}
				}
				if(CLLEGA == "3Q" && CLSPESS.intValue() >= 2000)
				{
					MLSTATF = CLSTATF;
				}
			break;
			case "4":
				if(CLLEGA == "4A")
				{
					if(Integer.parseInt(CLLARG) <=6500 && Integer.parseInt(CLLUNG) <=6500)
					{
						if(CLRIVE == "B")
						{
							if(CLSTATF == "H00")
							{
									MLSTATF = "H18";
							}
						}
					}

				 if(CLSTATF == "H00" || CLSTATF == "HA1")
				 {
					if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
					{
					   if(CLSPESS.intValue() >= 2500)
					   {
						  MLSTATF = "H00";
					   }
					   else
					   {
						  MLSTATF = "H18";
					   }
					}
				 }
				}
			    if(Integer.parseInt(CLLARG) <= 10000 && Integer.parseInt(CLLUNG) <= 10000)
			    {
			    	if(DLDEST.substring(0,3) == "PEN" && CLRIVE == "B" && CLSTATF == "H00")
			    	{
			    			MLSTATF = "H18";
			    	}
			    }
			break;
			case "5":
				if(CLLEGA == "5G")
				{
				 	if(CLSTATF == "H22")
				 	{
				 		if(CLSPESS.intValue() >= 600 && CLSPESS.intValue() <= 3000)
				 		{
				 			MLSTATF = "H12";
				 		}
				 	}
				 	if(CLSTATF == "H12" && CLSPESS.intValue() < 600)
				 	{
				 		MLSTATF = "H22";
				 	}
				}

			  if(CLLEGA == "5A" || CLLEGA == "5O")
			  {
				 if(CLSPESS.intValue() == 5000 || CLSPESS.intValue() == 6000)
				 {
					if(CLSTATF == "H24")
					{
					   MLSTATF = "H14";
					}
				 }
			  }

			  if(CLLEGA == "5F")
			  {
				 if(SLBP == "B06468")
				 {
					if(CLSPESS.intValue() >= 1000)
					{
					   if(CLSTATF == "H22")
					   {
						  MLSTATF = "H52";
					   }
					}
			  	 }
			  }

			  if(CLSTATF.substring(0,2) == "H3")
			  {
				 MLSTATF = "H2" + CLSTATF.substring(2,1);
			  }
			break;
		}

		return MLSTATF;
	}

	static Object testMLSTATFRuleStandard(String cllega, String clstatf, String cllarg, String cllung,
			Integer clspess, String clrive, String dldest, String slbp) {
		return new Object();

	}

	public static String testRulef088Standard(String SLTOLLA, String DLLATOLP)
	{
		if(SLTOLLA.equalsIgnoreCase("f"))
			return  DLLATOLP;
		return "0";
	}

	public static String testRulef089Standard(String SLTOLLA, String DLLATOLN)
	{
		if(SLTOLLA.equalsIgnoreCase("f"))
			return  DLLATOLN;
		return "0";
	}

	public static String testRulef092ExecutorStandard(BigDecimal CLSPESS, String CLLARG, String SLTOLLA)
	{
		String retValue = "";
		String rspes = "";
		String rlarg = "";

		if(CLSPESS.intValue() <= 600)
			rspes = "A";
		if(CLSPESS.intValue() > 600 && CLSPESS.intValue() <= 2000)
			rspes = "B";
		if(CLSPESS.intValue() > 2000 && CLSPESS.intValue() <= 6000)
			rspes = "C";
		if(CLSPESS.intValue() > 6000)
			rspes = "D";

		if(Integer.parseInt(CLLARG) <= 1000)
			rlarg = "A";
		if(Integer.parseInt(CLLARG) > 1000 && Integer.parseInt(CLLARG) <= 3000)
			rlarg = "B";
		if(Integer.parseInt(CLLARG) > 3000 && Integer.parseInt(CLLARG) <= 5000)
			rlarg = "C";
		if(Integer.parseInt(CLLARG) > 5000 && Integer.parseInt(CLLARG) <= 9000)
			rlarg = "D";
		if(Integer.parseInt(CLLARG) > 9000 && Integer.parseInt(CLLARG) <= 10000)
			rlarg = "E";
		if(Integer.parseInt(CLLARG) > 10000 && Integer.parseInt(CLLARG) <= 12500)
			rlarg = "F";
		if(Integer.parseInt(CLLARG) > 12500 && Integer.parseInt(CLLARG) <= 16500)
			rlarg = "G";

		if(!SLTOLLA.equalsIgnoreCase("F"))
		{
			retValue = rspes + rlarg + SLTOLLA.toString();
		}
		else
		{
			retValue = rspes + rlarg + "F" + "." + "K";
		}

		return retValue;
	}

	public static Boolean testRuleSLLATOLNStandard(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLN, String SLLATOLN)
	{
		String retValue = "";
		String rspes = "";
		String rlarg = "";

		if(CLSPESS.intValue() <= 600)
			rspes = "A";
		if(CLSPESS.intValue() > 600 && CLSPESS.intValue() <= 2000)
			rspes = "B";
		if(CLSPESS.intValue() > 2000 && CLSPESS.intValue() <= 6000)
			rspes = "C";
		if(CLSPESS.intValue() > 6000)
			rspes = "D";

		if(Integer.parseInt(CLLARG) <= 1000)
			rlarg = "A";
		if(Integer.parseInt(CLLARG) > 1000 && Integer.parseInt(CLLARG) <= 3000)
			rlarg = "B";
		if(Integer.parseInt(CLLARG) > 3000 && Integer.parseInt(CLLARG) <= 5000)
			rlarg = "C";
		if(Integer.parseInt(CLLARG) > 5000 && Integer.parseInt(CLLARG) <= 9000)
			rlarg = "D";
		if(Integer.parseInt(CLLARG) > 9000 && Integer.parseInt(CLLARG) <= 10000)
			rlarg = "E";
		if(Integer.parseInt(CLLARG) > 10000 && Integer.parseInt(CLLARG) <= 12500)
			rlarg = "F";
		if(Integer.parseInt(CLLARG) > 12500 && Integer.parseInt(CLLARG) <= 16500)
			rlarg = "G";

		if(!SLTOLLA.equalsIgnoreCase("F"))
		{
			retValue = rspes + rlarg + SLTOLLA.toString();
		}
		else
		{
			retValue = rspes + rlarg + "F" + "." + DLLATOLN.toString();
		}

		return retValue.equalsIgnoreCase(SLLATOLN);
	}

	public static Object testRuleSLLATOLNStandard(Integer clspess, String string, String string2, String string3,
			String string4) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Boolean testRuleSLLATOLPStandard(BigDecimal CLSPESS, String CLLARG, String SLTOLLA, String DLLATOLP, String SLLATOLP)
	{
		String retValue = "";
		String rspes = "";
		String rlarg = "";

		if(CLSPESS.intValue() <= 600)
			rspes = "A";
		if(CLSPESS.intValue() > 600 && CLSPESS.intValue() <= 2000)
			rspes = "B";
		if(CLSPESS.intValue() > 2000 && CLSPESS.intValue() <= 6000)
			rspes = "C";
		if(CLSPESS.intValue() > 6000)
			rspes = "D";

		if(Integer.parseInt(CLLARG) <= 1000)
			rlarg = "A";
		if(Integer.parseInt(CLLARG) > 1000 && Integer.parseInt(CLLARG) <= 3000)
			rlarg = "B";
		if(Integer.parseInt(CLLARG) > 3000 && Integer.parseInt(CLLARG) <= 5000)
			rlarg = "C";
		if(Integer.parseInt(CLLARG) > 5000 && Integer.parseInt(CLLARG) <= 9000)
			rlarg = "D";
		if(Integer.parseInt(CLLARG) > 9000 && Integer.parseInt(CLLARG) <= 10000)
			rlarg = "E";
		if(Integer.parseInt(CLLARG) > 10000 && Integer.parseInt(CLLARG) <= 12500)
			rlarg = "F";
		if(Integer.parseInt(CLLARG) > 12500 && Integer.parseInt(CLLARG) <= 16500)
			rlarg = "G";

		if(!SLTOLLA.equalsIgnoreCase("F"))
		{
			retValue = rspes + rlarg + SLTOLLA.toString();
		}
		else
		{
			retValue = rspes + rlarg + "F" + "." + DLLATOLP.toString();
		}

		return retValue.equalsIgnoreCase(SLLATOLP);
	}

	public static Object testRuleSLLATOLPStandard(Integer clspess, String string, String string2, String string3,
			String string4) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void withLoopCLLARGSTOLLACLSPESSNew() {

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
		String SLLANAS;
		String QLLAVDET;
		String SLMOD;
		String QLLAV;



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
		SLLANAS = "3CJ1240";
		QLLAVDET = "A01";
		SLMOD = "BA";
		QLLAV = "N";


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
					Rulef092Executor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN, SLLANAS, QLLAVDET, SLMOD, QLLAV);
				}
			}
		}
	}

	private static void withLoopTestCLLARGf092()
	{
		List<String> CLLARGValues = Caratteristiche.getCLLARGValues("BAV");

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
		String SLLANAS;
		String QLLAVDET;
		String SLMOD;
		String QLLAV;

		CLLEGA = "3A";
		SLBPTE = "A";
		SLBP = "B06789";
		CLFINI = "C";
		CLASSE = "2";
		CLLARG = "2000";
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
		SLLANAS = "3CJ1240";
		QLLAVDET = "B11";
		SLMOD = "BA";
		QLLAV = "N";
		CLSPESS = new BigDecimal(500);

		ListIterator<String> litr = CLLARGValues.listIterator();
		while (litr.hasNext()) {
			CLLARG = litr.next();
			Rulef092CLLARGExecutor(CLSPESS, CLLEGA, CLSTATF, SLBPTE, SLBP, CLFINI, CLASSE, CLLARG, CLLUNG, CLRIVE, CLTOLLE, DLDEST, DLLAV, DLLUBRI, MLSTATF, PLACKG, PMETC, QSPEC, SLTOLLA, DLLATOLP, DLLATOLN, SLLATOLP, SLLATOLN, SLLANAS, QLLAVDET, SLMOD, QLLAV);
		}
	}
}