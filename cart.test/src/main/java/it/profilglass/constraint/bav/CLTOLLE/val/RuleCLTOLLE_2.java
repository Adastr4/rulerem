package it.profilglass.constraint.bav.CLTOLLE.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 2, name = "ruleCLTOLLE_2")

public class RuleCLTOLLE_2 {
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
		return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().toString().equalsIgnoreCase("K") || caratteristica.getCLFINI().toString().equalsIgnoreCase("Q"));
	}
}
