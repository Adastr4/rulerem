package it.profilglass.constraint.bav.CLFINI.val.sub1;

import java.util.List;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.ICaratteristica;

public class RuleCLFINI_0 {
	@Given
	//private List<CaratteristicaBean> caratteristiche; //Annotated Lists get injected with all Facts of the declared generic type
	private List<ICaratteristica> caratteristiche;

	@When
	public boolean when()
	{
		//return !caratteristiche.stream().anyMatch(caratteristica -> caratteristica.getCLASSE().equalsIgnoreCase("EDT"));
		//return !caratteristiche.stream().filter(caratteristica -> "CLASSE".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("EDT");
		return true;
	}
}
