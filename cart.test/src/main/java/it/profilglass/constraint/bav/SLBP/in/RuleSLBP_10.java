package it.profilglass.constraint.bav.SLBP.in;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;
import test.test.ReadDB;

@Rule(order = 10, name = "ruleSLBP_10")

public class RuleSLBP_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return true;
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
