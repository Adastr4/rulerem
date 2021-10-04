package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 32, name = "ruleMLSTATF_32")

public class RuleMLSTATF_32_5F {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 31 entered");
		result = "H52";
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("5F") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H22") &&
				caratteristica.getCLSPESS().intValue() >= 1000 &&
				caratteristica.getSLBP().toString().equalsIgnoreCase("B06468"));
	}
}
