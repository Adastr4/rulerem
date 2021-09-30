package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 13, name = "ruleMLSTATF_13")

public class RuleMLSTATF_13_3A {
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("3A") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H14"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 13 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
