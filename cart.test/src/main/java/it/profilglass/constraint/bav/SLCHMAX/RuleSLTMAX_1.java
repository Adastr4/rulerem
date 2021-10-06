package it.profilglass.constraint.bav.SLCHMAX;

import java.util.List;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;

@Rule(order = 1, name = "ruleSLTMAX1")

public class RuleSLTMAX_1 extends it.profilglass.constraint.bav.SLCHMAX.val.RuleSLTMAX_1 {

	private Double hImballi;

	/*@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	@Given
	private List<Caratteristica> caratteristiche;

	@Given("pesoSpec")
	private Double pesoSpec;

	@Given("hPallet")
	private Double hPallet;

	@Given("quantKgImballi")
	private Double quantKgImballi;

	@Result
	private Double result;

	@Override
	@When
	public boolean when()
	{
		return !super.when();
	}

	@Override
	@Then
	public RuleState then()
	{
		
		//hImballi = ((Double.parseDouble(caratteristica.getCLLARG())/10000)*(Double.parseDouble(caratteristica.getCLLUNG())/10000));
		hImballi = ((Double.parseDouble(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione())/10000)*(Double.parseDouble(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().getOpzione())/10000));
		hImballi = (quantKgImballi/(hImballi*pesoSpec));
		result = hImballi*1000 + hPallet;
		return RuleState.BREAK;
	}

}
