package it.profilglass.constraint.bav.MLSTATF;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleMLSTATF_1")

public class RuleMLSTATF_1_1O_1Q extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_3 {

<<<<<<< HEAD
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica;*/
	@Given
	private List<Caratteristica> caratteristiche;
=======
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	@Given("caratteristica")
	private CaratteristicaBean caratteristica;
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git

	@Result
	private String result;

	@Override
	@When
	public boolean when()
<<<<<<< HEAD
	{		
		/*return super.when() && (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000")) ||
							   (caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000"));*/
		return super.when()
			&& (caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1O")
					&& caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("4000")
				)
			|| (caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("1Q")
					&& caratteristiche.stream().filter(caratteristica -> "CLSPESS".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("2000")
				);
=======
	{
		return super.when() && (caratteristica.getCLLEGA().equalsIgnoreCase("1O") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("4000")) ||
							   (caratteristica.getCLLEGA().equalsIgnoreCase("1Q") && caratteristica.getCLSPESS().toString().equalsIgnoreCase("2000"));
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 1 entered");
		result = "H14";
		return RuleState.NEXT;
	}

}
