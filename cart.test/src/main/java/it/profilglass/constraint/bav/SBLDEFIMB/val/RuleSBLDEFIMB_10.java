package it.profilglass.constraint.bav.SBLDEFIMB.val;

import java.util.ArrayList;
import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.GenericItem;
import it.profilglass.classmodel.LivelloDistinta;

@Rule(order = 10, name = "ruleSBLDEFIMB_10")

public class RuleSBLDEFIMB_10 {
	@Given 
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private Boolean result = Boolean.FALSE;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) != 2 
			&& caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,5).equalsIgnoreCase(
					caratteristiche.stream().filter(caratteristica -> "SLTIPOPAL".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1) +
					caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getDescrizione() +
					caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getDescrizione()
					);
			   
	}
	
	@Then
	public RuleState then()
	{
		//Aggiungo il primo livello di distinta (nodo);
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
