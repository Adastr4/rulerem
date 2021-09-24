package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.Attivita;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

public class SubRuleSL_2 extends SubRuleSL_1 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	
	@When
	public boolean when()
	{
		return super.when() && caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLFINI().equalsIgnoreCase("I")
																				 && caratteristica.getCLSPESS().intValue() >= 1500
																				 && caratteristica.getCLSPESS().intValue() <= 2000)
																			  ||   (caratteristica.getCLFINI().equalsIgnoreCase("U")
																				 &&	caratteristica.getCLSPESS().intValue() <= 2000)
																);
	}
}
