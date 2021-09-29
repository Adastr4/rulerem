package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleST_2 extends SubRuleSL_2 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																	 && (   caratteristica.getCLFINI().equalsIgnoreCase("I")
																		 ||	caratteristica.getCLFINI().equalsIgnoreCase("T")
																		 || caratteristica.getCLFINI().equalsIgnoreCase("U")
																		 || caratteristica.getCLFINI().equalsIgnoreCase("O"))
														) && !super.when();
	}
}