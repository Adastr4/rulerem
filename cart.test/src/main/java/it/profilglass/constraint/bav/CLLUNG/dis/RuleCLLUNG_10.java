package it.profilglass.constraint.bav.CLLUNG.dis;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 10, name = "RuleCLLUNG_10")

public class RuleCLLUNG_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return true; //Da implementare quando diverranno effettive le nuove regole da applicare
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
