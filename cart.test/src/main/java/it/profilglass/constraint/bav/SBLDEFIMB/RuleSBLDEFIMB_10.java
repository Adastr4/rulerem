package it.profilglass.constraint.bav.SBLDEFIMB;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleSBLDEFIMB_10")

public class RuleSBLDEFIMB_10 {
	@Given 
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) != 2;		   
	}
	
	@Then
	public RuleState then()
	{
		result = new Opzione("");
		return RuleState.BREAK;
	}
}
