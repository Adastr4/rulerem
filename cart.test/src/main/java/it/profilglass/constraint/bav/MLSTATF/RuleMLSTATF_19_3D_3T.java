package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 19, name = "ruleMLSTATF_19")

public class RuleMLSTATF_19_3D_3T {
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
			     caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
					(caratteristica.getCLSTATF().equalsIgnoreCase("H14")) &&
					(caratteristica.getCLSPESS().intValue() <= 4000) &&
				(caratteristica.getCLSPESS().intValue() > 1000));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 18 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
