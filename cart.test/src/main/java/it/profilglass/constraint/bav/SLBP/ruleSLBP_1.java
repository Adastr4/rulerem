package it.profilglass.constraint.bav.SLBP;

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
import test.test.ReadDB;

@Rule(order = 1, name = "ruleSLBP_1")

public class ruleSLBP_1 {
	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return ReadDB.getSLBPSpecial(caratteristica.getSLBPTE().toString(), "BAV"); //Da implementare quando diverr� effettivo il legame tra la lega ed il codice ARTICOLO da configurare
		return ReadDB.getSLBPSpecial(caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().toString(), "BAV");
	}

	@Then
	public RuleState then()
	{
		//result = caratteristica.getSLBPTE().toString();
		//result = caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().toString();
		result = caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue();
		return RuleState.BREAK;
	}

}
