package it.profilglass.constraint.bav.QLLAVDET.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class RuleQLLAVDET_10 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("L")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("E")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("U")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("F")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("O");
				
	}

}
