package it.profilglass.constraint.bav.SBADEFIMB.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 40, name = "ruleSBADEFIMB_40")

public class RuleSBADEFIMB_40 extends it.profilglass.constraint.bav.SBADEFIMB.sub1.SubRuleSBADEFIMB_0 {
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
		return super.when()
			&& 	(  caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("C")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("D")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("E")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("G")
				)
			&&
			   caratteristiche.stream().filter(caratteristica -> "SBADEFIMB".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(1,6).equalsIgnoreCase("N003C");
			       
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBADEFIMB 4 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
