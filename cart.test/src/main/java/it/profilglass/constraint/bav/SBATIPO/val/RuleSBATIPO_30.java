package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 30, name = "ruleSBATIPO_30")

public class RuleSBATIPO_30 {
	/*@Given 
	private List<CaratteristicaBean> caratteristiche;*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{		
		//return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 2);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 2;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 3 entered");
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
