package it.profilglass.constraint.bav.attivita;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.Attivita;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 21, name = "ruleLA21_1")

public class RuleLA21_21 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleLA_1 {
	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;

	@Override
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSPESS().intValue() > 240);
	}

	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("LA21"));
		return RuleState.NEXT;
	}
}
