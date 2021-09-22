package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 28, name = "ruleMLSTATF_28")

public class RuleMLSTATF_28_4 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A_2 {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return super.when() && (caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("4"));
	}
	
	@Then
	public RuleState then()
	{
		result = "H18";
		return RuleState.BREAK;
	}
}
