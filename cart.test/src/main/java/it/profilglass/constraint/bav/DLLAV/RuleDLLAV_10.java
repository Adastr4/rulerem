package it.profilglass.constraint.bav.DLLAV;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleDLLAV10")

public class RuleDLLAV_10 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return !caratteristiche.stream().filter(caratteristica -> "QLLAV".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("C");		   
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = new Opzione("");
		return RuleState.BREAK;
	}

}
