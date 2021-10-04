package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_3 {
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
<<<<<<< HEAD
		/*return caratteristica.getCLSTATF().equalsIgnoreCase("H24") ||
			   caratteristica.getCLSTATF().equalsIgnoreCase("H14");*/
		return caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H24")
			|| caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H14");
	}	
=======
		return caratteristica.getCLSTATF().equalsIgnoreCase("H24") ||
			   caratteristica.getCLSTATF().equalsIgnoreCase("H14");
	}
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
}
