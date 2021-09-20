package it.profilglass.constraint.bav.val.CLFINI;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class RuleCLFINI_5 extends it.profilglass.constraint.bav.val.sub1.CLFINI.RuleCLFINI_0 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().toString().equalsIgnoreCase("F")
																				|| caratteristica.getCLFINI().toString().equalsIgnoreCase("N"));
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
