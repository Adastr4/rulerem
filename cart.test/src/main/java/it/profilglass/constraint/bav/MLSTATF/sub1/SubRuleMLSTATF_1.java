package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_1 extends SubRuleMLSTATF_0 {
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
		//return super.when() && caratteristica.getCLRIVE().equalsIgnoreCase("B");
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B");
	}	
=======
		return super.when() && caratteristica.getCLRIVE().equalsIgnoreCase("B");
	}
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git

}
