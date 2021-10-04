package it.profilglass.constraint.bav.attivita;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;
import test.test.Attivita;
import test.test.ReadDB;

@Rule(order = 8, name = "ruleTN4_1")

public class RuleTN4_8 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleTN_1 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSPESS().intValue() <= 400);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("TN4"));
		return RuleState.NEXT;
	}
}
