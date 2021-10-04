package it.profilglass.constraint.bav.MLSTATF.sub1;

import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.When;

import it.profilglass.classmodel.Caratteristica;
import test.test.CaratteristicaBean;


public class SubRuleMLSTATF_4A_2 extends it.profilglass.constraint.bav.MLSTATF.sub1.SubRuleMLSTATF_4A {
<<<<<<< HEAD
	/*@Given("caratteristica")  
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type*/
	
	@Given
	private List<Caratteristica> caratteristiche;
	
=======
	@Given("caratteristica")
	private CaratteristicaBean caratteristica; //Annotated Lists get injected with all Facts of the declared generic type

	@Override
>>>>>>> branch 'filippoBranch' of ssh://git@github.com/Adastr4/rulerem.git
	@When
	public boolean when()
	{
		/*return super.when() && (Integer.parseInt(caratteristica.getCLLARG().toString()) <= 10000)
							&& (Integer.parseInt(caratteristica.getCLLUNG().toString()) <= 10000)
							&& (	   caratteristica.getCLSTATF().toString().equalsIgnoreCase("HA1")
									|| caratteristica.getCLSTATF().toString().equalsIgnoreCase("H00"));*/
		
		return super.when()
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLARG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 10000
			&& Integer.parseInt(caratteristiche.stream().filter(caratteristica -> "CLLUNG".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue()) <= 10000
			&& (	caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("HA1")
				||  caratteristiche.stream().filter(caratteristica -> "CLSTATF".equals(caratteristica.getCaratteristicaId())).findAny().get().getSelectedValue().equalsIgnoreCase("H00")
				);
	}
}
