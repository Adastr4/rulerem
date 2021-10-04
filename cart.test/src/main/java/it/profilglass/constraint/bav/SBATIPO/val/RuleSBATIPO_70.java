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

@Rule(order = 70, name = "ruleSBATIPO_70")

public class RuleSBATIPO_70 {
<<<<<<< HEAD
	/*@Given 
	private List<CaratteristicaBean> caratteristiche;*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
=======
	@Given
	private List<CaratteristicaBean> caratteristiche;

>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@Result
	private Boolean result;

	@When
	public boolean when()
<<<<<<< HEAD
	{		
		//return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 6);
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) == 6;
=======
	{
		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 6);
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule SBATIPO 7 entered");
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
