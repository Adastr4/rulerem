package it.profilglass.constraint.bav.val.CLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 12, name = "ruleCLSTATF_12")

public class RuleCLSTATF_12 extends it.profilglass.constraint.bav.val.sub1.CLSTATF.SubRuleCLSTATF_2{
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("6") && !(caratteristica.getCLSTATF().equalsIgnoreCase("T04") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("T06") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("T4P") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("H00"))) && !super.when();
	}
	
	@Then
	public RuleState then()
	{
		return RuleState.BREAK;
	}

}
