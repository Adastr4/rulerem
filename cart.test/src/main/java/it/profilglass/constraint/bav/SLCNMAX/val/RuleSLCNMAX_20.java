package it.profilglass.constraint.bav.SLCNMAX.val;

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
import test.test.ReadDB;

@Rule(order = 20, name = "RuleSLCNMAX_20")

public class RuleSLCNMAX_20 extends RuleSLCNMAX_10{
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result = false;

	@When
	public boolean when()
	{
		return !super.when()
			&& (getHPallet() < Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SCLNMAX".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()));
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
	
	private double getHPallet()
	{
		double hImballi = 0;
		hImballi = ((Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) / 10000) * (Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) / 10000));
		hImballi = (ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) / (hImballi * getPesoSpec()));
		hImballi = Math.round((hImballi*1000000)/Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()));
		return hImballi;
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
