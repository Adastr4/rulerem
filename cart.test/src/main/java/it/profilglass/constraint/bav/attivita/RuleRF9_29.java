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


@Rule(order = 29, name = "ruleRF9_1")

public class RuleRF9_29 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLMOD().equalsIgnoreCase("BA")
																&& (	caratteristica.getCLFINI().equalsIgnoreCase("B")
																	 || caratteristica.getCLFINI().equalsIgnoreCase("M") // NON COMPLETA ANCORA; manca la regola dell'SLLANAS
																	)
																&& Integer.parseInt(caratteristica.getCLLARG()) >= 8500
																&& caratteristica.getCLSPESS().intValue() >= 500
																&& caratteristica.getCLSPESS().intValue() < 1000);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("RF9"));
		return RuleState.NEXT;
	}
}
