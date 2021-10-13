package it.profilglass.constraint.bav.CLLARG.bigVal;

import java.util.ArrayList;
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

@Rule(order = 1, name = "ruleCLLARG_1")

public class RuleCLLARG_1 {
	@Given("Caratteristiche") 
	private List<Caratteristica> caratteristiche;
	@Given("Opzioni") 
	private List<Opzione> opzioni;

	@Result
	private List<Opzione> result = opzioni;

	@When
	public boolean when()
	{
		return (opzioni.stream().anyMatch(opzione -> Integer.parseInt(opzione.getOpzione()) > 2000)); //Da implementare quando diverranno effettive le nuove regole da applicare
	}

	@Then
	public RuleState then()
	{
		result = opzioni.stream().filter(opzione -> (Integer.parseInt(opzione.getOpzione()) > 2000)).toList();
		return RuleState.BREAK;
	}
}
