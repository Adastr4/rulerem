package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 14, name = "ruleMLSTATF_14")

public class RuleMLSTATF_14_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3D_3T{
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 14 entered");
		result = "H24";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return (caratteristica.getCLSTATF().equalsIgnoreCase("H14")) && super.when();
	}
}
