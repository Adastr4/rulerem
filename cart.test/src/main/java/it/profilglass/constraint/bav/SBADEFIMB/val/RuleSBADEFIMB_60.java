package it.profilglass.constraint.bav.SBADEFIMB.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 60, name = "ruleSBADEFIMB_60")

public class RuleSBADEFIMB_60 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{		
		/*return caratteristiche.stream().anyMatch(caratteristica -> Integer.parseInt(caratteristica.getCLLARG()) <= 10000 &&
																   Integer.parseInt(caratteristica.getCLLUNG()) <= 10000 &&
																   caratteristica.getSBATIPO() != 2);*/
		return !( Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 3
			   && Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) < 800
			   && (   caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(2,5).equalsIgnoreCase("001")
                  ||  caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(2,5).equalsIgnoreCase("022")			
			      )
			   );
			       
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBADEFIMB 6 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
