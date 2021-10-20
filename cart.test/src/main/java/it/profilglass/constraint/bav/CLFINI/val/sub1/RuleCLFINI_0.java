package it.profilglass.constraint.bav.CLFINI.val.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

//import test.test.CaratteristicaBean;
import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.Opzione;

public class RuleCLFINI_0 {
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	@Given
	private List<Caratteristica> caratteristiche;
	
	@When
	public boolean when()
	{
		//return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLASSE().equalsIgnoreCase("EDT"));
		return !caratteristiche.stream().filter(caratteristica -> "SCAP".equals(caratteristica.getCaratteristica())).findAny().get().getSelectedValue().getDescrizione().equalsIgnoreCase("EDT");
		//return true;
	}
}
