package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 29, name = "ruleMLSTATF_29")

public class RuleMLSTATF_29_5G {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 28 entered");
		result = "H12";
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("5G") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H22") &&
				caratteristica.getCLSPESS().intValue() >= 600 &&
				caratteristica.getCLSPESS().intValue() <= 3000);
	}
}
