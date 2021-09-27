package it.profilglass.constraint.bav.SETICC;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;


@Rule(order = 20, name = "ruleSETICC_20")
public class RuleSETICC_20 {
	@Given("descEtichetta") 
	private String descEtichetta;

	@Result
	private Integer result;
	
	@When
	public boolean when()
	{		
		return (descEtichetta.equalsIgnoreCase("Senza Logo"));
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule SETICC 2 entered");
		result = 2;
		return RuleState.BREAK;
	}
}
