package it.profilglass.constraint.bav.CLFINI.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

//import test.test.CaratteristicaBean;
import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

@Rule(order = 5, name = "ruleCLFINI_5")

public class RuleCLFINI_5 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0 {

	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().toString().equalsIgnoreCase("F")
		//																		|| caratteristica.getCLFINI().toString().equalsIgnoreCase("N"));
		return !super.when() && (   caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("F")
				   				 || caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("N"));
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
