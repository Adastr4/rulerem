package it.profilglass.constraint.bav.SLLATOLN.val;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 3, name = "ruleSLTOLLA3")

public class RuleSTOLLA_3 {
	/*@Given
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Result
	private boolean result;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica -> !((caratteristica.getSLTOLLA().equalsIgnoreCase("f")
															    	 &&  caratteristica.getSLLATOLN().substring(2, 3).equalsIgnoreCase("f")
															    	 &&  caratteristica.getSLLATOLN().substring(4, caratteristica.getSLLATOLN().length()).equalsIgnoreCase(caratteristica.getDLLATOLN().toString())
															    	)
															    	||
															    	(!caratteristica.getSLTOLLA().equalsIgnoreCase("f")
															    	 &&  caratteristica.getSLLATOLN().substring(2, 3).equalsIgnoreCase(caratteristica.getSLTOLLA())
															    	 &&  !caratteristica.getSLLATOLN().substring(2, 3).equalsIgnoreCase("f")
															    	))
												);*/
		return !((   caratteristiche.stream().filter(caratteristica -> "SLTOLLA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("f")
				 && caratteristiche.stream().filter(caratteristica -> "SLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(2,3).equalsIgnoreCase("f")
				 && caratteristiche.stream().filter(caratteristica -> "SLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(4,caratteristiche.stream().filter(caratteristica -> "SLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().length()).equalsIgnoreCase(caratteristiche.stream().filter(caratteristica -> "DLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().toString())
				 )
			|| (    !caratteristiche.stream().filter(caratteristica -> "SLTOLLA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("f")
				 && caratteristiche.stream().filter(caratteristica -> "SLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(2,3).equalsIgnoreCase(caratteristiche.stream().filter(caratteristica -> "SLTOLLA".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue())
				 && !caratteristiche.stream().filter(caratteristica -> "SLLATOLN".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().substring(2,3).equalsIgnoreCase("f")
				));
	}

	@Then
	public RuleState then()
	{
		result = Boolean.FALSE;
		return RuleState.BREAK;
	}

}
