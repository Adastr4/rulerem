package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 21, name = "ruleMLSTATF_21")

public class RuleMLSTATF_21_3C_3G {
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("3C") ||
				 caratteristica.getCLLEGA().equalsIgnoreCase("3G")) &&
				   (caratteristica.getCLSTATF().equalsIgnoreCase("H22")) &&
				   (caratteristica.getCLSPESS().intValue() <= 2000) &&
				   (caratteristica.getCLSPESS().intValue() >= 600));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 20 entered");
		result = "H12";
		return RuleState.NEXT;
	}
}
