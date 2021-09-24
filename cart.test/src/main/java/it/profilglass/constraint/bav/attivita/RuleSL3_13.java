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

@Rule(order = 13, name = "ruleSL3_1")

public class RuleSL3_13 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2{
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private List<Attivita> result;
	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().toString().equalsIgnoreCase("BP")
																				 && caratteristica.getQLLAVDET().toString().equalsIgnoreCase("B11")
																				 && caratteristica.getCLSPESS().intValue() <= 240);
	}
	
	@Then
	public RuleState then()
	{
		result.add(ReadDB.getAttivitaFromId("SL3"));
		return RuleState.NEXT;
	}
}
