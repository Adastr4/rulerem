package it.profilglass.constraint.bav.CLSTATF.val.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 1001, name = "SubRuleCLSTATF_2")

public class SubRuleCLSTATF_2 {
<<<<<<< HEAD
	@Given 
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;
	
=======
	@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type

>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@When
	public boolean when()
	{
		//return caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLSTATF().substring(1,2).equalsIgnoreCase("H3"));
		return caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(1,2).equalsIgnoreCase("H3");
	}

	@Then
	public RuleState When()
	{
		return RuleState.NEXT;
	}

}
