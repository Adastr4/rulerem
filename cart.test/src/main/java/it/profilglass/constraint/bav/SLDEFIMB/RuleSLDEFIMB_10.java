package it.profilglass.constraint.bav.SLDEFIMB;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "ruleSLDEFIMB_10")

public class RuleSLDEFIMB_10 extends it.profilglass.constraint.bav.SLHPILA.RuleSLHPILA_10 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return super.when();
			   
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue();
		return RuleState.BREAK;
	}

}
