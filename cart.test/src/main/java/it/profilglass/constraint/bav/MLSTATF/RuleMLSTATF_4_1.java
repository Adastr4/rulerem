package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 4, name = "ruleMLSTATF_4")

public class RuleMLSTATF_4_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 4 entered");
		result = "H24";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
							   (!caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLLEGA().equalsIgnoreCase("1O")) &&
							  !(caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000") ||
									  caratteristica.getCLSPESS().toString().equalsIgnoreCase("5000") ||
									  caratteristica.getCLSPESS().toString().equalsIgnoreCase("6000")));
	}

}
