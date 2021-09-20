package it.profilglass.constraint.bav.SLBP;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 1, name = "ruleSLBP_1")

public class ruleSLBP_1 {
	@Given 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;
	
	@When
	public boolean when()
	{
		return ReadDB.getSLBPSpecial(caratteristica.getSLBPTE().toString(), "BAV"); //Da implementare quando diverrà effettivo il legame tra la lega ed il codice ARTICOLO da configurare
	}
	
	@Then
	public RuleState then()
	{
		result = caratteristica.getSLBPTE().toString();
		return RuleState.BREAK;
	}

}
