package it.profilglass.constraint.bav.DLLAV.val;

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
	private Boolean result = Boolean.TRUE;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "DLLAV".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getDescrizione()) < Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione());		   
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = Boolean.FALSE;
		return RuleState.NEXT;
	}
}
