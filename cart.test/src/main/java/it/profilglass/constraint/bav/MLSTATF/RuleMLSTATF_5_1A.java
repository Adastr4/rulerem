package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 5, name = "ruleMLSTATF_5")

public class RuleMLSTATF_5_1A {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("1A")) &&
				 caratteristica.getCLRIVE().toString().equalsIgnoreCase("B") &&
				 caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") &&
				 Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500 &&
				 Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 5 entered");
		result = "H18";
		return RuleState.NEXT;
	}

}
