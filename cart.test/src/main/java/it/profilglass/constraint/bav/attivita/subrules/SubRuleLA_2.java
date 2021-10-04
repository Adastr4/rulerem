package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class SubRuleLA_2 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type


	@Override
	@When
	public boolean when()
	{
		return !super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																                 &&  caratteristica.getQLLAVDET().equalsIgnoreCase("B11"));
	}
}
