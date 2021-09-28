package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;


@Rule(order = 50, name = "ruleSETICC_50")
public class RuleSETICC_50 {
	@Given("descEtichetta") 
	private String descEtichetta;

	@Result
	private Integer result;
	
	@When
	public boolean when()
	{		
		return (descEtichetta.equalsIgnoreCase("Con logo + VDA"));
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 5 entered");
		result = 5;
		return RuleState.BREAK;
	}
}
