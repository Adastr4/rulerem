package it.profilglass.constraint.bav.SLLATOLP.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name = "ruleCLSPESS1")

public class RuleCLSPESS_1 {

	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> !(((caratteristica.getCLSPESS().intValue() <= 600 && caratteristica.getSLLATOLP().substring(0, 1).equalsIgnoreCase("a"))
																|| (caratteristica.getCLSPESS().intValue() > 600 && caratteristica.getCLSPESS().intValue() <= 2000 && caratteristica.getSLLATOLP().substring(0, 1).equalsIgnoreCase("b"))
																|| (caratteristica.getCLSPESS().intValue() > 2000 && caratteristica.getCLSPESS().intValue() <= 6000 && caratteristica.getSLLATOLP().substring(0, 1).equalsIgnoreCase("c"))
																|| (caratteristica.getCLSPESS().intValue() > 6000 && caratteristica.getSLLATOLP().substring(0, 1).equalsIgnoreCase("d")))
												));
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
