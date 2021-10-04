package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 7, name = "ruleMLSTATF_7")

public class RuleMLSTATF_7_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
				caratteristica.getCLSTATF().toString().equalsIgnoreCase("H22") &&
				caratteristica.getCLSPESS().intValue() >= 900 &&
				caratteristica.getCLSPESS().intValue() <= 1500);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 7 entered");
		result = "H12";
		return RuleState.NEXT;
	}
}
