package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_4A {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		//return caratteristica.getCLLEGA().substring(0,1).equalsIgnoreCase("4A");
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("4A");
	}
}
