package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 24, name = "ruleMLSTATF_24")

public class RuleMLSTATF_24_3Q {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	
	@When
	public boolean when()
	{
			return  caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				   (caratteristica.getCLSPESS().intValue() >= 2000);
			
	}
	
	@Then
	public RuleState then()
	{
		result = caratteristica.getCLSTATF();
		return RuleState.BREAK;
	}
}
