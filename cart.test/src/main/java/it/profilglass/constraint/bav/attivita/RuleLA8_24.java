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

@Rule(order = 24, name = "ruleLA8_1")

public class RuleLA8_24 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleLA_3 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getQLLAVDET().equalsIgnoreCase("E01")
																				&& caratteristica.getCLSPESS().intValue() <= 3000);
	}
	
	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("LA8"));
		return RuleState.NEXT;
	}
}