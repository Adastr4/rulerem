package it.profilglass.constraint.bav.val.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleCLSTATF_0")

public class RuleCLSTATF_0 {
	
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T04") || 
																   caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T06") ||
																   caratteristica.getCLSTATF().substring(0,3).equalsIgnoreCase("T4P"));
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.NEXT;
	}

}
