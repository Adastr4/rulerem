package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;


@Rule(order = 30, name = "ruleSETICC_30")
public class RuleSETICC_30 {
	@Given("descEtichetta")
	private String descEtichetta;

	@Result
	private Integer result;

	@When
	public boolean when()
	{
		return (descEtichetta.equalsIgnoreCase("Anonima"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 3 entered");
		result = 3;
		return RuleState.BREAK;
	}
}
