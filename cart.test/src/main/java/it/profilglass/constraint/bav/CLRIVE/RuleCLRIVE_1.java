package it.profilglass.constraint.bav.CLRIVE;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class RuleCLRIVE_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result = "A";

	@Then
	public RuleState then()
	{
		result = "B";
		return RuleState.BREAK;
	}

	@When
	public boolean when()
	{
		return caratteristica.getCLFINI().equalsIgnoreCase("K") || caratteristica.getCLFINI().equalsIgnoreCase("Q") || caratteristica.getCLFINI().equalsIgnoreCase("W");
	}

}
