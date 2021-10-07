package it.profilglass.constraint.bav.MLSTATF;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;
import test.test.CaratteristicaBean;

@Rule(order = 18, name = "ruleMLSTATF_18")

public class RuleMLSTATF_18_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private Opzione result;

	@Override
	@When
	public boolean when()
	{
		/*return ((caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
				 caratteristica.getCLLEGA().equalsIgnoreCase("3T")) &&
					(caratteristica.getCLSTATF().equalsIgnoreCase("H22") ||
					 caratteristica.getCLSTATF().equalsIgnoreCase("H23") ||
					 caratteristica.getCLSTATF().equalsIgnoreCase("H24"))
				) && !super.when();*/
		return !super.when()
			&&	((   caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3T")
				 || caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3D")
				)
			&&  (	caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H22")
				 || caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H23")
				 || caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("H24")	
				));
	}

	@Then
	public RuleState then()
	{
		System.out.println("Rule 17 entered");
		//result = "H24";
		result = caratteristiche.stream().filter(caratteristica -> "MLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getOpzioneFromOpzioneList("H24");
		return RuleState.NEXT;
	}
}
