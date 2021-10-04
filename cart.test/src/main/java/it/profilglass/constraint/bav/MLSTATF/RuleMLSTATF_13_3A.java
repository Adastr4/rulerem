package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 13, name = "ruleMLSTATF_13")

public class RuleMLSTATF_13_3A {
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
		/*return (caratteristica.getCLLEGA().equalsIgnoreCase("3A") && 
				caratteristica.getCLSTATF().equalsIgnoreCase("H14"));*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("3A")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H14");
=======
		return (caratteristica.getCLLEGA().equalsIgnoreCase("3A") &&
				caratteristica.getCLSTATF().equalsIgnoreCase("H14"));
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 13 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
