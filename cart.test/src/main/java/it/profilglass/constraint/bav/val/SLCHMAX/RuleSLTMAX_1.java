package it.profilglass.constraint.bav.val.SLCHMAX;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleSLTMAX1")

public class RuleSLTMAX_1 {
	
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private double result;
	
	@When
	public boolean when()
	{
		return (caratteristica.getSBATIPO() != 1 && caratteristica.getSBATIPO() != 2 && caratteristica.getSLTMAX() == 2);
	}
	
	@Then
	public RuleState then()
	{
		result = 0;
		return RuleState.BREAK;
	}

}
