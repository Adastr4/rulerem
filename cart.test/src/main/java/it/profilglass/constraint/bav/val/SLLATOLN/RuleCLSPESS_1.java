package it.profilglass.constraint.bav.val.SLLATOLN;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleCLSPESS1")

public class RuleCLSPESS_1 extends it.profilglass.constraint.bav.val.SLLATOLP.RuleCLSPESS_1{
	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;
	
	@When
	public boolean when()
	{
		return super.when();
	}
	
	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

}
