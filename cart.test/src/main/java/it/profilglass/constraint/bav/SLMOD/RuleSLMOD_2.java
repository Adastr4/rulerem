package it.profilglass.constraint.bav.SLMOD;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

@Rule(order = 2, name = "ruleSLMOD2")

public class RuleSLMOD_2 {
	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private String result;

	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> (   caratteristica.getCLLEGA().equalsIgnoreCase("1A")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("1K")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("1O")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("1P")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("1Q")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("4A")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("4D")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("4D")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("3H")
																	|| caratteristica.getCLLEGA().equalsIgnoreCase("3Q"))
																&& caratteristica.getMLSTATF().equalsIgnoreCase("H18")
																&& (   caratteristica.getCLSTATF().equalsIgnoreCase("H00")
																	|| caratteristica.getCLSTATF().equalsIgnoreCase("H11"))
																&& caratteristica.getCLSPESS().intValue() <= 2500
																&& caratteristica.getCLRIVE().equalsIgnoreCase("B")
																); //Da implementare quando diverranno effettive le nuove regole da applicare
	}

	@Then
	public RuleState then()
	{
		result = "BP";
		return RuleState.BREAK;
	}
}
