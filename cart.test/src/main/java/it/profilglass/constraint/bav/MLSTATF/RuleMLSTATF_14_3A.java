package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 14, name = "ruleMLSTATF_14")

public class RuleMLSTATF_14_3A {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLLEGA().equalsIgnoreCase("3A") && 
																    caratteristica.getCLSTATF().equalsIgnoreCase("H14")
																	));
	}
	
	@Then
	public RuleState then()
	{
		result = "H24";
		return RuleState.NEXT;
	}
}
