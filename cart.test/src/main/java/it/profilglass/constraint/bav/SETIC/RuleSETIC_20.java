package it.profilglass.constraint.bav.SETIC;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 20, name = "ruleSETIC_20")

public class RuleSETIC_20 {
	@Given
	private List<ICaratteristica> caratteristiche;

	@Result
	private String result;

	@When
	public boolean when()
	{
		return (caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSETICC() == 2));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SETIC 2 entered");
		result = "Senza Logo";
		return RuleState.BREAK;
	}
}
