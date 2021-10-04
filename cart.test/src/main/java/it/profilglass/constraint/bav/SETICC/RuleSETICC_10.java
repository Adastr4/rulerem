package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;


@Rule(order = 10, name = "ruleSETICC_10")
public class RuleSETICC_10 {
	@Given("descEtichetta")
	private String descEtichetta;

	@Result
	private Integer result;

	@When
	public boolean when()
	{
		return (descEtichetta.equalsIgnoreCase("Con Logo"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 1 entered");
		result = 1;
		return RuleState.BREAK;
	}
}
