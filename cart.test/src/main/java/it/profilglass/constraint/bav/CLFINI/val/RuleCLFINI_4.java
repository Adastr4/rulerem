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

@Rule(order = 4, name = "ruleCLFINI_4")

public class RuleCLFINI_4 extends it.profilglass.constraint.bav.CLFINI.val.sub1.RuleCLFINI_0 {

	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;


	@Result
	private boolean result;

	@Override
	@When
	public boolean when()
	{
		//return super.when() && !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLLEGA().toString().equalsIgnoreCase("1A")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1K")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1O")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1P")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("1Q")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3A")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3C")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3H")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3G")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3B")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3P")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3M")
		//																		|| caratteristica.getCLLEGA().toString().equalsIgnoreCase("3O"));
		return super.when() && !(     caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1A")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1K")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1O")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1P")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1Q")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3A")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3C")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3H")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3G")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3B")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3P")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3M")
			     				 ||   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3O")
			    				);
	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
