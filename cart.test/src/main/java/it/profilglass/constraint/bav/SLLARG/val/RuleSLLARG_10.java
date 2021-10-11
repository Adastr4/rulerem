package it.profilglass.constraint.bav.SLLARG.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 10, name = "ruleSLLARG_10")

public class RuleSLLARG_10 {
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Boolean result;

	@When
	public boolean when()
	{

		//return caratteristica.getCLLARG().equalsIgnoreCase("10000") || caratteristica.getCLLARG().equalsIgnoreCase("12500") || caratteristica.getCLLARG().equalsIgnoreCase("15000");
		return true;
	}

	@Then
	public RuleState then()
	{
		//result = caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione();
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}