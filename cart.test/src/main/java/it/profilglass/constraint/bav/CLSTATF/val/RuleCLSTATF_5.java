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
	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private boolean result;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
																&& caratteristica.getSLBPTE().equalsIgnoreCase(caratteristica.getSLBP().toString())
																&& caratteristica.getCLSTATF().equalsIgnoreCase("H14"));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("3")
			&& caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase(caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione())
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H14");
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
