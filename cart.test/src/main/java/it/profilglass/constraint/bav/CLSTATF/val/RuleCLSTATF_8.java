package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 8, name = "ruleCLSTATF_8")

public class RuleCLSTATF_8 extends it.profilglass.constraint.bav.CLSTATF.val.sub1.SubRuleCLSTATF_2{
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

	@Override
	@When
	public boolean when()
	{

		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("4")) && super.when();
	}

}
