package it.profilglass.constraint.bav.val.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleCLSTATF_2")

public class RuleCLSTATF_2{
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3") &&
																	!caratteristica.getCLLEGA().substring(0,2).equalsIgnoreCase("3A"));
	}
	
	@Then
	public RuleState then()
	{
		return RuleState.BREAK;
	}

}
