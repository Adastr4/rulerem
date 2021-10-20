package it.profilglass.constraint.bav.attivita.subrules;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class SubRuleST_1 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<Caratteristica> caratteristiche;

	@When
	public boolean when()
	{
		/*return caratteristiche.stream().anyMatch(caratteristica -> !caratteristica.getSLMOD().equalsIgnoreCase("BP")
																	 && (   caratteristica.getCLFINI().equalsIgnoreCase("I")
																		 ||	caratteristica.getCLFINI().equalsIgnoreCase("T")
																		 || caratteristica.getCLFINI().equalsIgnoreCase("U")
																		 || caratteristica.getCLFINI().equalsIgnoreCase("O"))
														);*/
		return !caratteristiche.stream().filter(caratteristica -> "SLMOD".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("BP")
			&& (   caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("I")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("T")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("U")
				|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("O")
				);
	}
}
