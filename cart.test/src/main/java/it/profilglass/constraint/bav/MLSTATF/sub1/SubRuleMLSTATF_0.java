package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_0 {
<<<<<<< HEAD
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica;*/ //Annotated Lists get injected with all Facts of the declared generic type
	
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
		/*return Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000 && 
			   Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000;*/
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 10000
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 10000;
				
	}	
=======
		return Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000 &&
			   Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000;
	}
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
}
