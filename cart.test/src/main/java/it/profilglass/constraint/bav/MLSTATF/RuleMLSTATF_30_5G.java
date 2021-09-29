package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 30, name = "ruleMLSTATF_30")

public class RuleMLSTATF_30_5G {
	@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return (caratteristica.getCLLEGA().equalsIgnoreCase("5G") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H22") &&
				caratteristica.getCLSPESS().intValue() >= 600 &&
				caratteristica.getCLSPESS().intValue() <= 3000);
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule 29 entered");
		result = "H12";
		return RuleState.NEXT;
	}
}
