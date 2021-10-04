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


@Rule(order = 27, name = "ruleGO1_1")

public class RuleGO1_27 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleGO_1 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("GO1"));
		return RuleState.NEXT;
	}

	@Override
	@When
	public boolean when()
	{
		return super.when();
	}
}
