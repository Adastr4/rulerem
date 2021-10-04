package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 23, name = "ruleMLSTATF_23")

public class RuleMLSTATF_23_3 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_2 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Override
	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")) && super.when();
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 22 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
