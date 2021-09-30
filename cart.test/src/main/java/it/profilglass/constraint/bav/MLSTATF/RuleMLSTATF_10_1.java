package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 10, name = "ruleMLSTATF_10")

public class RuleMLSTATF_10_1 {
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
			   (caratteristica.getCLSTATF().toString().equalsIgnoreCase("H26")) &&
			   (Integer.parseInt(caratteristica.getCLSPESS().toString()) == 3000));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 10 entered");
		result = "H16";
		return RuleState.NEXT;
	}
}
