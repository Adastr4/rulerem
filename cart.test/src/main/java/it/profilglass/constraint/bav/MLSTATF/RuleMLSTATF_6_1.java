package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 6, name = "ruleMLSTATF_6")

public class RuleMLSTATF_6_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 6 entered");
		result = "H22";
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
				caratteristica.getCLSTATF().toString().equalsIgnoreCase("H12") &&
				caratteristica.getCLSPESS().intValue() < 900);
	}

}
