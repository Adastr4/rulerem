package it.profilglass.constraint.bav.SBADEFIMB.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 10, name = "ruleSBADEFIMB_10")

public class RuleSBADEFIMB_10 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result = Boolean.FALSE;

	@When
	public boolean when()
	{		
		/*return caratteristiche.stream().anyMatch(caratteristica -> Integer.parseInt(caratteristica.getCLLARG()) <= 10000 &&
																   Integer.parseInt(caratteristica.getCLLUNG()) <= 10000 &&
																   caratteristica.getSBATIPO() != 2);*/
		return !(	(  caratteristiche.stream().filter(caratteristica -> "SLTIPOPAL".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("X")
					&& caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("N")
			        )
					|| 
					(  !caratteristiche.stream().filter(caratteristica -> "SLTIPOPAL".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("X")
					&& caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("F")
					)
				);
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBADEFIMB 1 entered");
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

}
