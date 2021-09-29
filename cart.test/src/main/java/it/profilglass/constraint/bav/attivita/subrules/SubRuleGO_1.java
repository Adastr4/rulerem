package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;
import test.test.CaratteristicaBean;

public class SubRuleGO_1 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																&&  	(caratteristica.getCLFINI().equalsIgnoreCase("C")
																	  || caratteristica.getCLFINI().equalsIgnoreCase("D")
																	  || caratteristica.getCLFINI().equalsIgnoreCase("E")
																	  || caratteristica.getCLFINI().equalsIgnoreCase("G"))
																&& caratteristica.getCLSPESS().intValue() <= 1500);
	}
}