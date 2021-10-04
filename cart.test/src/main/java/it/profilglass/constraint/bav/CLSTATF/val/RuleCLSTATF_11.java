package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 11, name = "ruleCLSTATF_11")

public class RuleCLSTATF_11 extends it.profilglass.constraint.bav.CLSTATF.val.sub1.SubRuleCLSTATF_2{
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{

		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("6") && (caratteristica.getCLSTATF().equalsIgnoreCase("T04") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("T06") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("T4P") ||
																																	   caratteristica.getCLSTATF().equalsIgnoreCase("H00"))) && !super.when();
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
