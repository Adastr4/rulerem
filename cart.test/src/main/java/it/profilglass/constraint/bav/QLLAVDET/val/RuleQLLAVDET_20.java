package it.profilglass.constraint.bav.QLLAVDET.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

@Rule(order = 20, name = "ruleQLLAVDET_20")

public class RuleQLLAVDET_20 extends it.profilglass.constraint.bav.QLLAVDET.sub1.RuleQLLAVDET_20 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result;

	@When
	public boolean when()
	{
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(1,2).equalsIgnoreCase("1");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule QLLAVDET 2 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
