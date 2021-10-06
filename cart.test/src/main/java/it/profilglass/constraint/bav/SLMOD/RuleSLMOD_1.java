package it.profilglass.constraint.bav.SLMOD;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleSLMOD1")

public class RuleSLMOD_1 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	@When
	public boolean when()
	{
		//return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSBATIPO() == 2); //Da implementare quando diverranno effettive le nuove regole da applicare
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SBATIPO".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 2;
	}

	@Then
	public RuleState then()
	{
		result = "BA";
		return RuleState.BREAK;
	}
}
