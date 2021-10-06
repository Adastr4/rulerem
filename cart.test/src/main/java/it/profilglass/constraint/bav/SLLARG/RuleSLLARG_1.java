package it.profilglass.constraint.bav.SLLARG;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleSLLARG_1")

public class RuleSLLARG_1 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private String result;

	@When
	public boolean when()
	{

		//return caratteristica.getCLLARG().equalsIgnoreCase("10000") || caratteristica.getCLLARG().equalsIgnoreCase("12500") || caratteristica.getCLLARG().equalsIgnoreCase("15000");
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 10000 
			|| Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 12500 
			|| Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 15000; 
	}

	@Then
	public RuleState then()
	{
		//result = caratteristica.getCLLARG();
		result = caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione();
		return RuleState.BREAK;
	}

}
