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

@Rule(order = 20, name = "ruleSBATIPO_20")

public class RuleSBATIPO_20 {
	/*@Given 
	private List<CaratteristicaBean> caratteristiche;*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{		
		//return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 3);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 3;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 2 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
