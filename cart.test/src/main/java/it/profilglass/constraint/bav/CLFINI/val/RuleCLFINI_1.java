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

@Rule(order = 1, name = "ruleCLFINI_1")

public class RuleCLFINI_1 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0{

	//private List<Caratteristica> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	@Given() 
	private List<Caratteristica> caratteristiche;


	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{
		
		return super.when() && !(caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("I")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("T")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("U")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("Y")
								|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("O"));	
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}
}
