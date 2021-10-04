package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 10, name = "ruleSBATIPO_10")

public class RuleSBATIPO_10 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> Integer.parseInt(caratteristica.getCLLARG()) <= 10000 &&
																   Integer.parseInt(caratteristica.getCLLUNG()) <= 10000 &&
																   caratteristica.getSBATIPO() != 2);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 1 entered");
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
