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

@Rule(order = 3, name = "ruleCLFINI_3")

public class RuleCLFINI_3 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0 {

	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().toString().substring(1, 3).equalsIgnoreCase("00")
		//																		|| caratteristica.getCLSTATF().toString().substring(1, 3).equalsIgnoreCase("A1"));
		return super.when() && !(     caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("00")
							     ||   caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("A1")
							    );
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}

}
