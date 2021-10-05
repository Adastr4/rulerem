package it.profilglass.constraint.bav.SLLARG;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleSLLARG_2")

public class RuleSLLARG_2 extends RuleSLLARG_1 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	@Override
	@When
	public boolean when()
	{

		return !super.when();
	}

	@Override
	@Then
	public RuleState then()
	{
		result = "99999";
		return RuleState.BREAK;
	}
}
