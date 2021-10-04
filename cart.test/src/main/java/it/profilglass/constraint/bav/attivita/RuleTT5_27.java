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


@Rule(order = 27, name = "ruleTT5_1")

public class RuleTT5_27 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLMOD().equalsIgnoreCase("BP"));
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("TT5"));
		return RuleState.NEXT;
	}
}
