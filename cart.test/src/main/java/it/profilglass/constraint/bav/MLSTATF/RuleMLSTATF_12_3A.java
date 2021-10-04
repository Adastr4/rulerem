package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 12, name = "ruleMLSTATF_12")

public class RuleMLSTATF_12_3A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_0 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 12 entered");
		result = "H18";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("3A") &&
				 ( caratteristica.getCLSTATF().equalsIgnoreCase("H00") ||
				   caratteristica.getCLSTATF().equalsIgnoreCase("HA1"))
				 ) && super.when();
	}
}
