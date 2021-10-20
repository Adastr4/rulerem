package it.profilglass.constraint.bav.DLLATOLP;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleDLLATOLP1")

public class RuleDLLATOLP_1 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return caratteristica.getSLTOLLA().equalsIgnoreCase("P"); //Da implementare quando diverranno effettive le nuove regole da applicare
		return caratteristiche.stream().filter(caratteristica -> "SLTOLLA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("P");
	}

	@Then
	public RuleState then()
	{
		//result = "0";
		result = new Opzione("0");
		return RuleState.BREAK;
	}
}
