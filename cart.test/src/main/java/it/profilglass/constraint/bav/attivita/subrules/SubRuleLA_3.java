package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleLA_3 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2 {
	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type


	@Override
	@When
	public boolean when()
	{
		return !super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP"));
	}
}
