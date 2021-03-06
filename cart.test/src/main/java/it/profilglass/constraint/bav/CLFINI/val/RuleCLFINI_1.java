package it.profilglass.constraint.bav.CLFINI.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.ICaratteristica;

@Rule(order = 1, name = "ruleCLFINI_1")

public class RuleCLFINI_1 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0{

	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<ICaratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type


	@Result
	private boolean result;

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

	@Override
	@When
	public boolean when()
	{
		//return super.when() && !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLFINI().toString().equalsIgnoreCase("I")
		//																		 || caratteristica.getCLFINI().toString().equalsIgnoreCase("T")
		//																		 || caratteristica.getCLFINI().toString().equalsIgnoreCase("U")
		//																		 || caratteristica.getCLFINI().toString().equalsIgnoreCase("Y")
		//																		 || caratteristica.getCLFINI().toString().equalsIgnoreCase("O"));

		return super.when() && !(caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("I")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("T")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("U")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("Y")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("O"));
	}
}
