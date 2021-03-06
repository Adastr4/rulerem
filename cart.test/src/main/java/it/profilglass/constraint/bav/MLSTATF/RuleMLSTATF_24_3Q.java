package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 24, name = "ruleMLSTATF_24")

public class RuleMLSTATF_24_3Q {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;


	@Then
	public RuleState then()
	{
		System.out.println("Rule 23 entered");
		result = caratteristica.getCLSTATF();
		return RuleState.BREAK;
	}

	@When
	public boolean when()
	{
			return  caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				   (caratteristica.getCLSPESS().intValue() >= 2000);

	}
}
