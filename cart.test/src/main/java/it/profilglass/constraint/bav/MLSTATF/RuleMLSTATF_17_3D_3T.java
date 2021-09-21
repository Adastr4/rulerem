package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 17, name = "ruleMLSTATF_17")

public class RuleMLSTATF_17_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
																	 caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
																    caratteristica.getCLSTATF().equalsIgnoreCase("H19")
																   )) && super.when();
	}
	
	@Then
	public RuleState then()
	{
		result = "H29";
		return RuleState.NEXT;
	}
}
