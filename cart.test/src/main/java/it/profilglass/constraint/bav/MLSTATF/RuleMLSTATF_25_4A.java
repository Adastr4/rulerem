package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 25, name = "ruleMLSTATF_25")

public class RuleMLSTATF_25_4A extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	private ICaratteristica carRet;

	@Override
	@When
	public boolean when()
	{
		return super.when() && (Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500)
							&& (Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500)
							&& (caratteristica.getCLRIVE().toString().equalsIgnoreCase("B"))
							&& (caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 24 entered");
		result = "H18";
		return RuleState.NEXT;
	}
}
