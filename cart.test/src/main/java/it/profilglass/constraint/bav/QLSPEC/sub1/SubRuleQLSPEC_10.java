package it.profilglass.constraint.bav.QLSPEC.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

public class SubRuleQLSPEC_10 {
	@Given 
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "QLSPEC".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1;		   
	}
}
