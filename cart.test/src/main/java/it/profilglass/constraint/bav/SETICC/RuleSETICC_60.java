package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;


@Rule(order = 60, name = "ruleSETICC_60")
public class RuleSETICC_60 {
	@Given("descEtichetta")
	private String descEtichetta;

	@Result
	private Integer result;

	@When
	public boolean when()
	{
		return true;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 6 entered");
		result = 1;
		return RuleState.BREAK;
	}
}
