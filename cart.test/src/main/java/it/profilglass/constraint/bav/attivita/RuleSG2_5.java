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

@Rule(order = 5, name = "ruleSG2_1")

public class RuleSG2_5 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSG_1 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																			    && caratteristica.getCLSPESS().intValue() <= 400
																			    && caratteristica.getQLLAV().equalsIgnoreCase("N"));
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SG2"));
		return RuleState.NEXT;
	}
}
