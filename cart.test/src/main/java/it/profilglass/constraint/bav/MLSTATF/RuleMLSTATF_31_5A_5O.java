package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 31, name = "ruleMLSTATF_31")

public class RuleMLSTATF_31_5A_5O {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("5A") ||
				 caratteristica.getCLLEGA().equalsIgnoreCase("5O")) &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H24") &&
				(caratteristica.getCLSPESS().intValue() == 5000 ||
				 caratteristica.getCLSPESS().intValue() == 6000));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 30 entered");
		result = "H14";
		return RuleState.NEXT;
	}
}
