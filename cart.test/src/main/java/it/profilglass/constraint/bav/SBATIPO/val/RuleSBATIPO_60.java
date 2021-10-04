package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 60, name = "ruleSBATIPO_60")

public class RuleSBATIPO_60 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 4);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 6 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
