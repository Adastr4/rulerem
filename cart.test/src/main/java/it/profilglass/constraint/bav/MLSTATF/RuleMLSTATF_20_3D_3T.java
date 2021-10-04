package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 20, name = "ruleMLSTATF_20")

public class RuleMLSTATF_20_3D_3T {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
				 caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
					(caratteristica.getCLSTATF().equalsIgnoreCase("H16")) &&
					(caratteristica.getCLSPESS().intValue() <= 3000) &&
					(caratteristica.getCLSPESS().intValue() > 1000));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 19 entered");
		result = "H26";
		return RuleState.NEXT;
	}
}
