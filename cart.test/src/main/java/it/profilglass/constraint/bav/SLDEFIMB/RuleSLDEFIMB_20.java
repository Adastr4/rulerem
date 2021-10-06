package it.profilglass.constraint.bav.SLDEFIMB;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 20, name = "ruleSLDEFIMB_20")

public class RuleSLDEFIMB_20 extends it.profilglass.constraint.bav.SLHPILA.RuleSLHPILA_10 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result = "";
	
	@When
	public boolean when()
	{
		return !super.when();
			   
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = caratteristiche.stream().filter(caratteristica -> "SBLDEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione();
		return RuleState.BREAK;
	}

}
