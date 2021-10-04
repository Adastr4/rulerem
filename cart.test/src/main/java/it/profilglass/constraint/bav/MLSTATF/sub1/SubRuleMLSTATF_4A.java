package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_4A {
<<<<<<< HEAD
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
=======
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@When
	public boolean when()
	{
		//return caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("4A");
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("4A");
	}
}
