package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class SubRuleST_2 extends SubRuleSL_2 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Override
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
