package it.profilglass.constraint.bav.QLLAVDET.vis;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class RuleQLLAVDET_10 {
	@Given
	private List<Caratteristica> caratteristiche;
	
	@Result
	private Boolean result = Boolean.FALSE;

	@When
	public boolean when()
	{
		return caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("L")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("D")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("E")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("F")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("U")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("Y")
			|| caratteristiche.stream().filter(caratteristica -> "CLFINI".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("O");

	}

	@Then
	public RuleState then()
	{
		result = Boolean.TRUE;
		return RuleState.BREAK;
	}
}
