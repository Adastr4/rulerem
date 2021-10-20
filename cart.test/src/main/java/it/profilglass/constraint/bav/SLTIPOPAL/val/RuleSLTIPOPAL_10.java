package it.profilglass.constraint.bav.SLTIPOPAL.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 10, name = "RuleSLTIPOPAL_10")

public class RuleSLTIPOPAL_10 {
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
		return (   (   Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 3
				    || Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == 4
				   )
				&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTIPOPAL".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(1,2)) == 1
			   )
			|| (   Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione()) == Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTIPOPAL".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(1,2))
			   );
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SLTIPOPAL 1 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
