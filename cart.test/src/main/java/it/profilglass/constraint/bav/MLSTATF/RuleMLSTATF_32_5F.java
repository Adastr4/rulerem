package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 32, name = "ruleMLSTATF_32")

public class RuleMLSTATF_32_5F {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("5F") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H22") &&
				caratteristica.getCLSPESS().intValue() >= 1000 &&
				caratteristica.getSLBP().toString().equalsIgnoreCase("B06468"));
	}
	
	@Then
	public RuleState then()
	{
		result = "H52";
		return RuleState.NEXT;
	}
}
