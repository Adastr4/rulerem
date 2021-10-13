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

@Rule(order = 2, name = "ruleCLFINI_2")

public class RuleCLFINI_2 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0{

	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().toString().equalsIgnoreCase("3D")
		//																		&& caratteristica.getCLSTATF().toString().equalsIgnoreCase("H12"));
		
		return super.when() && caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3D")
							&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H12");
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
