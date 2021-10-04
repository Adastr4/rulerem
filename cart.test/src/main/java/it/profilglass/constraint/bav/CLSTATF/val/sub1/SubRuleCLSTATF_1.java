package it.profilglass.constraint.bav.CLSTATF.val.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleCLSTATF_1 {
	
	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getSLBPTE().equalsIgnoreCase(caratteristica.getSLBP().toString())
																&& caratteristica.getCLSTATF().equalsIgnoreCase("H14"));*/
		return caratteristiche.stream().filter(caratteristica -> "SLBPTE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase(caratteristiche.stream().filter(caratteristica -> "SLBP".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().toString())
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H14");
	}

	@Then
	public RuleState When()
	{
		return RuleState.NEXT;
	}

}
