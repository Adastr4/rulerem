package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 8, name = "ruleMLSTATF_8")

public class RuleMLSTATF_8_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 8 entered");
		result = "H00";
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
							   		(caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") ||
							   		 caratteristica.getCLSTATF().toString().equalsIgnoreCase("HA1")) &&
								caratteristica.getCLSPESS().intValue() >= 2500);
	}
}
