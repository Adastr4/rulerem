package it.profilglass.constraint.bav.SLLARG;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name = "ruleSLLARG_1")

public class RuleSLLARG_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{

		return caratteristica.getCLLARG().equalsIgnoreCase("10000") || caratteristica.getCLLARG().equalsIgnoreCase("12500") || caratteristica.getCLLARG().equalsIgnoreCase("15000");
	}

	@Then
	public RuleState then()
	{
		result = caratteristica.getCLLARG();
		return RuleState.BREAK;
	}

}
