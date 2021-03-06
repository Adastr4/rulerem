package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 2, name = "ruleMLSTATF_2_1O_1Q")

public class RuleMLSTATF_2_1O_1Q extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 2 entered");
		result = "H24";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000") ||
				   			    caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000"));
	}
}
