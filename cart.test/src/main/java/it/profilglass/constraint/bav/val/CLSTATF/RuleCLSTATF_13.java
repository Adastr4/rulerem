package it.profilglass.constraint.bav.val.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class RuleCLSTATF_13 extends RuleCLSTATF_0{
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		
		return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("8"));
	}
	
	@Then
	public RuleState then()
	{
		result = super.result;
		return RuleState.BREAK;
	}
}
