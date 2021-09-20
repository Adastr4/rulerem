package it.profilglass.constraint.bav.val.CLFINI;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleCLFINI_2")

public class RuleCLFINI_2 extends it.profilglass.constraint.bav.val.sub1.CLFINI.RuleCLFINI_0{
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().toString().equalsIgnoreCase("3D")
																				&& caratteristica.getCLSTATF().toString().equalsIgnoreCase("H12"));
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
