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

@Rule(order = 23, name = "ruleLA3_1")

public class RuleLA31_23 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleLA_2 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSPESS().intValue() > 240);
	}
	
	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("LA31"));
		return RuleState.NEXT;
	}
}
