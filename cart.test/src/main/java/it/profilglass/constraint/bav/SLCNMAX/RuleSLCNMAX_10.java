package it.profilglass.constraint.bav.SLCNMAX;

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

@Rule(order = 10, name = "RuleSLCNMAX10")

public class RuleSLCNMAX_10 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		
		//return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 1 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) != 2 
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 3;
	}

	@Then
	public RuleState then()
	{
		double quantImballi = ReadDB.getQitmFromPackageDefinition(caratteristiche.stream().filter(caratteristica -> "SLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione());
		
		//FACCIO GIRARE LA REGOLA PER CARICARE LA VARIABILE HIMBALLI
		double hImballi = 0;
		try
		{
			RuleBookRunner ruleBook = new RuleBookRunner("it.profilglass.constraint.bav.SCLNMAX.sub1");
			NameValueReferableMap<Caratteristica> facts = new FactMap<>();
			for(Caratteristica cara : this.caratteristiche)
				facts.put(new Fact<>(cara));
			
			ruleBook.run(facts);
			
			if(ruleBook.getResult().isPresent())
			{
				hImballi= (int) ruleBook.getResult().get().getValue();
			}
		}
		catch(Exception ex)
		{
			hImballi = 0;
		}
		
		//FACCIO GIRARE LA REGOLA PER CALCOLARE IL PESO SPECIFICO
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
		
		
		hImballi = quantImballi /(hImballi*pesoSpec);
		result = new Opzione(String.valueOf(hImballi * 1000000/(Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()))));
		return RuleState.BREAK;
	}
}
