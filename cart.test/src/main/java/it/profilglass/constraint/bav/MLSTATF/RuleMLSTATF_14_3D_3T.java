package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 14, name = "ruleMLSTATF_14")

public class RuleMLSTATF_14_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3D_3T{
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

	@Override
	@When
	public boolean when()
	{
		//return (caratteristica.getCLSTATF().equalsIgnoreCase("H14")) && super.when();
		return super.when()
			&& caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H14");
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 14 entered");
		result = "H24";
		return RuleState.NEXT;
	}
}
