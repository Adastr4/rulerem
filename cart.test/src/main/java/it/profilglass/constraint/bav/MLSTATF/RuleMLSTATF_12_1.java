package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 12, name = "ruleMLSTATF_12")

public class RuleMLSTATF_12_1 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_2 {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") && super.when();
	}
	
	@Then
	public RuleState then()
	{
		result = "H18";
		return RuleState.NEXT;
	}
}
