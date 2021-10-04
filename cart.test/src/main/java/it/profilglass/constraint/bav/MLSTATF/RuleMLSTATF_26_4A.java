package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 26, name = "ruleMLSTATF_26")

public class RuleMLSTATF_26_4A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A_2 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 25 entered");
		result = "H00";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLSPESS().intValue() >= 2500);
	}
}
