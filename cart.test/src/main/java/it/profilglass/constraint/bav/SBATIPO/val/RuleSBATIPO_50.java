package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 50, name = "ruleSBATIPO_50")

public class RuleSBATIPO_50 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private Boolean result; //DA FINIRE LE REGOLE

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 1 &&
																   (	   caratteristica.getCLFINI().equalsIgnoreCase("C") ||
																		   caratteristica.getCLFINI().equalsIgnoreCase("D") ||
																		   caratteristica.getCLFINI().equalsIgnoreCase("E") ||
																		   caratteristica.getCLFINI().equalsIgnoreCase("G"))
												);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 5 entered");
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
