package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleMLSTATF_2")

public class RuleMLSTATF_2_1O_1Q extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000")) ||
				   																   (caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && !caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000")));
	}
	
	@Then
	public RuleState then()
	{
		result = "H24";
		return RuleState.NEXT;
	}
}
