package it.profilglass.constraint.bav.CLSTATF.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 3, name = "ruleCLSTATF_3")

public class RuleCLSTATF_3 {
	@Given
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@When
	public boolean when()
	{

		return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("3")
																 && !(caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("H00") ||
																	 caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("HA1") ||
																	 caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("H12") ||
																	 caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("H15") ||
																	 caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("H16") ||
																	 caratteristica.getCLSTATF().substring(0, 3).equalsIgnoreCase("H17")));
	}

	@Then
	public RuleState then()
	{
		return RuleState.BREAK;
	}

}
