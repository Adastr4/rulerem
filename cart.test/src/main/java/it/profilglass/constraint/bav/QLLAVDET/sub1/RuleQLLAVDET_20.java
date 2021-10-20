package it.profilglass.constraint.bav.QLLAVDET.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class RuleQLLAVDET_20 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("D")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("Y");
				
	}

}
