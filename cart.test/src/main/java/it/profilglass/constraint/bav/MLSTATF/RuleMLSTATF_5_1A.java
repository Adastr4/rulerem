package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 5, name = "ruleMLSTATF_5")

public class RuleMLSTATF_5_1A {
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
		/*return ((caratteristica.getCLLEGA().equalsIgnoreCase("1A")) && 
=======
		return ((caratteristica.getCLLEGA().equalsIgnoreCase("1A")) &&
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
				 caratteristica.getCLRIVE().toString().equalsIgnoreCase("B") &&
				 caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00") &&
				 Integer.parseInt(caratteristica.getCLLARG().toString()) <= 6500 &&
				 Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 6500);*/
		return caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1A")
			&& caratteristiche.stream().filter(caratteristica -> "CLRIVE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("B")
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H00")
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 6500
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 6500;
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 5 entered");
		result = "H18";
		return RuleState.NEXT;
	}

}
