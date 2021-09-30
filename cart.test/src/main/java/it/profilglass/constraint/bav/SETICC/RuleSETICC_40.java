package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;


@Rule(order = 40, name = "ruleSETICC_40")
public class RuleSETICC_40 {
	@Given("descEtichetta")
	private String descEtichetta;

	@Result
	private Integer result;

	@When
	public boolean when()
	{
		return (descEtichetta.equalsIgnoreCase("Personalizzata"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 4 entered");
		result = 4;
		return RuleState.BREAK;
	}
}
