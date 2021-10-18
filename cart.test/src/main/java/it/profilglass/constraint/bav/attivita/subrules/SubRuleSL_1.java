package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class SubRuleSL_1 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;


	@When
	public boolean when()
	{
		//return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getQLLAVDET().equalsIgnoreCase("K01"))
		return caratteristiche.stream().filter(caratteristica -> "QLLAVDET".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("K01");
	}
}
