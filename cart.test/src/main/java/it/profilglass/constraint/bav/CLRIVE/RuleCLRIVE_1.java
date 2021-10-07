package it.profilglass.constraint.bav.CLRIVE;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;

public class RuleCLRIVE_1 {
	@Given("caratteristica") 
	//private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@When
	public boolean when()
	{
		//return caratteristica.getCLFINI().equalsIgnoreCase("K") || caratteristica.getCLFINI().equalsIgnoreCase("Q") || caratteristica.getCLFINI().equalsIgnoreCase("W");
		return	caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("K")
			 ||	caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("Q")
			 || caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("W");
	}

	@Then
	public RuleState then()
	{
		result = caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("B");
		return RuleState.BREAK;
	}

}
