package it.profilglass.constraint.bav.SLBP;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 2, name = "ruleSLBP_2")

public class ruleSLBP_2 {
	@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return true;
	}
	
	@Then
	public RuleState then()
	{
		result = "000000";
		return RuleState.BREAK;
	}

}
