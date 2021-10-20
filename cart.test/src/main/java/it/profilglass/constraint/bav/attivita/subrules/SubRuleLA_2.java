package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleLA_2 extends it.profilglass.constraint.bav.attivita.subrules.SubRuleSL_2 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;


	@Override
	@When
	public boolean when()
	{
		/*return !super.when() && caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																                 &&  caratteristica.getQLLAVDET().equalsIgnoreCase("B11"));*/
		
		return !super.when()
			&& !caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP")
			&& caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("B11");
	}
}
