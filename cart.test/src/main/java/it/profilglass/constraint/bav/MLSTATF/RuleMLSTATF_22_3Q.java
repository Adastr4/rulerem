package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 22, name = "ruleMLSTATF_22")

public class RuleMLSTATF_22_3Q {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule 21 entered");
		result = "H18";
		return RuleState.NEXT;
	}

	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				caratteristica.getCLRIVE().equalsIgnoreCase("B") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H00") &&
				(Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500) &&
				(Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500));
	}
}
