package it.profilglass.constraint.bav.SLPMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.ReadDB;

@Rule(order = 20, name = "ruleSLPMAX20")

public class RuleSLPMAX_20 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 2
			&& !(   caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("K")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("Q")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("W")
			   );
	}

	@Then
	public RuleState then()
	{
		double qtaCalc = 0;
		double hPallet = 0;
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.SCLNMAX.sub1");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				hPallet = (int) ruleBook.getResult().get().getValue();
			}
		}
		catch(Exception ex)
		{
			hPallet = 0;
		}
		qtaCalc = (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione())/10000) * (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione())/10000);
		qtaCalc = qtaCalc * ((Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLCHMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione())-hPallet)/1000) * getPesoSpec();
		qtaCalc = Math.round(qtaCalc);
		
		result = new Opzione(String.valueOf(qtaCalc));
		
		return RuleState.BREAK;
	}
	
	private double getPesoSpec()
	{
		double pesoSpec = 0;
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.SCLNMAX.sub2");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				pesoSpec= (int) ruleBook.getResult().get().getValue();
			}
		}
		catch(Exception ex)
		{
			pesoSpec = 0;
		}
		return pesoSpec;
	}

}
