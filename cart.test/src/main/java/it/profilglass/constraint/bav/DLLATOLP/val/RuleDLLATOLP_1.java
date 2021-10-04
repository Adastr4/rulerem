package it.profilglass.constraint.bav.DLLATOLP.val;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name = "ruleDLLATOLP1")

public class RuleDLLATOLP_1 extends it.profilglass.constraint.bav.DLLATOLP.RuleDLLATOLP_1 {
	@Given("caratteristica")
	private ICaratteristica caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private Boolean result;

	@Override
	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

	@Override
	@When
	public boolean when()
	{
		return !super.when(); //Da implementare quando diverranno effettive le nuove regole da applicare
	}

}
