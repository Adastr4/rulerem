package it.profilglass.constraint.bav.val.CLFINI;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 4, name = "ruleCLFINI_4")

public class RuleCLFINI_4 extends it.profilglass.constraint.bav.val.sub1.CLFINI.RuleCLFINI_0 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		return super.when() && !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().toString().equalsIgnoreCase("1A")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1K")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1O")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1P")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1Q")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3A")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3C")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3H")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3G")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3B")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3P")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3M")
																				|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3O"));
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
