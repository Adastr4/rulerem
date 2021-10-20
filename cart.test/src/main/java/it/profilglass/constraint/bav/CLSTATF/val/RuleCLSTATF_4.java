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

@Rule(order = 4, name = "ruleCLSTATF_4")

public class RuleCLSTATF_4{

	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private boolean result;

	@When
	public boolean when()
	{
		
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
																 && (caratteristica.getSLBPTE().equalsIgnoreCase("B07187") ||
																	 caratteristica.getSLBPTE().equalsIgnoreCase("B03835") ||
																	 caratteristica.getSLBPTE().equalsIgnoreCase("B07434")));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0,1).equalsIgnoreCase("3")
			&& !(   caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B07187")
				 || caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B03835")
				 || caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B03835"));
	}

	@Then
	public RuleState then()
	{
		return RuleState.BREAK;
	}
}
