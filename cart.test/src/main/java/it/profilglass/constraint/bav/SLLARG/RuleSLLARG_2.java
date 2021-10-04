package it.profilglass.constraint.bav.SLLARG;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 2, name = "ruleSLLARG_2")

public class RuleSLLARG_2 extends RuleSLLARG_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Override
	@When
	public boolean when()
	{

		return !super.when();
	}

	@Override
	@Then
	public RuleState then()
	{
		result = "99999";
		return RuleState.BREAK;
	}
}
