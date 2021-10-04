package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 24, name = "ruleMLSTATF_24")

public class RuleMLSTATF_24_3Q {
<<<<<<< HEAD
	/*@Given("caratteristica")  
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;
=======
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git

	@Result
	private String result;


	@When
	public boolean when()
	{
<<<<<<< HEAD
			/*return  caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				   (caratteristica.getCLSPESS().intValue() >= 2000);*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3Q")
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) >= 2000;
			
=======
			return  caratteristica.getCLLEGA().equalsIgnoreCase("3Q") &&
				   (caratteristica.getCLSPESS().intValue() >= 2000);

>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 23 entered");
		//result = caratteristica.getCLSTATF();
		result = caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue();
		return RuleState.BREAK;
	}
}
