package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 20, name = "ruleSBATIPO_20")

public class RuleSBATIPO_20 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private Boolean result;

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 2 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 3);
	}
}
