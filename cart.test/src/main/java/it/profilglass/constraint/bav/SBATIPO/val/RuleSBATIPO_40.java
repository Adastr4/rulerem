package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 40, name = "ruleSBATIPO_40")

public class RuleSBATIPO_40 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 1 &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("C") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("D") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("E") &&
																   !caratteristica.getCLFINI().equalsIgnoreCase("G"));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 4 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
