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

@Rule(order = 3, name = "ruleST21_1")

public class RuleST21_3 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleST_2 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSPESS().intValue() > 600
																				&& caratteristica.getCLSPESS().intValue() <= 1490);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("ST21"));
		return RuleState.NEXT;
	}
}
