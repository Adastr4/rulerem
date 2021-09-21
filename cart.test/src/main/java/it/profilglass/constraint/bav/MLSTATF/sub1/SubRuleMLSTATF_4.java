package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.When;

import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_4 {
	@Given 
	private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	
	@When
	public boolean when()
	{
		return caratteristiche.stream().anyMatch(caratteristica -> (caratteristica.getCLSPESS().intValue() <= 1000) &&
																   (caratteristica.getCLSPESS().intValue() >= 400)
												);
	}
}
