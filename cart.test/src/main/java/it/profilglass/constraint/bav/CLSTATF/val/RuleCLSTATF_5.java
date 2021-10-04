package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 5, name = "ruleCLSTATF_5")

public class RuleCLSTATF_5 {
<<<<<<< HEAD
	
	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;
	
=======

	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@Result
	private boolean result;

	@When
	public boolean when()
	{
<<<<<<< HEAD
		
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
=======

		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
																&& caratteristica.getSLBPTE().equalsIgnoreCase(caratteristica.getSLBP().toString())
																&& caratteristica.getCLSTATF().equalsIgnoreCase("H14"));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(0,1).equalsIgnoreCase("3")
			&& caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase(caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue())
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H14");
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
