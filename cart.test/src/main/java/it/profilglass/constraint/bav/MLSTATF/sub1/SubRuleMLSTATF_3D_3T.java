package it.profilglass.constraint.bav.MLSTATF.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

public class SubRuleMLSTATF_3D_3T extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;

	@Override
	@When
	public boolean when()
	{
		/*return (caratteristica.getCLLEGA().equalsIgnoreCase("3D") ||
				caratteristica.getCLLEGA().equalsIgnoreCase("3T")) && super.when();*/
		return super.when()
			   && (		caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3D")
					 || caratteristiche.stream().filter(caratteristica -> "CLLEGA".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getOpzione().equalsIgnoreCase("3T")
				  );
	}

}
