package it.profilglass.constraint.bav.SLLATOLP.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 2, name = "ruleCLLARG2")

public class RuleCLLARG_2 {

	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> !(((Integer.parseInt(caratteristica.getCLLARG()) <= 1000 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("a"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 1000 && Integer.parseInt(caratteristica.getCLLARG()) <= 3000 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("b"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 3000 && Integer.parseInt(caratteristica.getCLLARG()) <= 5000 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("c"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 5000 && Integer.parseInt(caratteristica.getCLLARG()) <= 9000 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("d"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 9000 && Integer.parseInt(caratteristica.getCLLARG()) <= 10000 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("e"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 10000 && Integer.parseInt(caratteristica.getCLLARG()) <= 12500 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("f"))
																|| (Integer.parseInt(caratteristica.getCLLARG()) > 12500 && Integer.parseInt(caratteristica.getCLLARG()) <= 16500 && caratteristica.getSLLATOLP().substring(1, 2).equalsIgnoreCase("g"))
												)));
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

}
