package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name = "ruleCLSTATF_0")

public class RuleCLSTATF_0 {

	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	protected boolean result;

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T04") ||
																   caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T06") ||
																   caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T4P"));
	}

}
