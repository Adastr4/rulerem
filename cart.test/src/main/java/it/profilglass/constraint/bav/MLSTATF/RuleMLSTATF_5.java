package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 5, name = "ruleMLSTATF_5")

public class RuleMLSTATF_5 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLLEGA().substring(0, 1).equalsIgnoreCase("1") &&
																					 	(!caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLLEGA().equalsIgnoreCase("1O")) && 
																					 		!(caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000") ||
																					 		  caratteristica.getCLSPESS().toString().equalsIgnoreCase("5000") ||
																		                      caratteristica.getCLSPESS().toString().equalsIgnoreCase("6000"))
																				   )
																);
	}
	
	@Then
	public RuleState then()
	{
		result = "H24";
		return RuleState.NEXT;
	}

}
