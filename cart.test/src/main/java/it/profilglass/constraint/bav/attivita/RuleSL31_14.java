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


@Rule(order = 14, name = "ruleSL31_1")

public class RuleSL31_14 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2{
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SL31"));
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().toString().equalsIgnoreCase("BP")
																				 && caratteristica.getQLLAVDET().toString().equalsIgnoreCase("B11")
																				 && caratteristica.getCLSPESS().intValue() > 240);
	}
}
