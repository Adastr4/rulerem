package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleMLSTATF_1")

public class RuleMLSTATF_1_1O_1Q extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000")) ||
							   (caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000"));
	}
	
	@Then
	public RuleState then()
	{
		result = "H14";
		return RuleState.NEXT;
	}

}
