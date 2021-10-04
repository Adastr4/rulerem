package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_2 extends SubRuleMLSTATF_1 {
<<<<<<< HEAD
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;
	
=======
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Override
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@When
	public boolean when()
	{
<<<<<<< HEAD
		/*return super.when() && caratteristica.getDLDEST().substring(0, 3).equalsIgnoreCase("PEN") &&
							   caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00");*/
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "DLDEST".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(0, 3).equalsIgnoreCase("PEN")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H00");
	}																
=======
		return super.when() && caratteristica.getDLDEST().substring(0, 3).equalsIgnoreCase("PEN") &&
							   caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00");
	}
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
}
