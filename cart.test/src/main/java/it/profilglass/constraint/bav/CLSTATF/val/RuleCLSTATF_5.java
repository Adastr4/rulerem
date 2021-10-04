package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 5, name = "ruleCLSTATF_5")

public class RuleCLSTATF_5 {

	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

	@When
	public boolean when()
	{

		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
																&& caratteristica.getSLBPTE().equalsIgnoreCase(caratteristica.getSLBP().toString())
																&& caratteristica.getCLSTATF().equalsIgnoreCase("H14"));
	}

}
