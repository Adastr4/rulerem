package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleSG_1 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	
	@When
	public boolean when()
	{
		return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().equalsIgnoreCase("D")
																 || caratteristica.getCLFINI().equalsIgnoreCase("S")
																 || caratteristica.getCLFINI().equalsIgnoreCase("Y"));
	}
}