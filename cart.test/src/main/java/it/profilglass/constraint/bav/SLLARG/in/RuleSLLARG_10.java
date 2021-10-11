package it.profilglass.constraint.bav.SLLARG.in;

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
	private Boolean result = Boolean.TRUE;

	@When
	public boolean when()
	{

		//return caratteristica.getCLLARG().equalsIgnoreCase("10000") || caratteristica.getCLLARG().equalsIgnoreCase("12500") || caratteristica.getCLLARG().equalsIgnoreCase("15000");
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) >= 10000
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) > 10000;
	}

	@Then
	public RuleState then()
	{
		//result = caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione();
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
