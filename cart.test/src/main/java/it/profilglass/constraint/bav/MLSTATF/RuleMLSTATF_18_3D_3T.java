package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 18, name = "ruleMLSTATF_18")

public class RuleMLSTATF_18_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@Override
	@When
	public boolean when()
	{
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
				 caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
					(caratteristica.getCLSTATF().equalsIgnoreCase("H22") ||
					 caratteristica.getCLSTATF().equalsIgnoreCase("H23") ||
					 caratteristica.getCLSTATF().equalsIgnoreCase("H24"))
				) && !super.when();
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 17 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
