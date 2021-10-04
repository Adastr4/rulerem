package it.profilglass.constraint.bav.attivita;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Attivita;
import it.profilglass.classmodel.ICaratteristica;
import it.profilglass.classmodel.ReadDB;


@Rule(order = 12, name = "ruleSL21_1")

public class RuleSL21_12 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2{
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().toString().equalsIgnoreCase("BP")
																				 && caratteristica.getQLLAVDET().toString().equalsIgnoreCase("A01")
																				 && caratteristica.getCLSPESS().intValue() > 240);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SL21"));
		return RuleState.NEXT;
	}
}
