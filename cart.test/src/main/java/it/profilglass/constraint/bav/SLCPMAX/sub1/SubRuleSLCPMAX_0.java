package it.profilglass.constraint.bav.SLCPMAX.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;

public class SubRuleSLCPMAX_0 {
	/*@Given("caratteristica") 
	private CaratteristicaBean caratteristica;*/ //Annotated Lists get injected with all Facts of the declared generic type
	
	@Given
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		/*return Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000 && 
			   Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000;*/
		return Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "SLTMAX".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione()) == 1;
				
	}
}