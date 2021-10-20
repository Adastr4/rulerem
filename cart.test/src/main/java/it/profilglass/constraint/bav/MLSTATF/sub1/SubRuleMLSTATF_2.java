package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_2 extends SubRuleMLSTATF_1 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Override
	@When
	public boolean when()
	{
		/*return super.when() && caratteristica.getDLDEST().substring(0, 3).equalsIgnoreCase("PEN") &&
							   caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00");*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "DLDEST".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().substring(0, 3).equalsIgnoreCase("PEN")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H00");
	}																
}
