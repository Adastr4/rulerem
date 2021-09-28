package it.profilglass.constraint.bav.SBATIPO.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 90, name = "ruleSBATIPO_90")

public class RuleSBATIPO_80 {
	@Given 
	private List<CaratteristicaBean> caratteristiche;
	
	@Result
	private Boolean result;
	
	@When
	public boolean when()
	{		
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 5 && !(
																		caratteristica.getSLBP().equalsIgnoreCase("B05603") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03644") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B02255") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03752") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B03900") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B04695") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B00380") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B01525") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B04559") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B07289") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B02786") ||
																		caratteristica.getSLBP().equalsIgnoreCase("B06468")
																		));
	}
	
	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 9 entered");
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
